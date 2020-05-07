package main;

import java.util.*;

public class Plateau {

	public final int PLATEAUJEU_SIZE = 64;
	public ArrayList<Cases> plateaujeu = new ArrayList<Cases>();

	public ArrayList<Cases> creer() {
		for (int i = 0; i < PLATEAUJEU_SIZE; i++) {
			Random rand = new Random();
			int random = rand.nextInt(3);
			if (random == 2) {
				plateaujeu.add(new CaseVide());
			} else if (random == 0) {
				plateaujeu.add(creerCaseEnnemi());
			} else {
				plateaujeu.add(creerCaseBonus());
			}
		}
		return plateaujeu;
	}

	private Cases creerCaseEnnemi() {
		int rand = (int) (Math.random() * 2);
		if (rand == 1) {
			return new CaseOrc();
		} else {
			return new CaseGobelin();
		}
	}

	private Cases creerCaseBonus() {
		int rand = (int) (Math.random() * 2);
		if (rand == 1) {
			return new CaseVie();
		} else {
			return new CaseAttaque();
		}
	}
}
