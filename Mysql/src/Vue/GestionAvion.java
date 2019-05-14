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
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Button;

public class GestionAvion extends JFrame {

	//ATTRIBUTS
	private JPanel contentPane;
	private static Choice choice;

	//CONSTRUCTEUR
	public GestionAvion() throws HeadlessException, SQLException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 555, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGestionDesAvions = new JLabel("Gestion des Avions");
		lblGestionDesAvions.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));
		lblGestionDesAvions.setHorizontalAlignment(SwingConstants.CENTER);
		lblGestionDesAvions.setBounds(125, 0, 285, 48);
		contentPane.add(lblGestionDesAvions);
		
		JButton btnAjouterAvion = new JButton("Ajouter Avion");
		btnAjouterAvion.setBackground(new Color(0, 204, 102));
		btnAjouterAvion.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		btnAjouterAvion.setBounds(34, 90, 165, 33);
		contentPane.add(btnAjouterAvion);
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setBackground(new Color(255, 0, 51));
		btnSupprimer.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		btnSupprimer.setBounds(299, 235, 165, 33);
		contentPane.add(btnSupprimer);
		
		JLabel lblNomAvion = new JLabel("Nom Avion  :");
		lblNomAvion.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomAvion.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		lblNomAvion.setBounds(34, 160, 165, 33);
		contentPane.add(lblNomAvion);
		
		Choice choice = new Choice();
		choice.setBounds(299, 167, 165, 33);
		contentPane.add(choice);
		//affiche les avions de la bdd
		actualiserAvion(choice);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		btnModifier.setBounds(34, 235, 165, 33);
		contentPane.add(btnModifier);
		
		JButton buttonRetour = new JButton("\u2190");
		buttonRetour.setFont(new Font("Times New Roman", Font.BOLD, 29));
		buttonRetour.setBounds(454, 11, 64, 39);
		contentPane.add(buttonRetour);
		
		//LISTENER
		btnAjouterAvion.addActionListener(new ActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		    	Controleur.ouvrirAjoutAvion();
		    	setVisible(false);
		    }
		});
		
		buttonRetour.addActionListener(new ActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		    	Controleur.ouvrirGestionBase();
		    	setVisible(false);
		    }
		});
		
		btnSupprimer.addActionListener(new ActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		    	
		    }
		});
		
		//BDD

	}
	
	//METHODES
	
	//lance l'interface principale
	public static void runGA() {
		if(Controleur.isConnected() == true) {
			try {
				GestionAvion interf = new GestionAvion();
				interf.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}		
	}
	
	//actualise la fenêtre d'affichage des avions
	public static void actualiserAvion(Choice c) throws HeadlessException, SQLException {
		//affichage de tous les avions dans la bdd
		ArrayList <String[]> listeAvion = Controleur.affichageAvion();
		ArrayList <String[]> listeIdAvion = Controleur.affichageIdAvion();
		int len = listeAvion.size();
		for(int i=0;i<len;i++) {
			String[] t = listeAvion.get(0);
			String[] t1 = listeIdAvion.get(0);
			c.add(t1[i] + "  " + t[i]);
		}
		
	}
	
	//GET
	
	public static Choice getChoice() {
		return choice;
	}

	public static void setChoice(Choice choice) {
		GestionAvion.choice = choice;
	}
}
