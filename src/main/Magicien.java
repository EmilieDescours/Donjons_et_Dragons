package main;

public class Magicien extends Personnage {

	private Sort sort;
	private Philtre philtre;
	private int max_niveau_de_vie = 6;
	private int min_niveau_de_vie = 3;
	private int max_force_attaque = 15;
	private int min_force_attaque = 8;

	public String toString() {
		return this.nom + " est un magicien. Il a " + this.niveau_de_vie + " et " + this.force_attaque;
	}
	// Les constructeurs ***********************

	public Magicien() {
		this.nom = "undefined";
		this.url = "undefined";
		this.niveau_de_vie = 5;
		this.force_attaque = 8;
		this.sort = new Sort();
		this.philtre = new Philtre();
	}

	public Magicien(String nouveau_nom) {
		this.nom = nouveau_nom;
		this.url = "undefined";
		this.niveau_de_vie = 5;
		this.force_attaque = 8;
		this.sort = new Sort();
		this.philtre = new Philtre();
	}

	public Magicien(String nouveau_nom, int nouvelle_vie, int nouvelle_force_attaque) {
		if (nouvelle_vie > max_niveau_de_vie || nouvelle_vie < min_niveau_de_vie
				|| nouvelle_force_attaque > max_force_attaque || nouvelle_force_attaque < min_force_attaque) {
			// le videur nous dit non tu ne rentres pas
			throw new IllegalArgumentException("Paramètre invalide");
		}
		this.nom = nouveau_nom;
		this.url = "undefined";
		this.niveau_de_vie = nouvelle_vie;
		this.force_attaque = nouvelle_force_attaque;
		this.sort = new Sort();
		this.philtre = new Philtre();
	}
	// Les Setters *************************

	public void setSort(Sort newValue) {
		this.sort = newValue;

	}

	public void setPhiltre(Philtre newValue) {
		this.philtre = newValue;
	}
	// Les Getters *************************

	public String getSort() {
		return this.sort.getName();
	}

	public String getPhiltre() {
		return this.philtre.getName();
	}
}
