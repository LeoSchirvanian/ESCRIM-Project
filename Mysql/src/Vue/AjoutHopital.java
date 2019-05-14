package Vue;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import java.awt.Choice;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.border.LineBorder;

import Controleur.Controleur;

public class AjoutHopital extends JFrame {

	//ATTRIBUTS
	private JPanel contentPane;
	private JTextField textField;

	//CONSTRUCTEUR
	public AjoutHopital() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 325);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblAjoutHpital = new JLabel("Ajout H\u00F4pital");
		lblAjoutHpital.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblAjoutHpital.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblAjoutHpital, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNomHpital = new JLabel("Nom H\u00F4pital");
		lblNomHpital.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomHpital.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblNomHpital.setBounds(0, 26, 130, 30);
		panel.add(lblNomHpital);
		
		textField = new JTextField();
		textField.setBounds(121, 32, 130, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblModules = new JLabel("Modules");
		lblModules.setHorizontalAlignment(SwingConstants.CENTER);
		lblModules.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblModules.setBounds(0, 81, 130, 30);
		panel.add(lblModules);
		
		Choice choice = new Choice();
		choice.setBounds(121, 88, 130, 20);
		panel.add(choice);
		
		JButton button = new JButton("+");
		button.setPreferredSize(new Dimension(35, 20));
		button.setHorizontalTextPosition(SwingConstants.CENTER);
		button.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		button.setBounds(257, 81, 48, 30);
		panel.add(button);
		
		JButton button_1 = new JButton("-");
		button_1.setPreferredSize(new Dimension(35, 20));
		button_1.setHorizontalTextPosition(SwingConstants.CENTER);
		button_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		button_1.setBounds(257, 117, 48, 30);
		panel.add(button_1);
		
		JButton btnNouveauModule = new JButton("Nouveau \r\nModule");
		btnNouveauModule.setPreferredSize(new Dimension(35, 20));
		btnNouveauModule.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNouveauModule.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		btnNouveauModule.setBounds(25, 158, 280, 30);
		panel.add(btnNouveauModule);
		
		JLabel lblListeModules = new JLabel("Liste Modules");
		lblListeModules.setHorizontalAlignment(SwingConstants.LEFT);
		lblListeModules.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblListeModules.setBounds(315, 26, 130, 30);
		panel.add(lblListeModules);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(315, 55, 263, 133);
		panel.add(panel_1);
		
		JButton btnAjouterHpital = new JButton("Ajouter H\u00F4pital");
		btnAjouterHpital.setPreferredSize(new Dimension(35, 20));
		btnAjouterHpital.setHorizontalTextPosition(SwingConstants.CENTER);
		btnAjouterHpital.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		btnAjouterHpital.setBounds(316, 199, 262, 30);
		panel.add(btnAjouterHpital);
		
		JButton buttonRetour = new JButton("\u2190");
		panel.add(buttonRetour);
		buttonRetour.setFont(new Font("Times New Roman", Font.BOLD, 29));
		buttonRetour.setBounds(25, 199, 280, 30);
		
		buttonRetour.addActionListener(new ActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		    	Controleur.ouvrirAjoutConformation();
		    	setVisible(false);
		    }
		});
		
		btnNouveauModule.addActionListener(new ActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		    	Controleur.ouvrirAjoutModule();
		    	setVisible(false);
		    }
		});
	}
	
	//METHODES
	
	//lance l'interface principale
	public static void runAH() {
		if(Controleur.isConnected() == true) {
			try {
				AjoutHopital interf = new AjoutHopital();
				interf.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}		
	}
	
	
}
