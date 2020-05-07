package main;

import java.util.ArrayList;
import java.util.Scanner;

public class DonjonsEtDragons {

	private static ArrayList<Guerrier> guerriers = new ArrayList<Guerrier>();
	private static ArrayList<Magicien> magiciens = new ArrayList<Magicien>();
	private static ArrayList<Cases> plateauJeu = new ArrayList<Cases>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.println(
					"Que souhaitez-vous faire? \n(C)réer des personnages\n(R)echercher \n(L)ister \\n(P)lateau\n(Q)uitter");
			String str = sc.nextLine();

			if (str.equals("C")) {
				CreationPerso.creationPerso(sc, guerriers, magiciens);

			} else if (str.equals("R")) {
				RecherchePerso.recherche(sc, guerriers, magiciens);

			} else if (str.equals("L")) {
				ListerPerso.listerPerso(sc, guerriers, magiciens);

			} else if (str.equals("Q")) {
				System.out.println("Programme terminé!");
				break;
			} else if (str.equals("P")) {
				Plateau plateau = new Plateau();
				plateauJeu = plateau.creer();
				for (int index = 0; index < plateauJeu.size(); index++) {

					System.out.println(plateauJeu.get(index).toString());

				}

			} else {

				System.out.println("La commande n'est pas bonne !!");

			}
		}
		sc.close();
	}
}