package Modele;

import java.util.ArrayList;

public class TypeColis {
	private String nomTypeColis;
	private FormeColis formeColis;
	private ArrayList<TypeMedicament> listeTypeMedicament;
	private ArrayList<TypeMobilier> listeTypeMobilier;
	private ArrayList<TypeMaterielMedical> listeTypeMaterielMedical;
	
	public TypeColis(String nomTypeColis, FormeColis formeColis, ArrayList<TypeMedicament> listeTypeMedicament,
			ArrayList<TypeMobilier> listeTypeMobilier, ArrayList<TypeMaterielMedical> listeTypeMaterielMedical) {
		this.nomTypeColis = nomTypeColis;
		this.formeColis = formeColis;
		this.listeTypeMedicament = listeTypeMedicament;
		this.listeTypeMobilier = listeTypeMobilier;
		this.listeTypeMaterielMedical = listeTypeMaterielMedical;
	}

	public String getNomTypeColis() {
		return nomTypeColis;
	}

	public void setNomTypeColis(String nomTypeColis) {
		this.nomTypeColis = nomTypeColis;
	}

	public FormeColis getFormeColis() {
		return formeColis;
	}

	public void setFormeColis(FormeColis formeColis) {
		this.formeColis = formeColis;
	}

	public ArrayList<TypeMedicament> getListeTypeMedicament() {
		return listeTypeMedicament;
	}

	public void setListeTypeMedicament(ArrayList<TypeMedicament> listeTypeMedicament) {
		this.listeTypeMedicament = listeTypeMedicament;
	}

	public ArrayList<TypeMobilier> getListeTypeMobilier() {
		return listeTypeMobilier;
	}

	public void setListeTypeMobilier(ArrayList<TypeMobilier> listeTypeMobilier) {
		this.listeTypeMobilier = listeTypeMobilier;
	}

	public ArrayList<TypeMaterielMedical> getListeTypeMaterielMedical() {
		return listeTypeMaterielMedical;
	}

	public void setListeTypeMaterielMedical(ArrayList<TypeMaterielMedical> listeTypeMaterielMedical) {
		this.listeTypeMaterielMedical = listeTypeMaterielMedical;
	}
}
