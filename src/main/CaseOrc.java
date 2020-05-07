package main;

public class CaseOrc extends CaseEnnemi {


	public CaseOrc() {
		super();
		this.eventNom = "Case Orc";
		this.nom = "Case Orc";
	}

	public String getEvent() {
		return eventNom;
	}

	public String getNom() {
		return nom;
	}

	public void setEventNom(String eventNom) {
		this.eventNom = eventNom;
	}
}
