package Vue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controleur.Controleur;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Label;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import java.awt.Scrollbar;
import javax.swing.JScrollBar;
import java.awt.FlowLayout;
import java.awt.Component;
import javax.swing.JTextField;
import java.awt.Choice;
import javax.swing.border.LineBorder;

public class ESCRIM extends JFrame {
	
	//ATTRIBUTS
	private JPanel contentPane;

	//CONSTRUCTEUR
	public ESCRIM() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 710, 379);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblEscrim = new JLabel("ESCRIM");
		lblEscrim.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));
		lblEscrim.setPreferredSize(new Dimension(38, 36));
		lblEscrim.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblEscrim, BorderLayout.NORTH);
		
		JPanel boutons = new JPanel();
		boutons.setPreferredSize(new Dimension(10, 60));
		contentPane.add(boutons, BorderLayout.SOUTH);
		boutons.setLayout(null);
		
		JButton btnAjouterModifier = new JButton("Ajouter / Modifier");
		btnAjouterModifier.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		btnAjouterModifier.setBounds(10, 11, 155, 38);
		boutons.add(btnAjouterModifier);
		
		JButton btnExtraire = new JButton("Extraire");
		btnExtraire.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		btnExtraire.setBounds(268, 11, 155, 38);
		boutons.add(btnExtraire);
		
		JButton btnGestionBase = new JButton("Gestion Base");
		btnGestionBase.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		btnGestionBase.setBounds(519, 11, 155, 38);
		boutons.add(btnGestionBase);
		
		JPanel conformations = new JPanel();
		contentPane.add(conformations, BorderLayout.CENTER);
		conformations.setLayout(null);
		
		JLabel lblConformations = new JLabel("Conformations :");
		lblConformations.setHorizontalAlignment(SwingConstants.CENTER);
		lblConformations.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		lblConformations.setBounds(10, 48, 137, 25);
		conformations.add(lblConformations);
		
		Choice choice = new Choice();
		choice.setBounds(153, 53, 167, 20);
		conformations.add(choice);
		
		JButton btnVisualiser = new JButton("Visualiser");
		btnVisualiser.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		btnVisualiser.setBounds(153, 87, 167, 33);
		conformations.add(btnVisualiser);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(330, 48, 344, 175);
		conformations.add(panel);
		
		
		//LISTENER
		btnGestionBase.addActionListener(new ActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		    	Controleur.ouvrirGestionBase();
		    	setVisible(false);
		    }
		});
		
		btnAjouterModifier.addActionListener(new ActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		    	Controleur.ouvrirAjoutConformation();
		    	setVisible(false);
		    }
		});
	}
	
	// METHODES
	
	public static void runESCRIM() {
		if(Controleur.isConnected() == true) {
			try {
				ESCRIM interf = new ESCRIM();
				interf.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
