package Modele;

public class TypeConformation {
	private String nomTypeConformation;
	private TypeAvion typeAvion;
	private TypeHopital typeHopital;
	
	public TypeConformation(String nomTypeConformation, TypeAvion typeAvion, TypeHopital typeHopital) {
		this.nomTypeConformation = nomTypeConformation;
		this.typeAvion = typeAvion;
		this.typeHopital = typeHopital;
	}

	public String getNomTypeConformation() {
		return nomTypeConformation;
	}

	public void setNomTypeConformation(String nomTypeConformation) {
		this.nomTypeConformation = nomTypeConformation;
	}

	public TypeAvion getTypeAvion() {
		return typeAvion;
	}

	public void setTypeAvion(TypeAvion typeAvion) {
		this.typeAvion = typeAvion;
	}

	public TypeHopital getTypeHopital() {
		return typeHopital;
	}

	public void setTypeHopital(TypeHopital typeHopital) {
		this.typeHopital = typeHopital;
	}
	
	


	

}
