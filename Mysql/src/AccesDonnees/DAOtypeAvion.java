package AccesDonnees;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

import Modele.*;

public class DAOtypeAvion {
	
	//Attributs
	private TypeAvion typeAvion;
	

	public DAOtypeAvion(TypeAvion avion) {
		this.typeAvion = typeAvion;
	}
	
	//METHODES
	public static void ajouterAvionBDD(TypeAvion avion) throws HeadlessException, SQLException{
		//g�n�re al�atoirement un id avion (pas d'autres solutions pour le moment)
		Random r = new Random();
		String id = String.valueOf(r.nextInt(100000));
		
		//recup�re les attributs d'avions
		String planeName = avion.getPlaneName();
		String doorSize_l = avion.getDoorSize().get(0);
		String doorSize_h = avion.getDoorSize().get(1);
		String cargoHold = avion.getCargoHold().toString();
		String maxLoad_T = avion.getMaxLoad_T();
		String runwayRequirement_km = avion.getRunwayRequirement_km();
		String loadRange_km = avion.getLoadRange_km();
		String useableVolume_m3 = avion.getUseableVolume_m3();
		String fuelBurn_lh = avion.getFuelBurn_lh();
		String cruiseSpeed_kmh = avion.getCruiseSpeed_kmh();
		String palletPositions_number = avion.getPalletPositions_number();
		try {
			//on cherche la r�ponse dans la base de donn�e
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetgl"
					//permet de r�gler probl�me de Time Zone
					+ "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
			
			//requ�te SQL
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO `types_avions` (`idTypeAvion`, `planeName`, "
					+ "`doorSize_l`, `doorSize_h`, `cargoHold`, `maxLoad_T`, `runwayRequirement_km`, `loadRange_km`, "
					+ "`useableVolume_m3`, `fuelBurn_lh`, `cruiseSpeed_kmh`, `palletPositions_number`) "
					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			//compl�tion de la requ�te SQL
			pstmt.setString(1, id);
			pstmt.setString(2, planeName);
			pstmt.setString(3, doorSize_l);
			pstmt.setString(4, doorSize_h);
			pstmt.setString(5, cargoHold);
			pstmt.setString(6, maxLoad_T);
			pstmt.setString(7, runwayRequirement_km);
			pstmt.setString(8, loadRange_km);
			pstmt.setString(9, useableVolume_m3);
			pstmt.setString(10, fuelBurn_lh);
			pstmt.setString(11, cruiseSpeed_kmh);
			pstmt.setString(12, palletPositions_number);
			int i = pstmt.executeUpdate();
				if(i>0) {
					JOptionPane.showMessageDialog(null, "Donn�es sauvegard�es");
				}
				else {
					JOptionPane.showMessageDialog(null, "Donn�es non sauvegard�es");
				}
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}
}
