package Modele;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ConnexionBDD {
	
	//CONSTRUCTEUR
	public ConnexionBDD(){
	} 

    //METHODES
	
	//permet de se connecter à la base de donnée
	public static ResultSet logBDD(JTextField user, JPasswordField password) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetgl"
					//permet de régler problème de Time Zone
					+ "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
			Statement stmt = con.createStatement();
			String sql = "Select * from tblogin where UserName='"+user.getText()+"' and Password = '"+password.getText().toString()+"'";
			ResultSet rs = stmt.executeQuery(sql);
			return rs;
		}
		catch(Exception e) {System.out.print(e);}
		return null;
	}
	
}

