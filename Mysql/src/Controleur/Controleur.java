package Controleur;

import java.awt.Choice;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import AccesDonnees.*;
import Modele.*;
import Vue.AjoutAvion;
import Vue.ESCRIM;
import Vue.GestionAvion;
import Vue.GestionBase;
import Vue.GestionFormeColis;
import Vue.GestionMateriel;
import Vue.InterfaceConnexion;
import Vue.AjoutConformation;
import Vue.AjoutFormeColis;
import Vue.AjoutHopital;
import Vue.AjoutMedicament;
import Vue.AjoutModule;

public class Controleur {
	
	//ATTRIBUTS
	private ConnexionBDD modele;
	private static boolean connected;

	//CONSTRUCTEUR
	public Controleur(){
		this.modele = new ConnexionBDD();
		this.connected = false;
	}
	
	//GET ET SET
	public ConnexionBDD getModele() {
		return modele;
	}
	
	public static boolean isConnected() {
		return connected;
	}
	
	//METHODES 
	
	//CONNEXION
	//renvoie le message correspondant si les codes sont corrects ou non
	public static void logBDD(ResultSet rs) throws HeadlessException, SQLException {
		if(rs.next()) {
			//connexion réussie
			JOptionPane.showMessageDialog(null, "Login Successfully...");
			connected = true;
			//on lance la page principale
			ESCRIM.runESCRIM();
			
			//InterfacePrincipale.runIP();
			//GestionAvion.runGA();
			//AjoutAvion.runAA();
			//ESCRIM.runESCRIM();
			//AjoutModule.runAMod();
		}
		else {
			//échec connexion
			JOptionPane.showMessageDialog(null, "Incorrect username and Password...");
			connected = false;
		}
	}
	
	public static void ouvrirESCRIM() {
		ESCRIM.runESCRIM();
	}
	
	//ESCRIM
	//ouvre la fenêtre GestionBDD
	public static void ouvrirGestionBase() {
		//affiche Gestion Base
		GestionBase.runGB();
		//cache la fenêtre ESCRIM
	}
	
	public static void ouvrirAjoutConformation() {
		//affiche Gestion Base
		AjoutConformation.runAC();;
		//cache la fenêtre ESCRIM
	}
	
	
	//GESTION BASE 
	public static void ouvrirGestionAvion() {
		//affiche Gestion Avion
		GestionAvion.runGA();
		//cache la fenêtre GestionBase
	}
	
	public static void ouvrirGestionFormeColis() {
		//affiche Gestion Base
		GestionFormeColis.runGFC();
		//cache la fenêtre ESCRIM
	}
	
	public static void ouvrirGestionMateriel() {
		//affiche Gestion Base
		GestionMateriel.runGM();
		//cache la fenêtre ESCRIM
	}
	
	//GESTION AVION
	public static void ouvrirAjoutAvion() {
		//affiche Ajout Avion
		AjoutAvion.runAA();
		//cache la fenêtre GestionAvion
	}
	
	public static void actualiserAvion(Choice c) throws HeadlessException, SQLException {
		//affichage de tous les avions dans la bdd
		ArrayList <String[]> listeAvion = Controleur.affichageAvion();
		int len = listeAvion.size();
		for(int i=0;i<len;i++) {
			String[] t = listeAvion.get(0);
			c.add(t[i]);
		}
		
	}
	
	public static ArrayList <String[]> affichageAvion() throws HeadlessException, SQLException {
		//connexion réussie
		try {
			//on cherche la réponse dans la base de donnée
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetgl"
					//permet de régler problème de Time Zone
					+ "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
			Statement stmt = con.createStatement();
			String sql = "Select planeName from types_avions";
			ResultSet rs = stmt.executeQuery(sql);
				
			//on prend la réponse de la bdd et on renvoie une array list de string
			//List<String> result = new ArrayList<>();
			ArrayList <String[]> result = new ArrayList<String[]>(); //liste renvoyé
			int columnCount = rs.getMetaData().getColumnCount();     //on compte les colonnes
			while(rs.next())                                        
			{
				String[] row = new String[columnCount];              //liste des colonnes
			    for (int i=0; i <columnCount ; i++)                  
			    {
			       row[i] = rs.getString(i + 1);
			    }
			    result.add(row);
			}
			return result;
		}
		catch(Exception e) {System.out.print(e);}
		return null;
	}
	
	public static ArrayList <String[]> affichageIdAvion() throws HeadlessException, SQLException {
		//connexion réussie
		try {
			//on cherche la réponse dans la base de donnée
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetgl"
					//permet de régler problème de Time Zone
					+ "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
			Statement stmt = con.createStatement();
			String sql = "Select idTypeAvion from types_avions";
			ResultSet rs = stmt.executeQuery(sql);
				
			//on prend la réponse de la bdd et on renvoie une array list de string
			//List<String> result = new ArrayList<>();
			ArrayList <String[]> result = new ArrayList<String[]>(); //liste renvoyé
			int columnCount = rs.getMetaData().getColumnCount();     //on compte les colonnes
			while(rs.next())                                        
			{
				String[] row = new String[columnCount];              //liste des colonnes
			    for (int i=0; i <columnCount ; i++)                  
			    {
			       row[i] = rs.getString(i + 1);
			    }
			    result.add(row);
			}
			return result;
		}
		catch(Exception e) {System.out.print(e);}
		return null;
	}
	
	
	//AJOUT AVION
	//on recupere les cases et on demande de l'ajouter à la base de données
	public static void creationAvion(String planeName, String doorSize0, String doorSize1, String cargoHold0, 
			String cargoHold1, String cargoHold2, String maxLoad_T, String runwayRequirement_km, 
			String loadRange_km, String useableVolume_m3, String fuelBurn_lh, String cruiseSpeed_kmh, 
			String palletPositions_number) throws HeadlessException, SQLException {
		
		//transformation des données des cases d'ajout avions en type du constructeur
		ArrayList<String> doorSize = new ArrayList<String>();
		ArrayList<String> cargoHold = new ArrayList<String>();
		doorSize.add(doorSize0);
		doorSize.add(doorSize1);
		cargoHold.add(cargoHold0);
		cargoHold.add(cargoHold1);
		cargoHold.add(cargoHold2);
		
		//creation d'un avion
		TypeAvion avion = new TypeAvion(planeName, doorSize, cargoHold,maxLoad_T,
				 runwayRequirement_km,  loadRange_km,  useableVolume_m3,  fuelBurn_lh,
				 cruiseSpeed_kmh,  palletPositions_number);
		
		DAOtypeAvion.ajouterAvionBDD(avion);
		

	}
	
	//GESTION FORME COLIS
	public static void ouvrirAjoutFormeColis() {
		//affiche Gestion Base
		AjoutFormeColis.runAFC();
		//cache la fenêtre ESCRIM
	}
	
	//GESTION MATERIEL
	public static void ouvrirAjoutMedicament() {
		//affiche Gestion Base
		AjoutMedicament.runAM();
		//cache la fenêtre ESCRIM
	}
	
	//AJOUT CONFORMATION
	public static void ouvrirAjoutHopital() {
		//affiche Gestion Base
		AjoutHopital.runAH();
		//cache la fenêtre ESCRIM
	}
	
	//AJOUT MODULE
	public static void ouvrirAjoutModule() {
		//affiche Gestion Base
		AjoutModule.runAMod();
		//cache la fenêtre ESCRIM
	}
	


}
