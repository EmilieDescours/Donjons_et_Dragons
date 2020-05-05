package main;

import java.util.ArrayList;
import java.util.Scanner;

public class ModifierPerso {
	public static void modifierPerso(Scanner sc, ArrayList<Guerrier> guerriers, ArrayList<Magicien> magiciens) {
		System.out.println("Quel personnage souhaitez-vous modifier ?");
		String str = sc.nextLine();

		int[] resultatRecherchePerso = RecherchePerso.recherchePerso(str, guerriers, magiciens);
		
	

		if (resultatRecherchePerso[0] == 0) {
			System.out.println("Le personnage n'existe pas !");

		} else if (resultatRecherchePerso[0] == 1) {
			guerriers.get(resultatRecherchePerso[1]);

		} else if (resultatRecherchePerso[0] == 2) {
			magiciens.get(resultatRecherchePerso[1]);
		}
	}

}
