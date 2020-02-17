package Merkkijonot;

import java.util.Scanner;

public class RekisterinumeroTarkastin {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		
		while (true) {
			System.out.print("Syötä rekisterinumero (q-kirjain lopettaa): ");
			String reknro = lukija.nextLine();
			if ("q".equals(reknro)) {
				break;
			} else {
				if (reknro.matches("[A-ZÅÖÄ]{2,3}-[0-9]{1,3}")) {
					System.out.println(reknro + " on kelvollinen rekisterinumero.");
				} else {
					System.out.println(reknro + " ei ole kelvollinen rekisterinumero.");
				}
			}
			System.out.println(); // Tyhjä rivi
		}
		lukija.close();
	}

}
