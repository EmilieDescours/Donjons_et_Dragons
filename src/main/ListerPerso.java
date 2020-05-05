package main;

import java.util.ArrayList;
import java.util.Scanner;

public class ListerPerso {
	public static void listerPerso(Scanner sc, ArrayList<Guerrier> guerriers, ArrayList<Magicien> magiciens) {

		for (int index = 0; index < guerriers.size(); index++) {

			System.out.println(guerriers.get(index).toString());

		}
		for (int index = 0; index < magiciens.size(); index++) {

			System.out.println(magiciens.get(index).toString());

		}
	}
}