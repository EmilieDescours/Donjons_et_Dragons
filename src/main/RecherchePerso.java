package main;

import java.util.ArrayList;
import java.util.Scanner;

public class RecherchePerso {

	public static int[] recherchePerso(String name, ArrayList<Guerrier> guerriers, ArrayList<Magicien> magiciens) {


		int[] resultatRecherche = new int[2];
		resultatRecherche[0] = 0;
		resultatRecherche[1] = 0;

		for (int index = 0; index < guerriers.size(); index++) {

			if (guerriers.get(index).getName().equals(name)) {
				System.out.println(guerriers.get(index).toString());
				resultatRecherche[0] = 1 ;
				resultatRecherche[1] = index ;
				return resultatRecherche;
			}

		}
		for (int index = 0; index < magiciens.size(); index++) {

			if (magiciens.get(index).getName().equals(name)) {
				System.out.println(magiciens.get(index).toString());
				resultatRecherche[0] = 2;
				resultatRecherche[1] = index;
				return resultatRecherche;
			}

		}
		return resultatRecherche;
	}

	public static void recherche(Scanner sc, ArrayList<Guerrier> guerriers, ArrayList<Magicien> magiciens) {
		System.out.println("Quel personnage recherchez-vous ?");
		String str = sc.nextLine();
		recherchePerso(str, guerriers, magiciens);
	}

}
