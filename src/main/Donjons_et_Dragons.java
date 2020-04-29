package main;

import java.util.Scanner;

public class Donjons_et_Dragons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vie;
		int force;
		while (true) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Quel personnage souhaitez-vous créer ?: (G)uerrier ou (M)agicien ");
			String str = sc.nextLine();
			System.out.println("Quel nom voulez-vous donner à votre personnage ?");
			String nom = sc.nextLine();
			System.out.println("Combien de vie voulez-vous donner à votre personnage ?");
			try {
				vie = sc.nextInt();
			}catch(Exception InputMismatchException){
				System.out.println("Paramètre invalide");
				vie = 0;
			}
			System.out.println("Combien de force voulez-vous donner à votre personnage ?");
			try {
				force = sc.nextInt();
			}catch(Exception InputMismatchException){
				System.out.println("Paramètre invalide");
				force = 0;
			}
			
			System.out.println("Vous avez saisi : " + str);
			
			if (str.equals("G")) {
				if (!nom.equals("") && vie != 0 && force != 0) {
					try {
						Guerrier jo = new Guerrier(nom, vie, force);
						System.out.println(jo.nom + " " + jo.niveau_de_vie + " " + jo.force_attaque);
					} catch (Exception IllegalArgumentException) {
						System.out.println("Paramètre invalide");
						vie = 0;
						force = 0;
					}
				}
				
				if (!nom.equals("") && vie == 0 && force == 0) {
					Guerrier jo = new Guerrier(nom);
					System.out.println(jo.nom);
				} else {
					Guerrier jo = new Guerrier();
					System.out.println(jo.nom);
				}
			} else if (str.equals("M")) {
				
				if (!nom.equals("") && vie != 0 && force != 0) {
					try {
						Magicien lulu = new Magicien(nom, vie, force);
						System.out.println(lulu.nom + " " + lulu.niveau_de_vie + " " + lulu.force_attaque);
					}catch (Exception IllegalArgumentExeception ) {
						System.out.println("Paramètre invalide");
						vie = 0;
						force = 0;
					}
					}
					

				else if (!nom.equals("")) {

					Magicien lulu = new Magicien(nom);
					System.out.println(lulu.nom);
				} else {
					Magicien lulu = new Magicien();
					System.out.println(lulu.nom);

				}

			}
		}
	}
}
