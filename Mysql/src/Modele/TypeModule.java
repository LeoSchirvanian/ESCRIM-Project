package Modele;

import java.util.ArrayList;

public class TypeModule {
	private String nomTypeModule;
	private Double volume_m3;
	private Double poids_T;
	private String option;
	private ArrayList<TypeModule> listeTypeModule;
	
	public TypeModule(String nomTypeModule, Double volume_m3, Double poids_T, String option,
			ArrayList<TypeModule> listeTypeModule) {
		this.nomTypeModule = nomTypeModule;
		this.volume_m3 = volume_m3;
		this.poids_T = poids_T;
		this.option = option;
		this.listeTypeModule = listeTypeModule;
	}

	public String getNomTypeModule() {
		return nomTypeModule;
	}

	public void setNomTypeModule(String nomTypeModule) {
		this.nomTypeModule = nomTypeModule;
	}

	public Double getVolume_m3() {
		return volume_m3;
	}

	public void setVolume_m3(Double volume_m3) {
		this.volume_m3 = volume_m3;
	}

	public Double getPoids_T() {
		return poids_T;
	}

	public void setPoids_T(Double poids_T) {
		this.poids_T = poids_T;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public ArrayList<TypeModule> getListeTypeModule() {
		return listeTypeModule;
	}

	public void setListeTypeModule(ArrayList<TypeModule> listeTypeModule) {
		this.listeTypeModule = listeTypeModule;
	}
	
}
