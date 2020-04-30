package main;

public class Guerrier {
	private String nom;
	private String url;
	private int niveau_de_vie;
	private int force_attaque;
	Arme arme;
	Bouclier bouclier;
	private int max_niveau_de_vie = 10;
	private int min_niveau_de_vie = 5;
	private int max_force_attaque = 10;
	private int min_force_attaque = 5;

	public String toString() {
		return this.nom + " est un guerrier. Il a " + this.niveau_de_vie + " et " + this.force_attaque;
	}

	// Les Getters *************************

	public String getName() {
		return this.nom;
	}

	public String getURL() {
		return this.url;
	}

	public int getLife() {
		return this.niveau_de_vie;
	}

	public int getStrong() {
		return this.force_attaque;
	}

	public String getArme() {
		return this.arme.getName();
	}

	public String getBouclier() {
		return this.bouclier.getName();
	}

	// Les Setters *************************

	public void setName(String newValue) {
		this.nom = newValue;
	}

	public void setURL(String newValue) {
		this.url = newValue;
	}
	
	public void setLife(int newValue) {
		this.niveau_de_vie = newValue;
	}

	public void setStrong(int newValue) {
		this.force_attaque = newValue;
	}
	

	
	// Les Constructeurs**********************
	public Guerrier() {
		this.nom = "undefined";
		this.url = "undefined";
		this.niveau_de_vie = 5;
		this.force_attaque = 8;
		this.arme = new Arme();
		this.bouclier = new Bouclier();
	}

	public Guerrier(String nouveau_nom) {
		this.nom = nouveau_nom;
		this.url = "undefined";
		this.niveau_de_vie = 5;
		this.force_attaque = 8;
		this.arme = new Arme();
		this.bouclier = new Bouclier();
	}

	public Guerrier(String nouveau_nom, int nouvelle_vie, int nouvelle_force_attaque) {

		if (nouvelle_vie > max_niveau_de_vie || nouvelle_vie < min_niveau_de_vie
				|| nouvelle_force_attaque > max_force_attaque || nouvelle_force_attaque < min_force_attaque) {
			// le videur nous dit non tu ne rentres pas
			throw new IllegalArgumentException("Paramètre invalide");
		}
		this.nom = nouveau_nom;
		this.url = "undefined";
		this.niveau_de_vie = nouvelle_vie;
		this.force_attaque = nouvelle_force_attaque;
		this.arme = new Arme();
		this.bouclier = new Bouclier();
	}

}