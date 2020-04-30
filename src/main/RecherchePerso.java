package main;

import java.util.ArrayList;
import java.util.Scanner;

public class RecherchePerso {

	public static void recherchePerso(Scanner sc, ArrayList<Guerrier> guerriers, ArrayList<Magicien> magiciens) {
		while (true) {
			System.out.println("Quel personnage recherchez-vous ?");
			String str = sc.nextLine();

			for (int index = 0; index < guerriers.size(); index++) {

				if (guerriers.get(index).getName().equals(str)) {
					System.out.println(guerriers.get(index).toString());
				}
				;
			}
			for (int index = 0; index < magiciens.size(); index++) {
				
				if (guerriers.get(index).getName().equals(str)) {
					System.out.println(guerriers.get(index).toString());
				}
				;
			}

		}
	}
}
