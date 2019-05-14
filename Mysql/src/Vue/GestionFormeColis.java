package Vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

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

import javax.swing.JButton;
import java.awt.Choice;

public class GestionFormeColis extends JFrame {

	//ATTRIBUTS
	private JPanel contentPane;

	//CONSTRUCTEUR
	public GestionFormeColis() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 457, 313);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblGestionFormeDes = new JLabel("Gestion Forme des Colis");
		lblGestionFormeDes.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblGestionFormeDes.setPreferredSize(new Dimension(114, 40));
		lblGestionFormeDes.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblGestionFormeDes, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnAjouterForme = new JButton("Ajouter Forme");
		btnAjouterForme.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		btnAjouterForme.setBounds(10, 29, 129, 29);
		panel.add(btnAjouterForme);
		
		JLabel lblNomDeLa = new JLabel("Nom de la Forme :");
		lblNomDeLa.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomDeLa.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblNomDeLa.setBounds(0, 79, 149, 29);
		panel.add(lblNomDeLa);
		
		Choice choice = new Choice();
		choice.setBounds(177, 85, 199, 20);
		panel.add(choice);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		btnModifier.setBounds(10, 141, 129, 29);
		panel.add(btnModifier);
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		btnSupprimer.setBounds(247, 141, 129, 29);
		panel.add(btnSupprimer);
		
		JButton buttonRetour = new JButton("\u2190");
		panel.add(buttonRetour);
		buttonRetour.setFont(new Font("Times New Roman", Font.BOLD, 29));
		buttonRetour.setBounds(352, 11, 69, 34);
		
		buttonRetour.addActionListener(new ActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		    	Controleur.ouvrirGestionBase();
		    	setVisible(false);
		    }
		});
		
		btnAjouterForme.addActionListener(new ActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		    	Controleur.ouvrirAjoutFormeColis();
		    	setVisible(false);
		    }
		});
		
	}
	
	//METHODES
	
	//lance l'interface principale
	public static void runGFC() {
		if(Controleur.isConnected() == true) {
			try {
				GestionFormeColis interf = new GestionFormeColis();
				interf.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}		
	}
	

}
