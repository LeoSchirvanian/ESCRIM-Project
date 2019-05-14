package Modele;

import java.util.ArrayList;

public class FormeColis {
	private String nomFormeColis;
	private String nature;
	private ArrayList<Double> dimension;
	private String mention;
	
	public FormeColis(String nomFormeColis, String nature, ArrayList<Double> dimension, String mention) {
		this.nomFormeColis = nomFormeColis;
		this.nature = nature;
		this.dimension = dimension;
		this.mention = mention;
	}

	public String getNomFormeColis() {
		return nomFormeColis;
	}

	public void setNomFormeColis(String nomFormeColis) {
		this.nomFormeColis = nomFormeColis;
	}

	public String getNature() {
		return nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}

	public ArrayList<Double> getDimension() {
		return dimension;
	}

	public void setDimension(ArrayList<Double> dimension) {
		this.dimension = dimension;
	}

	public String getMention() {
		return mention;
	}

	public void setMention(String mention) {
		this.mention = mention;
	}

}
