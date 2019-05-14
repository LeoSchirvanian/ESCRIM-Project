package Vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controleur.Controleur;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestionBase extends JFrame {

	//ATTRIBUTS
	private JPanel contentPane;

	//CONSTRUCTEUR
	public GestionBase() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 610, 365);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnGestionDuMatriel = new JButton("Gestion du Mat\u00E9riel");
		btnGestionDuMatriel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		btnGestionDuMatriel.setBounds(125, 60, 318, 49);
		contentPane.add(btnGestionDuMatriel);
		
		JButton btnGestionDesFormes = new JButton("Gestion des Formes de Colis");
		btnGestionDesFormes.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		btnGestionDesFormes.setBounds(125, 138, 318, 49);
		contentPane.add(btnGestionDesFormes);
		
		JButton btnGestionDesAvions = new JButton("Gestion des Avions");
		btnGestionDesAvions.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		btnGestionDesAvions.setBounds(125, 215, 318, 49);
		contentPane.add(btnGestionDesAvions);
		
		JButton buttonRetour = new JButton("\u2190");
		buttonRetour.setFont(new Font("Times New Roman", Font.BOLD, 29));
		buttonRetour.setBounds(520, 11, 64, 39);
		contentPane.add(buttonRetour);
		
		//LISTENER
		btnGestionDesAvions.addActionListener(new ActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		    	Controleur.ouvrirGestionAvion();
		    	setVisible(false);
		    }
		});
		
		btnGestionDesFormes.addActionListener(new ActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		    	Controleur.ouvrirGestionFormeColis();
		    	setVisible(false);
		    }
		});
		
		btnGestionDuMatriel.addActionListener(new ActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		    	Controleur.ouvrirGestionMateriel();
		    	setVisible(false);
		    }
		});
		
		buttonRetour.addActionListener(new ActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		    	ESCRIM.runESCRIM();
		    	setVisible(false);
		    }
		});
	}
	
	//METHODES
	
	//lance l'interface principale
	public static void runGB() {
		if(Controleur.isConnected() == true) {
			try {
				GestionBase interf = new GestionBase();
				interf.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}		
	}
	
}
