package Modele;

import java.util.ArrayList;

public class Hopital {
	private TypeHopital typeHopital;
	private ArrayList<Module> listeModule;
	
	public Hopital(TypeHopital typeHopital, ArrayList<Module> listeModule) {
		this.typeHopital = typeHopital;
		this.listeModule = listeModule;
	}

	public TypeHopital getTypeHopital() {
		return typeHopital;
	}

	public void setTypeHopital(TypeHopital typeHopital) {
		this.typeHopital = typeHopital;
	}

	public ArrayList<Module> getListeModule() {
		return listeModule;
	}

	public void setListeModule(ArrayList<Module> listeModule) {
		this.listeModule = listeModule;
	}
}
