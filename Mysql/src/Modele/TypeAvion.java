package Modele;

import java.util.ArrayList;

public class TypeAvion {
	
	private String planeName;
	private ArrayList<String> doorSize;
	private ArrayList<String> cargoHold;
	private String maxLoad_T; 
	private String runwayRequirement_km;
	private String loadRange_km;
	private String useableVolume_m3;
	private String fuelBurn_lh;
	private String cruiseSpeed_kmh;
	private String palletPositions_number;
	
	
	public TypeAvion(String planeName, ArrayList<String> doorSize, ArrayList<String> cargoHold, String maxLoad_T,
			String runwayRequirement_km, String loadRange_km, String useableVolume_m3, String fuelBurn_lh,
			String cruiseSpeed_kmh, String palletPositions_number) {
		this.planeName = planeName;
		this.doorSize = doorSize;
		this.cargoHold = cargoHold;
		this.maxLoad_T = maxLoad_T;
		this.runwayRequirement_km = runwayRequirement_km;
		this.loadRange_km = loadRange_km;
		this.useableVolume_m3 = useableVolume_m3;
		this.fuelBurn_lh = fuelBurn_lh;
		this.cruiseSpeed_kmh = cruiseSpeed_kmh;
		this.palletPositions_number = palletPositions_number;
	}


	public String getPlaneName() {
		return planeName;
	}


	public ArrayList<String> getDoorSize() {
		return doorSize;
	}


	public ArrayList<String> getCargoHold() {
		return cargoHold;
	}


	public String getMaxLoad_T() {
		return maxLoad_T;
	}


	public String getRunwayRequirement_km() {
		return runwayRequirement_km;
	}


	public String getLoadRange_km() {
		return loadRange_km;
	}


	public String getUseableVolume_m3() {
		return useableVolume_m3;
	}


	public String getFuelBurn_lh() {
		return fuelBurn_lh;
	}


	public String getCruiseSpeed_kmh() {
		return cruiseSpeed_kmh;
	}


	public String getPalletPositions_number() {
		return palletPositions_number;
	}

}
