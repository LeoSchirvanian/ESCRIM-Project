package Modele;

import java.util.ArrayList;

public class TypeHopital {
	private String nomTypeHopital;
	private ArrayList<TypeModule> listeTypeModule;
	
	public TypeHopital(String nomTypeHopital, ArrayList<TypeModule> listeTypeModule) {
		this.nomTypeHopital = nomTypeHopital;
		this.listeTypeModule = listeTypeModule;
	}

	public String getNomTypeHopital() {
		return nomTypeHopital;
	}

	public void setNomTypeHopital(String nomTypeHopital) {
		this.nomTypeHopital = nomTypeHopital;
	}

	public ArrayList<TypeModule> getListeTypeModule() {
		return listeTypeModule;
	}

	public void setListeTypeModule(ArrayList<TypeModule> listeTypeModule) {
		this.listeTypeModule = listeTypeModule;
	}
	
}
