package main;

public class Guerrier {
	String nom;
	String url;
	int niveau_de_vie;
	int force_attaque;
	Arme arme;
	Bouclier bouclier;
	int max_niveau_de_vie = 10;
	int min_niveau_de_vie = 5;
	int max_force_attaque = 10;
	int min_force_attaque = 5;

	public Guerrier () {
		this.nom = "undefined";
		this.url = "undefined";
		this.niveau_de_vie = 5;
		this.force_attaque = 8;
		this.arme= new Arme();
		this.bouclier =new Bouclier();
	}
}