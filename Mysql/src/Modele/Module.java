package Modele;

import java.util.ArrayList;

public class Module {
	private TypeModule typeModule;
	private ArrayList<Colis> listeColis;
	
	public Module(TypeModule typeModule, ArrayList<Colis> listeColis) {
		this.typeModule = typeModule;
		this.listeColis = listeColis;
	}

	public TypeModule getTypeModule() {
		return typeModule;
	}

	public void setTypeModule(TypeModule typeModule) {
		this.typeModule = typeModule;
	}

	public ArrayList<Colis> getListeColis() {
		return listeColis;
	}

	public void setListeColis(ArrayList<Colis> listeColis) {
		this.listeColis = listeColis;
	}
}
