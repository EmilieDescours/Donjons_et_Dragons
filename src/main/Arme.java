package main;

public class Arme {
	private String nom;
	private int force_attaque;

	public Arme() {
		this.nom = "undefined";
		this.force_attaque = 1;

	}

	public String getName() {
		return this.nom;
	}
	
	public int getStrong() {
		return this.force_attaque;
	}
}
