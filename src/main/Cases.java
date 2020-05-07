package main;

public abstract class Cases {

	protected String nom;
	protected String eventNom;

	public Cases() {	
	}
	
	@Override
	public String toString() {
		return eventNom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}
}
