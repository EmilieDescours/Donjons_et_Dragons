package main;

public class Sort {
	String nom ;
	int force_attaque;
	
	public Sort () {
		this.nom = "undefined";
		this.force_attaque= 1;
		
	
	}
	public String getName() {
		return this.nom;
	}
	
	public int getStrong() {
		return this.force_attaque;
	}
}
