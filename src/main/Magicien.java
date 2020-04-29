package main;


public class Magicien {
	String nom;
	String url;
	int niveau_de_vie;
	int force_attaque;
	Sort sort;
	Philtre philtre;
	int max_niveau_de_vie = 6;
	int min_niveau_de_vie = 3;
	int max_force_attaque = 15;
	int min_force_attaque = 8;
	
	public Magicien () {
		this.nom = "undefined";
		this.url = "undefined";
		this.niveau_de_vie = 5;
		this.force_attaque = 8;
		this.sort= new Sort();
		this.philtre=new Philtre();
	}
	public Magicien (String nouveau_nom) {
		this.nom = nouveau_nom;
		this.url = "undefined";
		this.niveau_de_vie = 5;
		this.force_attaque = 8;
		this.sort= new Sort();
		this.philtre=new Philtre();
	}
	public Magicien (String nouveau_nom, int nouvelle_vie, int nouvelle_force_attaque) {
		this.nom = nouveau_nom;
		this.url = "undefined";
		this.niveau_de_vie = nouvelle_vie;
		this.force_attaque = nouvelle_force_attaque;
		this.sort= new Sort();
		this.philtre=new Philtre();
	}
}

