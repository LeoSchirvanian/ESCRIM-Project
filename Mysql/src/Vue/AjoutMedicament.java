package Vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controleur.Controleur;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Dimension;

public class AjoutMedicament extends JFrame {

	//ATTRIBUTS
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	//CONSTRUCTEUR
	public AjoutMedicament() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 762, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblMdicaments = new JLabel("M\u00E9dicaments");
		lblMdicaments.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblMdicaments.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblMdicaments, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNomProduit = new JLabel("Nom Produit");
		lblNomProduit.setHorizontalAlignment(SwingConstants.LEFT);
		lblNomProduit.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblNomProduit.setBounds(10, 34, 89, 20);
		panel.add(lblNomProduit);
		
		JLabel lblDci = new JLabel("DCI");
		lblDci.setHorizontalAlignment(SwingConstants.LEFT);
		lblDci.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblDci.setBounds(10, 84, 89, 20);
		panel.add(lblDci);
		
		JLabel lblTypeDadministration = new JLabel("Type d'administration");
		lblTypeDadministration.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblTypeDadministration.setBounds(10, 134, 137, 20);
		panel.add(lblTypeDadministration);
		
		JLabel lblDosage = new JLabel("Dosage");
		lblDosage.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblDosage.setBounds(10, 184, 89, 20);
		panel.add(lblDosage);
		
		JLabel lblClasseThrapeutique = new JLabel("Classe th\u00E9rapeutique");
		lblClasseThrapeutique.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblClasseThrapeutique.setBounds(10, 234, 130, 20);
		panel.add(lblClasseThrapeutique);
		
		JLabel label_4 = new JLabel("Nom Produit");
		label_4.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		label_4.setBounds(10, 284, 89, 20);
		panel.add(label_4);
		
		textField = new JTextField();
		textField.setBounds(161, 36, 137, 18);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(161, 86, 137, 18);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(161, 136, 137, 18);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(161, 186, 137, 18);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(161, 236, 137, 18);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(161, 286, 137, 18);
		panel.add(textField_5);
		
		JLabel lblNumroDeLot = new JLabel("Num\u00E9ro de lot");
		lblNumroDeLot.setHorizontalAlignment(SwingConstants.LEFT);
		lblNumroDeLot.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblNumroDeLot.setBounds(407, 34, 130, 20);
		panel.add(lblNumroDeLot);
		
		JLabel lblNumroCaisse = new JLabel("Num\u00E9ro caisse");
		lblNumroCaisse.setHorizontalAlignment(SwingConstants.LEFT);
		lblNumroCaisse.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblNumroCaisse.setBounds(407, 84, 130, 20);
		panel.add(lblNumroCaisse);
		
		JLabel lblNomCaisse = new JLabel("Nom caisse");
		lblNomCaisse.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblNomCaisse.setBounds(407, 134, 137, 20);
		panel.add(lblNomCaisse);
		
		JLabel lblQuantit = new JLabel("Quantit\u00E9");
		lblQuantit.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblQuantit.setBounds(407, 184, 89, 20);
		panel.add(lblQuantit);
		
		JLabel lblDlu = new JLabel("DLU");
		lblDlu.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblDlu.setBounds(407, 234, 130, 20);
		panel.add(lblDlu);
		
		JLabel lblProduit = new JLabel("Produit");
		lblProduit.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblProduit.setBounds(407, 284, 89, 20);
		panel.add(lblProduit);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(558, 36, 137, 18);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(558, 86, 137, 18);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(558, 136, 137, 18);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(558, 186, 137, 18);
		panel.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(558, 236, 137, 18);
		panel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(558, 286, 137, 18);
		panel.add(textField_11);
		
		JButton btnAjouterModifier = new JButton("Ajouter / Modifier");
		btnAjouterModifier.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		btnAjouterModifier.setBounds(407, 340, 225, 33);
		panel.add(btnAjouterModifier);
		
		JButton buttonRetour = new JButton("\u2190");
		buttonRetour.setMinimumSize(new Dimension(117, 23));
		buttonRetour.setMaximumSize(new Dimension(117, 23));
		buttonRetour.setPreferredSize(new Dimension(117, 23));
		panel.add(buttonRetour);
		buttonRetour.setFont(new Font("Times New Roman", Font.BOLD, 29));
		buttonRetour.setBounds(130, 340, 168, 33);
		
		buttonRetour.addActionListener(new ActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		    	Controleur.ouvrirGestionMateriel();
		    	setVisible(false);
		    }
		});
		
	}
	
	//METHODES
	
	//lance l'interface principale
	public static void runAM() {
		if(Controleur.isConnected() == true) {
			try {
				AjoutMedicament interf = new AjoutMedicament();
				interf.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}		
	}
	

}
