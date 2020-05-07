package main;

public abstract class  Personnages {

	protected String nom;
	protected String url;
	protected int niveau_de_vie;
	protected int force_attaque;

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

}
