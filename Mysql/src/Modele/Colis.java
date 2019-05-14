package Modele;

import java.util.ArrayList;

public class Colis {
	private TypeColis typeColis;
	private int valeurHT;
	private String designation;
	private String zoneAffectation;
	private ArrayList<Medicament> listeMedicament;
	private ArrayList<Mobilier> listeMobilier;
	private ArrayList<MaterielMedical> listeMaterielMedical;
	
	public Colis(TypeColis typeColis, int valeurHT, String designation, String zoneAffectation,
			ArrayList<Medicament> listeMedicament, ArrayList<Mobilier> listeMobilier,
			ArrayList<MaterielMedical> listeMaterielMedical) {
		this.typeColis = typeColis;
		this.valeurHT = valeurHT;
		this.designation = designation;
		this.zoneAffectation = zoneAffectation;
		this.listeMedicament = listeMedicament;
		this.listeMobilier = listeMobilier;
		this.listeMaterielMedical = listeMaterielMedical;
	}

	public TypeColis getTypeColis() {
		return typeColis;
	}

	public void setTypeColis(TypeColis typeColis) {
		this.typeColis = typeColis;
	}

	public int getValeurHT() {
		return valeurHT;
	}

	public void setValeurHT(int valeurHT) {
		this.valeurHT = valeurHT;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getZoneAffectation() {
		return zoneAffectation;
	}

	public void setZoneAffectation(String zoneAffectation) {
		this.zoneAffectation = zoneAffectation;
	}

	public ArrayList<Medicament> getListeMedicament() {
		return listeMedicament;
	}

	public void setListeMedicament(ArrayList<Medicament> listeMedicament) {
		this.listeMedicament = listeMedicament;
	}

	public ArrayList<Mobilier> getListeMobilier() {
		return listeMobilier;
	}

	public void setListeMobilier(ArrayList<Mobilier> listeMobilier) {
		this.listeMobilier = listeMobilier;
	}

	public ArrayList<MaterielMedical> getListeMaterielMedical() {
		return listeMaterielMedical;
	}

	public void setListeMaterielMedical(ArrayList<MaterielMedical> listeMaterielMedical) {
		this.listeMaterielMedical = listeMaterielMedical;
	}

}
