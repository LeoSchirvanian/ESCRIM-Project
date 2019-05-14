package Vue;
import Controleur.Controleur;
import Modele.ConnexionBDD;

import java.sql.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfaceConnexion extends JFrame {

	//ATTRIBUTS
	private JPanel contentPane;
	private JTextField user;
	private JPasswordField password;

	//CONSTRUCTEUR
	public InterfaceConnexion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(new Font("Segoe UI", Font.PLAIN, 30));
		lblLogin.setBounds(10, 11, 214, 40);
		contentPane.add(lblLogin);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblUsername.setBounds(10, 68, 214, 21);
		contentPane.add(lblUsername);
		
		user = new JTextField();
		user.setBounds(10, 90, 214, 30);
		contentPane.add(user);
		user.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblPassword.setBounds(10, 140, 214, 21);
		contentPane.add(lblPassword);
		
		password = new JPasswordField();
		password.setBounds(10, 172, 214, 30);
		contentPane.add(password);
		
		JButton Login = new JButton("Login");
		Login.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//log à la base de donnée
				try {
					//regarde si l'username et le password sont correct, si oui se connecte
					Controleur.logBDD(ConnexionBDD.logBDD(user,password));
					//cache la fenêtre de connexion
					setVisible(false);
				} 
				catch(Exception e) {System.out.print(e);}
			}
		});
		Login.setBounds(67, 220, 107, 30);
		contentPane.add(Login);
	}
	
	//METHODES
	
	//lance l'interface de connexion
	public static void runIC() {
		try {
			InterfaceConnexion log = new InterfaceConnexion();
			log.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
