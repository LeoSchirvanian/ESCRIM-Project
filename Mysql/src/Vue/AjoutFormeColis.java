package Vue;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controleur.Controleur;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class AjoutFormeColis extends JFrame {

	//ATTRIBUTS
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	//CONSTRUCTEUR
	public AjoutFormeColis() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 669, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblAjoutEtModifier = new JLabel("Ajouter et Modifier Forme du Colis");
		lblAjoutEtModifier.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblAjoutEtModifier.setPreferredSize(new Dimension(153, 40));
		lblAjoutEtModifier.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblAjoutEtModifier, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNomFormeColis = new JLabel("Nom Forme Colis");
		lblNomFormeColis.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblNomFormeColis.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomFormeColis.setBounds(10, 42, 120, 25);
		panel.add(lblNomFormeColis);
		
		JLabel lblNature = new JLabel("Nature");
		lblNature.setHorizontalAlignment(SwingConstants.CENTER);
		lblNature.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblNature.setBounds(10, 92, 120, 25);
		panel.add(lblNature);
		
		JLabel lblDimension = new JLabel("Dimension");
		lblDimension.setHorizontalAlignment(SwingConstants.CENTER);
		lblDimension.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblDimension.setBounds(10, 142, 120, 25);
		panel.add(lblDimension);
		
		textField = new JTextField();
		textField.setBounds(146, 42, 157, 25);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(146, 92, 157, 25);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(170, 142, 107, 25);
		panel.add(textField_2);
		
		JLabel lblL = new JLabel("L :");
		lblL.setHorizontalAlignment(SwingConstants.CENTER);
		lblL.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblL.setBounds(140, 142, 32, 25);
		panel.add(lblL);
		
		JLabel lblM = new JLabel("m");
		lblM.setHorizontalAlignment(SwingConstants.CENTER);
		lblM.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblM.setBounds(271, 142, 32, 25);
		panel.add(lblM);
		
		JLabel lblH = new JLabel("h :");
		lblH.setHorizontalAlignment(SwingConstants.CENTER);
		lblH.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblH.setBounds(310, 142, 32, 25);
		panel.add(lblH);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(340, 142, 107, 25);
		panel.add(textField_3);
		
		JLabel label_1 = new JLabel("m");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		label_1.setBounds(441, 142, 32, 25);
		panel.add(label_1);
		
		JLabel lblW = new JLabel("w :");
		lblW.setHorizontalAlignment(SwingConstants.CENTER);
		lblW.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblW.setBounds(472, 142, 32, 25);
		panel.add(lblW);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(502, 142, 107, 25);
		panel.add(textField_4);
		
		JLabel label_2 = new JLabel("m");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		label_2.setBounds(603, 142, 32, 25);
		panel.add(label_2);
		
		JButton btnAjouterModifier = new JButton("Ajouter / Modifier");
		btnAjouterModifier.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		btnAjouterModifier.setBounds(402, 201, 186, 42);
		panel.add(btnAjouterModifier);
		
		JButton buttonRetour = new JButton("\u2190");
		panel.add(buttonRetour);
		buttonRetour.setFont(new Font("Times New Roman", Font.BOLD, 29));
		buttonRetour.setBounds(32, 201, 69, 42);
		
		buttonRetour.addActionListener(new ActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		    	Controleur.ouvrirGestionFormeColis();
		    	setVisible(false);
		    }
		});
		
	}
	
	//METHODES
	
	//lance l'interface principale
	public static void runAFC() {
		if(Controleur.isConnected() == true) {
			try {
				AjoutFormeColis interf = new AjoutFormeColis();
				interf.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}		
	}
}
