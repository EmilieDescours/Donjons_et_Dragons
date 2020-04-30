package main;

import java.util.ArrayList;
import java.util.Scanner;

public class DonjonsEtDragons {

	private static ArrayList<Guerrier> guerriers = new ArrayList<Guerrier>();
	private static ArrayList<Magicien> magiciens = new ArrayList<Magicien>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.println("Que souhaitez-vous faire? \n(C)réer des personnages\n(Q)uitter");
			String str = sc.nextLine();

			if (str.equals("C")) {
				CreationPerso.creationPerso(sc, guerriers, magiciens);

			} else if (str.equals("Q")) {
				System.out.println("Programme terminé!");
				break;

			} else {

				System.out.println("La commande n'est pas bonne !!");

			}
		}
		sc.close();
	}
}