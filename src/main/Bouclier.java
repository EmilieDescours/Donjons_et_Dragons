package main;

public class Bouclier {
	private String nom;
	private int blocage;

	public Bouclier() {
		this.nom = "undefined";
		this.blocage = 5;

	}

	public String getName() {
		return this.nom;
	}

	public int getBlocage() {
		return this.blocage;
	}
}
