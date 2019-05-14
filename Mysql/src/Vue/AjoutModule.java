package Vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Choice;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.CompoundBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;

import Controleur.Controleur;
import java.awt.Dimension;
import javax.swing.JList;
import java.awt.Component;

public class AjoutModule extends JFrame {

	//ATTRIBUTS
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	//CONSTRUCTEUR
	public AjoutModule() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 880, 615);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblAjoutModule = new JLabel("Ajout Module");
		lblAjoutModule.setHorizontalAlignment(SwingConstants.CENTER);
		lblAjoutModule.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));
		contentPane.add(lblAjoutModule, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNomModule = new JLabel("Nom Module");
		lblNomModule.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomModule.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		lblNomModule.setBounds(10, 11, 105, 29);
		panel.add(lblNomModule);
		
		textField = new JTextField();
		textField.setBounds(125, 11, 135, 29);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblOption = new JLabel("Option");
		lblOption.setHorizontalAlignment(SwingConstants.CENTER);
		lblOption.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		lblOption.setBounds(10, 51, 105, 29);
		panel.add(lblOption);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(125, 51, 135, 29);
		panel.add(textField_1);
		
		JLabel lblVolume = new JLabel("Volume");
		lblVolume.setHorizontalAlignment(SwingConstants.CENTER);
		lblVolume.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		lblVolume.setBounds(10, 91, 105, 29);
		panel.add(lblVolume);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(125, 91, 135, 29);
		panel.add(textField_2);
		
		JLabel lblPoids = new JLabel("Poids");
		lblPoids.setHorizontalAlignment(SwingConstants.CENTER);
		lblPoids.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		lblPoids.setBounds(10, 131, 105, 29);
		panel.add(lblPoids);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(125, 131, 135, 29);
		panel.add(textField_3);
		
		JLabel lblM = new JLabel("m3");
		lblM.setHorizontalAlignment(SwingConstants.CENTER);
		lblM.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		lblM.setBounds(259, 91, 40, 29);
		panel.add(lblM);
		
		JLabel lblT = new JLabel("T");
		lblT.setHorizontalAlignment(SwingConstants.CENTER);
		lblT.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		lblT.setBounds(259, 131, 40, 29);
		panel.add(lblT);
		
		JLabel lblFormeDuColis = new JLabel("Forme du colis");
		lblFormeDuColis.setHorizontalAlignment(SwingConstants.LEFT);
		lblFormeDuColis.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		lblFormeDuColis.setBounds(10, 171, 116, 29);
		panel.add(lblFormeDuColis);
		
		JLabel lblMobilier = new JLabel("Mobilier");
		lblMobilier.setHorizontalAlignment(SwingConstants.LEFT);
		lblMobilier.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		lblMobilier.setBounds(10, 212, 105, 29);
		panel.add(lblMobilier);
		
		JLabel lblMdicaments = new JLabel("M\u00E9dicaments");
		lblMdicaments.setHorizontalAlignment(SwingConstants.LEFT);
		lblMdicaments.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		lblMdicaments.setBounds(10, 252, 105, 29);
		panel.add(lblMdicaments);
		
		JLabel lblMatrielMdical = new JLabel("Mat\u00E9riel M\u00E9dical");
		lblMatrielMdical.setHorizontalAlignment(SwingConstants.CENTER);
		lblMatrielMdical.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		lblMatrielMdical.setBounds(10, 292, 123, 29);
		panel.add(lblMatrielMdical);
		
		JLabel lblValeurHt = new JLabel("Valeur HT");
		lblValeurHt.setHorizontalAlignment(SwingConstants.LEFT);
		lblValeurHt.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		lblValeurHt.setBounds(10, 332, 105, 29);
		panel.add(lblValeurHt);
		
		JLabel lblDsignation = new JLabel("D\u00E9signation");
		lblDsignation.setHorizontalAlignment(SwingConstants.LEFT);
		lblDsignation.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		lblDsignation.setBounds(10, 372, 105, 29);
		panel.add(lblDsignation);
		
		JLabel lblZoneaffectation = new JLabel("Zone Affectation");
		lblZoneaffectation.setHorizontalAlignment(SwingConstants.LEFT);
		lblZoneaffectation.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		lblZoneaffectation.setBounds(10, 412, 135, 29);
		panel.add(lblZoneaffectation);
		
		Choice choice = new Choice();
		choice.setBounds(139, 298, 121, 29);
		panel.add(choice);
		
		Choice choice_1 = new Choice();
		choice_1.setBounds(139, 259, 121, 20);
		panel.add(choice_1);
		
		Choice choice_2 = new Choice();
		choice_2.setBounds(139, 219, 121, 20);
		panel.add(choice_2);
		
		Choice choice_3 = new Choice();
		choice_3.setBounds(139, 178, 121, 20);
		panel.add(choice_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(139, 339, 121, 20);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(139, 379, 121, 20);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(139, 419, 121, 20);
		panel.add(textField_6);
		
		JButton button = new JButton("+");
		button.setBounds(266, 218, 50, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("-");
		button_1.setPreferredSize(new Dimension(41, 23));
		button_1.setBounds(320, 218, 50, 23);
		panel.add(button_1);
		
		JButton btnAjouterColis = new JButton("Ajouter Colis");
		btnAjouterColis.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		btnAjouterColis.setBounds(20, 470, 135, 29);
		panel.add(btnAjouterColis);
		
		JButton btnRetirerColis = new JButton("Retirer Colis");
		btnRetirerColis.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		btnRetirerColis.setBounds(193, 470, 135, 29);
		panel.add(btnRetirerColis);
		
		JLabel label = new JLabel("Forme du colis");
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		label.setBounds(449, 48, 116, 29);
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel_1.setBounds(449, 91, 384, 350);
		panel.add(panel_1);
		
		String test[] = {"module1","module2","module3","module4","module5","module6","module7","module8","module9","module10","module11","module12","module13","module14"};
		JList list = new JList(test);
		list.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		list.setPreferredSize(new Dimension(380, 337));
		panel_1.add(list);
		
		JButton btnAjouterCeModule = new JButton("Ajouter ce Module");
		btnAjouterCeModule.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		btnAjouterCeModule.setBounds(449, 452, 384, 29);
		panel.add(btnAjouterCeModule);
		
		JButton button_2 = new JButton("+");
		button_2.setBounds(266, 258, 50, 23);
		panel.add(button_2);
		
		JButton button_3 = new JButton("-");
		button_3.setPreferredSize(new Dimension(41, 23));
		button_3.setBounds(320, 258, 50, 23);
		panel.add(button_3);
		
		JButton button_4 = new JButton("+");
		button_4.setBounds(266, 298, 50, 23);
		panel.add(button_4);
		
		JButton button_5 = new JButton("-");
		button_5.setPreferredSize(new Dimension(41, 23));
		button_5.setBounds(320, 298, 50, 23);
		panel.add(button_5);
		
		JPanel border = new JPanel();
		border.setBounds(0, 171, 385, 338);
		panel.add(border);
		border.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		JButton buttonRetour = new JButton("\u2190");
		panel.add(buttonRetour);
		buttonRetour.setFont(new Font("Times New Roman", Font.BOLD, 29));
		buttonRetour.setBounds(449, 492, 384, 29);
		
		buttonRetour.addActionListener(new ActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		    	Controleur.ouvrirAjoutHopital();
		    	setVisible(false);
		    }
		});
	}
	
	// METHODES
	
	public static void runAMod() {
		if(Controleur.isConnected() == true) {
			try {
				AjoutModule interf = new AjoutModule();
				interf.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
					
	}
}
