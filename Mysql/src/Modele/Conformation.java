package Modele;

public class Conformation {
	private Hopital hopital;
	private TypeConformation typeConformation;
	
	public Conformation(Hopital hopital, TypeConformation typeConformation) {
		this.hopital = hopital;
		this.typeConformation = typeConformation;
	}

	public Hopital getHopital() {
		return hopital;
	}

	public void setHopital(Hopital hopital) {
		this.hopital = hopital;
	}

	public TypeConformation getTypeConformation() {
		return typeConformation;
	}

	public void setTypeConformation(TypeConformation typeConformation) {
		this.typeConformation = typeConformation;
	}

}
