package Vue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controleur.Controleur;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class AjoutAvion extends JFrame {

	//ATTRIBUTS
	
	//panel
	private JPanel contentPane;
	
	//label
	private JLabel lblDoorSize;
	private JLabel lblCargoHold;
	private JLabel lblMaxLoad;
	private JLabel lblRunwayRequirement;
	private JLabel lblUseableVolume;
	private JLabel lblFuelBurn;
	private JLabel lblCruseSpeed;
	private JLabel lblPalletPosnumber;
	private JLabel lblL;
	private JLabel lblL_1;
	private JLabel lblH;
	private JLabel label;
	private JLabel lblM;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel lblA;
	private JLabel label_4;
	private JLabel lblTons;
	private JLabel lblKm;
	private JLabel lblM_1;
	private JLabel lblL_2;
	private JLabel lblKmh;
	
	//textField
	private JTextField planeName;
	private JTextField doorSize0;
	private JTextField doorSize1;
	private JTextField cargoHold0;
	private JTextField cargoHold1;
	private JTextField cargoHold2;
	private JTextField maxLoad_T;
	private JTextField runwayRequirement_km;
	private JTextField loadRange_km;
	private JTextField useableVolume_m3;
	private JTextField fuelBurn_lh;
	private JTextField cruiseSpeed_kmh;
	private JTextField palletPositions_number;
	
	//button
	private JButton btnAjouter;
	
	//CONSTRUCTEUR
	public AjoutAvion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 745, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNomAvion = new JLabel("Plane Name");
		lblNomAvion.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblNomAvion.setHorizontalAlignment(SwingConstants.LEFT);
		lblNomAvion.setBounds(10, 101, 135, 25);
		contentPane.add(lblNomAvion);
		
		planeName = new JTextField();
		planeName.setBounds(213, 103, 100, 24);
		contentPane.add(planeName);
		planeName.setColumns(10);
		
		lblDoorSize = new JLabel("Door Size");
		lblDoorSize.setHorizontalAlignment(SwingConstants.LEFT);
		lblDoorSize.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblDoorSize.setBounds(10, 140, 135, 25);
		contentPane.add(lblDoorSize);
		
		lblCargoHold = new JLabel("Cargo Hold");
		lblCargoHold.setHorizontalAlignment(SwingConstants.LEFT);
		lblCargoHold.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblCargoHold.setBounds(10, 180, 135, 25);
		contentPane.add(lblCargoHold);
		
		lblMaxLoad = new JLabel("Max Load");
		lblMaxLoad.setHorizontalAlignment(SwingConstants.LEFT);
		lblMaxLoad.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblMaxLoad.setBounds(10, 220, 135, 25);
		contentPane.add(lblMaxLoad);
		
		lblRunwayRequirement = new JLabel("Runway Requirement");
		lblRunwayRequirement.setHorizontalAlignment(SwingConstants.LEFT);
		lblRunwayRequirement.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblRunwayRequirement.setBounds(10, 260, 135, 25);
		contentPane.add(lblRunwayRequirement);
		
		lblUseableVolume = new JLabel("Useable Volume");
		lblUseableVolume.setHorizontalAlignment(SwingConstants.LEFT);
		lblUseableVolume.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblUseableVolume.setBounds(10, 335, 135, 25);
		contentPane.add(lblUseableVolume);
		
		lblFuelBurn = new JLabel("Fuel Burn");
		lblFuelBurn.setHorizontalAlignment(SwingConstants.LEFT);
		lblFuelBurn.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblFuelBurn.setBounds(10, 375, 135, 25);
		contentPane.add(lblFuelBurn);
		
		lblCruseSpeed = new JLabel("Cruse Speed");
		lblCruseSpeed.setHorizontalAlignment(SwingConstants.LEFT);
		lblCruseSpeed.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblCruseSpeed.setBounds(10, 415, 135, 25);
		contentPane.add(lblCruseSpeed);
		
		lblPalletPosnumber = new JLabel("Pallet Position Number");
		lblPalletPosnumber.setHorizontalAlignment(SwingConstants.LEFT);
		lblPalletPosnumber.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblPalletPosnumber.setBounds(10, 455, 150, 25);
		contentPane.add(lblPalletPosnumber);
		
		doorSize0 = new JTextField();
		doorSize0.setColumns(10);
		doorSize0.setBounds(213, 141, 100, 24);
		contentPane.add(doorSize0);
		
		cargoHold0 = new JTextField();
		cargoHold0.setColumns(10);
		cargoHold0.setBounds(213, 180, 100, 24);
		contentPane.add(cargoHold0);
		
		maxLoad_T = new JTextField();
		maxLoad_T.setColumns(10);
		maxLoad_T.setBounds(213, 221, 100, 24);
		contentPane.add(maxLoad_T);
		
		runwayRequirement_km = new JTextField();
		runwayRequirement_km.setColumns(10);
		runwayRequirement_km.setBounds(213, 260, 100, 24);
		contentPane.add(runwayRequirement_km);
		
		useableVolume_m3 = new JTextField();
		useableVolume_m3.setColumns(10);
		useableVolume_m3.setBounds(213, 336, 100, 24);
		contentPane.add(useableVolume_m3);
		
		fuelBurn_lh = new JTextField();
		fuelBurn_lh.setColumns(10);
		fuelBurn_lh.setBounds(213, 375, 100, 24);
		contentPane.add(fuelBurn_lh);
		
		cruiseSpeed_kmh = new JTextField();
		cruiseSpeed_kmh.setColumns(10);
		cruiseSpeed_kmh.setBounds(213, 415, 100, 24);
		contentPane.add(cruiseSpeed_kmh);
		
		palletPositions_number = new JTextField();
		palletPositions_number.setColumns(10);
		palletPositions_number.setBounds(213, 455, 100, 24);
		contentPane.add(palletPositions_number);
		
		lblL = new JLabel("L :");
		lblL.setHorizontalAlignment(SwingConstants.CENTER);
		lblL.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblL.setBounds(157, 187, 46, 14);
		contentPane.add(lblL);
		
		lblL_1 = new JLabel("L :");
		lblL_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblL_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblL_1.setBounds(157, 147, 46, 14);
		contentPane.add(lblL_1);
		
		lblH = new JLabel("h :");
		lblH.setHorizontalAlignment(SwingConstants.CENTER);
		lblH.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblH.setBounds(342, 145, 46, 14);
		contentPane.add(lblH);
		
		label = new JLabel("h :");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		label.setBounds(342, 185, 46, 14);
		contentPane.add(label);
		
		lblM = new JLabel("m");
		lblM.setHorizontalAlignment(SwingConstants.LEFT);
		lblM.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblM.setBounds(320, 145, 28, 14);
		contentPane.add(lblM);
		
		label_1 = new JLabel("m");
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		label_1.setBounds(320, 185, 28, 14);
		contentPane.add(label_1);
		
		doorSize1 = new JTextField();
		doorSize1.setColumns(10);
		doorSize1.setBounds(394, 141, 100, 24);
		contentPane.add(doorSize1);
		
		cargoHold1 = new JTextField();
		cargoHold1.setColumns(10);
		cargoHold1.setBounds(394, 180, 100, 24);
		contentPane.add(cargoHold1);
		
		label_2 = new JLabel("m");
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		label_2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		label_2.setBounds(504, 147, 28, 14);
		contentPane.add(label_2);
		
		label_3 = new JLabel("m");
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		label_3.setBounds(504, 185, 28, 14);
		contentPane.add(label_3);
		
		lblA = new JLabel("w :");
		lblA.setHorizontalAlignment(SwingConstants.CENTER);
		lblA.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblA.setBounds(530, 185, 46, 14);
		contentPane.add(lblA);
		
		cargoHold2 = new JTextField();
		cargoHold2.setColumns(10);
		cargoHold2.setBounds(582, 180, 100, 24);
		contentPane.add(cargoHold2);
		
		label_4 = new JLabel("m");
		label_4.setHorizontalAlignment(SwingConstants.LEFT);
		label_4.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		label_4.setBounds(686, 185, 28, 14);
		contentPane.add(label_4);
		
		lblTons = new JLabel("Tons");
		lblTons.setHorizontalAlignment(SwingConstants.LEFT);
		lblTons.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblTons.setBounds(320, 227, 46, 14);
		contentPane.add(lblTons);
		
		lblKm = new JLabel("km");
		lblKm.setHorizontalAlignment(SwingConstants.LEFT);
		lblKm.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblKm.setBounds(320, 267, 46, 14);
		contentPane.add(lblKm);
		
		lblM_1 = new JLabel("m3");
		lblM_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblM_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblM_1.setBounds(320, 342, 46, 14);
		contentPane.add(lblM_1);
		
		lblL_2 = new JLabel("L/h");
		lblL_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblL_2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblL_2.setBounds(320, 382, 46, 14);
		contentPane.add(lblL_2);
		
		lblKmh = new JLabel("km/h");
		lblKmh.setHorizontalAlignment(SwingConstants.LEFT);
		lblKmh.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblKmh.setBounds(320, 422, 46, 14);
		contentPane.add(lblKmh);
		
		btnAjouter = new JButton("Ajouter / Modifier");
		btnAjouter.setForeground(Color.BLACK);
		btnAjouter.setBackground(new Color(51, 153, 0));
		btnAjouter.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		btnAjouter.setBounds(459, 418, 206, 47);
		contentPane.add(btnAjouter);
		
		JLabel lblAjoutAvion = new JLabel("Ajouter et Modifier Avion");
		lblAjoutAvion.setHorizontalAlignment(SwingConstants.CENTER);
		lblAjoutAvion.setFont(new Font("Segoe UI Semibold", Font.BOLD, 30));
		lblAjoutAvion.setBounds(182, 11, 363, 57);
		contentPane.add(lblAjoutAvion);
		
		JLabel lblLoadRange = new JLabel("Load Range");
		lblLoadRange.setHorizontalAlignment(SwingConstants.LEFT);
		lblLoadRange.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblLoadRange.setBounds(10, 296, 135, 25);
		contentPane.add(lblLoadRange);
		
		loadRange_km = new JTextField();
		loadRange_km.setColumns(10);
		loadRange_km.setBounds(213, 296, 100, 24);
		contentPane.add(loadRange_km);
		
		JLabel label_6 = new JLabel("km");
		label_6.setHorizontalAlignment(SwingConstants.LEFT);
		label_6.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		label_6.setBounds(320, 303, 46, 14);
		contentPane.add(label_6);
		
		JButton buttonRetour = new JButton("\u2190");
		buttonRetour.setFont(new Font("Times New Roman", Font.BOLD, 29));
		buttonRetour.setBounds(645, 11, 64, 39);
		contentPane.add(buttonRetour);
		
		//LISTENER
		buttonRetour.addActionListener(new ActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		    	Controleur.ouvrirGestionAvion();
		    	setVisible(false);
		    }
		});
		
		btnAjouter.addActionListener(new ActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		    	//on regarde si toutes les cases sont remplies !
		    	if(planeName.getText() != "" && doorSize0.getText() != "" && doorSize1.getText() != ""
		    	   && cargoHold0.getText() != "" && cargoHold1.getText() != "" && cargoHold2.getText() != ""
		    	   && maxLoad_T.getText() != "" && runwayRequirement_km.getText() != "" 
		    	   && loadRange_km.getText() != "" && useableVolume_m3.getText() != ""
		    	   && fuelBurn_lh.getText() != "" && cruiseSpeed_kmh.getText() != ""
		    	   && palletPositions_number.getText() != "") {
		    		//crée un avion
		    		try {
						Controleur.creationAvion(planeName.getText(), doorSize0.getText(), doorSize1.getText(),
							   cargoHold0.getText(), cargoHold1.getText(), cargoHold2.getText(),
							   maxLoad_T.getText(), runwayRequirement_km.getText(),
							   loadRange_km.getText(), useableVolume_m3.getText(),
							   fuelBurn_lh.getText(), cruiseSpeed_kmh.getText(),
							   palletPositions_number.getText());
					} 
		    		//catch SQL erreur
		    		catch (HeadlessException e2) {e2.printStackTrace();} 
		    		catch (SQLException e2) {e2.printStackTrace();}
		    		//réactualise le choice de GestionAvion
		    		try {
						GestionAvion.actualiserAvion(GestionAvion.getChoice());
					} 
		    		//catch SQL erreur
		    		catch (HeadlessException e1) {e1.printStackTrace();} 
		    		catch (SQLException e2) {e2.printStackTrace();}
		    	}
		    	else {
		    		JOptionPane.showMessageDialog(null, "Il reste des cases vides");
		    	}
		    }
		});
	}
	
	//METHODES
	
	//lance l'interface principale
	public static void runAA() {
		if(Controleur.isConnected() == true) {
			try {
				AjoutAvion interf = new AjoutAvion();
				interf.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}		
	}

	//GET & SET
	public String getPlaneName() {
		return planeName.getText();
	}

	public String getDoorSize0() {
		return doorSize0.getText();
	}

	public String getDoorSize1() {
		return doorSize1.getText();
	}

	public String getCargoHold0() {
		return cargoHold0.getText();
	}

	public String getCargoHold1() {
		return cargoHold1.getText();
	}

	public String getCargoHold2() {
		return cargoHold2.getText();
	}

	public String getMaxLoad_T() {
		return maxLoad_T.getText();
	}

	public String getRunwayRequirement_km() {
		return runwayRequirement_km.getText();
	}

	public String getLoadRange_km() {
		return loadRange_km.getText();
	}

	public String getUseableVolume_m3() {
		return useableVolume_m3.getText();
	}

	public String getFuelBurn_lh() {
		return fuelBurn_lh.getText();
	}

	public String getCruiseSpeed_kmh() {
		return cruiseSpeed_kmh.getText();
	}

	public String getPalletPositions_number() {
		return palletPositions_number.getText();
	}

}
