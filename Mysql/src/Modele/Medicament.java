package Modele;

import java.sql.Date;

public class Medicament {
	private TypeMedicament typeMedicament;
	private String numeroLot;
	private String numeroCaisse;
	private String nomCaisse;
	private int quantite;
	private Date dlu;
	
	public Medicament(TypeMedicament typeMedicament, String numeroLot, String numeroCaisse, String nomCaisse,
			int quantite, Date dlu) {
		this.typeMedicament = typeMedicament;
		this.numeroLot = numeroLot;
		this.numeroCaisse = numeroCaisse;
		this.nomCaisse = nomCaisse;
		this.quantite = quantite;
		this.dlu = dlu;
	}

	public TypeMedicament getTypeMedicament() {
		return typeMedicament;
	}

	public void setTypeMedicament(TypeMedicament typeMedicament) {
		this.typeMedicament = typeMedicament;
	}

	public String getNumeroLot() {
		return numeroLot;
	}

	public void setNumeroLot(String numeroLot) {
		this.numeroLot = numeroLot;
	}

	public String getNumeroCaisse() {
		return numeroCaisse;
	}

	public void setNumeroCaisse(String numeroCaisse) {
		this.numeroCaisse = numeroCaisse;
	}

	public String getNomCaisse() {
		return nomCaisse;
	}

	public void setNomCaisse(String nomCaisse) {
		this.nomCaisse = nomCaisse;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public Date getDlu() {
		return dlu;
	}

	public void setDlu(Date dlu) {
		this.dlu = dlu;
	}	
}
