package Modele;

public class TypeMedicament {
	private String nomTypeMedicament;
	private String dci;
	private String typeAdministration;
	private String dosage;
	private String classeTherapeutique;
	private String dotationU7;
	
	public TypeMedicament(String nomTypeMedicament, String dci, String typeAdministration, String dosage,
			String classeTherapeutique, String dotationU7) {
		this.nomTypeMedicament = nomTypeMedicament;
		this.dci = dci;
		this.typeAdministration = typeAdministration;
		this.dosage = dosage;
		this.classeTherapeutique = classeTherapeutique;
		this.dotationU7 = dotationU7;
	}

	public String getNomTypeMedicament() {
		return nomTypeMedicament;
	}

	public void setNomTypeMedicament(String nomTypeMedicament) {
		this.nomTypeMedicament = nomTypeMedicament;
	}

	public String getDci() {
		return dci;
	}

	public void setDci(String dci) {
		this.dci = dci;
	}

	public String getTypeAdministration() {
		return typeAdministration;
	}

	public void setTypeAdministration(String typeAdministration) {
		this.typeAdministration = typeAdministration;
	}

	public String getDosage() {
		return dosage;
	}

	public void setDosage(String dosage) {
		this.dosage = dosage;
	}

	public String getClasseTherapeutique() {
		return classeTherapeutique;
	}

	public void setClasseTherapeutique(String classeTherapeutique) {
		this.classeTherapeutique = classeTherapeutique;
	}

	public String getDotationU7() {
		return dotationU7;
	}

	public void setDotationU7(String dotationU7) {
		this.dotationU7 = dotationU7;
	}	
}
