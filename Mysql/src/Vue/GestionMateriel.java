package Vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controleur.Controleur;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Choice;

public class GestionMateriel extends JFrame {
	
	//ATTRIBUTS
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	//CONSTRUCTEUR
	public GestionMateriel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 615, 351);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblGestionDeMatriel = new JLabel("Gestion de Mat\u00E9riel");
		lblGestionDeMatriel.setHorizontalAlignment(SwingConstants.CENTER);
		lblGestionDeMatriel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		contentPane.add(lblGestionDeMatriel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblModifier = new JLabel("Mobilier");
		lblModifier.setHorizontalAlignment(SwingConstants.CENTER);
		lblModifier.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		lblModifier.setBounds(10, 11, 79, 28);
		panel.add(lblModifier);
		
		JLabel lblMatrielMdical = new JLabel("Mat\u00E9riel M\u00E9dical");
		lblMatrielMdical.setHorizontalAlignment(SwingConstants.CENTER);
		lblMatrielMdical.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		lblMatrielMdical.setBounds(342, 11, 138, 28);
		panel.add(lblMatrielMdical);
		
		textField = new JTextField();
		textField.setBounds(10, 45, 138, 28);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		btnAjouter.setBounds(160, 48, 89, 23);
		panel.add(btnAjouter);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(342, 45, 138, 28);
		panel.add(textField_1);
		
		JButton button = new JButton("Ajouter");
		button.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		button.setBounds(492, 48, 89, 23);
		panel.add(button);
		
		Choice choice = new Choice();
		choice.setBounds(10, 91, 138, 20);
		panel.add(choice);
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		btnSupprimer.setBounds(160, 88, 89, 23);
		panel.add(btnSupprimer);
		
		Choice choice_1 = new Choice();
		choice_1.setBounds(342, 94, 138, 20);
		panel.add(choice_1);
		
		JButton button_1 = new JButton("Supprimer");
		button_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		button_1.setBounds(492, 91, 89, 23);
		panel.add(button_1);
		
		JLabel lblMdicaments = new JLabel("M\u00E9dicament");
		lblMdicaments.setHorizontalAlignment(SwingConstants.CENTER);
		lblMdicaments.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		lblMdicaments.setBounds(10, 149, 127, 28);
		panel.add(lblMdicaments);
		
		Choice choice_2 = new Choice();
		choice_2.setBounds(143, 157, 144, 20);
		panel.add(choice_2);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		btnModifier.setBounds(314, 155, 89, 23);
		panel.add(btnModifier);
		
		JButton button_3 = new JButton("Supprimer");
		button_3.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		button_3.setBounds(425, 155, 89, 23);
		panel.add(button_3);
		
		JButton btnAjouterMdicament = new JButton("Ajouter M\u00E9dicament");
		btnAjouterMdicament.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		btnAjouterMdicament.setBounds(21, 203, 176, 40);
		panel.add(btnAjouterMdicament);
		
		JButton buttonRetour = new JButton("\u2190");
		panel.add(buttonRetour);
		buttonRetour.setFont(new Font("Times New Roman", Font.BOLD, 29));
		buttonRetour.setBounds(400, 203, 161, 40);
		
		buttonRetour.addActionListener(new ActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		    	Controleur.ouvrirGestionBase();
		    	setVisible(false);
		    }
		});
		
		btnAjouterMdicament.addActionListener(new ActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		    	Controleur.ouvrirAjoutMedicament();
		    	setVisible(false);
		    }
		});
	}
	
	//METHODES
	
	//lance l'interface principale
	public static void runGM() {
		if(Controleur.isConnected() == true) {
			try {
				GestionMateriel interf = new GestionMateriel();
				interf.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}		
	}
	

}
