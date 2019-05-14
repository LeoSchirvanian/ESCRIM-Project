package Vue;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controleur.Controleur;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.border.LineBorder;

public class AjoutConformation extends JFrame {

	//ATTRIBUTS
	private JPanel contentPane;
	private JTextField textField;

	
    //CONSTRUCTEUR
	public AjoutConformation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 710, 479);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEscrim = new JLabel("ESCRIM");
		lblEscrim.setHorizontalAlignment(SwingConstants.CENTER);
		lblEscrim.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lblEscrim.setBounds(258, 0, 167, 47);
		contentPane.add(lblEscrim);
		
		JLabel lblNewLabel = new JLabel("Ajouter ou Modifier Conformation");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 23));
		lblNewLabel.setBounds(58, 41, 592, 47);
		contentPane.add(lblNewLabel);
		
		JLabel lblNomConformation = new JLabel("Nom Conformation");
		lblNomConformation.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
		lblNomConformation.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomConformation.setBounds(10, 116, 122, 26);
		contentPane.add(lblNomConformation);
		
		JLabel lblHpital = new JLabel("H\u00F4pital");
		lblHpital.setHorizontalAlignment(SwingConstants.CENTER);
		lblHpital.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblHpital.setBounds(10, 187, 115, 26);
		contentPane.add(lblHpital);
		
		JLabel lblAvion = new JLabel("Avion");
		lblAvion.setHorizontalAlignment(SwingConstants.CENTER);
		lblAvion.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblAvion.setBounds(10, 258, 115, 26);
		contentPane.add(lblAvion);
		
		JLabel lblInformationsHpital = new JLabel("Informations H\u00F4pital");
		lblInformationsHpital.setHorizontalAlignment(SwingConstants.LEFT);
		lblInformationsHpital.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
		lblInformationsHpital.setBounds(329, 116, 171, 26);
		contentPane.add(lblInformationsHpital);
		
		JLabel lblInformationsAvion = new JLabel("Informations Avion");
		lblInformationsAvion.setHorizontalAlignment(SwingConstants.LEFT);
		lblInformationsAvion.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
		lblInformationsAvion.setBounds(329, 236, 171, 26);
		contentPane.add(lblInformationsAvion);
		
		JButton btnAjoutHpital = new JButton("Ajout H\u00F4pital");
		btnAjoutHpital.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		btnAjoutHpital.setBounds(13, 213, 112, 23);
		contentPane.add(btnAjoutHpital);
		
		textField = new JTextField();
		textField.setBounds(142, 151, 167, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(142, 120, 167, 20);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(142, 192, 167, 20);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(142, 263, 167, 20);
		contentPane.add(comboBox_2);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBorder(new EmptyBorder(1, 1, 1, 1));
		btnOk.setBackground(new Color(0, 102, 0));
		btnOk.setForeground(Color.BLACK);
		btnOk.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));
		btnOk.setBounds(13, 329, 296, 47);
		contentPane.add(btnOk);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(329, 140, 344, 99);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(329, 263, 344, 99);
		contentPane.add(panel_1);
		
		JButton buttonRetour = new JButton("\u2190");
		buttonRetour.setFont(new Font("Times New Roman", Font.BOLD, 29));
		buttonRetour.setBounds(609, 8, 64, 39);
		contentPane.add(buttonRetour);
		
		buttonRetour.addActionListener(new ActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		    	ESCRIM.runESCRIM();
		    	setVisible(false);
		    }
		});
		
		btnAjoutHpital.addActionListener(new ActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		    	Controleur.ouvrirAjoutHopital();
		    	setVisible(false);
		    }
		});
	}
	
	//METHODES
	//lance l'interface principale
	public static void runAC() {
		if(Controleur.isConnected() == true) {
			try {
				AjoutConformation interf = new AjoutConformation();
				interf.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
