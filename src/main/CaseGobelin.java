package main;

public class CaseGobelin extends CaseEnnemi {


	public CaseGobelin() {
		super();
		this.eventNom = "Case Gobelin";
		this.nom = "Case Gobelin";
	}

	public String getEvent() {
		return eventNom;
	}

	public String getNom() {
		return nom;
	}

}
