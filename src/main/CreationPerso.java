package main;

import java.util.Scanner;
import java.util.ArrayList;

public class CreationPerso {

	private static Guerrier jo;
	private static Magicien lulu;

	private static int vie;
	private static int force;

	/**
	 * 
	 * 
	 * @param sc
	 * @param guerriers
	 * @param magiciens
	 */
	public static void creationPerso(Scanner sc, ArrayList<Guerrier> guerriers, ArrayList<Magicien> magiciens) {
		while (true) {

			System.out.println("Quel personnage souhaitez-vous créer ?: (G)uerrier ou (M)agicien ou (Q)uitter ");
			String str = sc.nextLine();
			if (!str.equals("G") && !str.equals("M") && !str.equals("Q")) {
				System.out.println("Commande non reconnue, recommencez");
				continue;
			}
			if (str.equals("Q")) {
				System.out.println("Retour au menu précédent");
				break;
			}
			System.out.println("Quel nom voulez-vous donner à votre personnage ?");
			String nom = sc.nextLine();
			System.out.println("Combien de vie voulez-vous donner à votre personnage ?");
			try {
				vie = sc.nextInt();
			} catch (Exception InputMismatchException) {
				System.out.println("Paramètre invalide");
				vie = 0;
			}
			System.out.println("Combien de force voulez-vous donner à votre personnage ?");
			try {
				force = sc.nextInt();
			} catch (Exception InputMismatchException) {
				System.out.println("Paramètre invalide");
				force = 0;
			}

			System.out.println("Vous avez saisi : " + str);

			if (str.equals("G")) {
				if (!nom.equals("") && vie != 0 && force != 0) {
					try {
						jo = new Guerrier(nom, vie, force);
						System.out.println(jo.getName() + " " + jo.getLife() + " " + jo.getStrong());
					} catch (Exception IllegalArgumentException) {
						System.out.println("Paramètre invalide");
						vie = 0;
						force = 0;
					}
				}

				else if (!nom.equals("") && vie == 0 && force == 0) {
					jo = new Guerrier(nom);
					System.out.println(jo.getName());
				} else {
					jo = new Guerrier();
					System.out.println(jo.getName());
				}
				guerriers.add(jo);
			} else if (str.equals("M")) {

				if (!nom.equals("") && vie != 0 && force != 0) {
					try {
						lulu = new Magicien(nom, vie, force);
						System.out.println(lulu.getName() + " " + lulu.getLife() + " " + lulu.getStrong());
					} catch (Exception IllegalArgumentExeception) {
						System.out.println("Paramètre invalide");
						vie = 0;
						force = 0;
					}
				} else if (!nom.equals("")) {

					lulu = new Magicien(nom);
					System.out.println(lulu.getName());
				} else {
					lulu = new Magicien();
					System.out.println(lulu.getName());

				}
				magiciens.add(lulu);
			}
			for (int index = 0; index < guerriers.size(); index++) {
				System.out.println(guerriers.get(index));
			}
			for (int index = 0; index < magiciens.size(); index++) {
				System.out.println(magiciens.get(index));
			}
			sc.nextLine();
		}
		
	}
}
