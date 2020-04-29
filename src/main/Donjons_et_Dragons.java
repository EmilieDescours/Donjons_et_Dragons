package main;

import java.util.Scanner;

public class Donjons_et_Dragons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true){

			Scanner sc = new Scanner(System.in); 
			System.out.println("Quel personnage souhaitez-vous créer ?: (G)uerrier ou (M)agicien ");
			String str = sc.nextLine();
			System.out.println("Vous avez saisi : " + str);
			if(str.equals("G")) {
				Guerrier jo = new Guerrier();
				System.out.println(jo.nom);
			}
			else if (str.equals("M")) {
				Magicien lulu = new Magicien();
				System.out.println(lulu.nom);
			}
			
		}
	}
}

