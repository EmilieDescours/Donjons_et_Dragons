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
	public Guerrier (String nouveau_nom) {
		this.nom = nouveau_nom;
		this.url = "undefined";
		this.niveau_de_vie = 5;
		this.force_attaque = 8;
		this.arme= new Arme();
		this.bouclier =new Bouclier();
	}
	
	public Guerrier (String nouveau_nom, int nouvelle_vie, int nouvelle_force_attaque) {
		if(nouvelle_vie > max_niveau_de_vie || nouvelle_vie < min_niveau_de_vie || nouvelle_force_attaque > max_force_attaque || nouvelle_force_attaque < min_force_attaque) {
			// le videur nous dit non tu ne rentres pas
			throw new IllegalArgumentException("Paramètre invalide");
		}
		this.nom = nouveau_nom;
		this.url = "undefined";
		this.niveau_de_vie = nouvelle_vie;
		this.force_attaque = nouvelle_force_attaque;
		this.arme= new Arme();
		this.bouclier =new Bouclier();
	}
	
}