/* Tee ohjelma Katsastus, jolla voidaan selvittää katsastusasemalla käynnin hinta.

pelkkä jälkitarkastus maksaa 30. (Tällöin ei mitata päästöjä.)
katsastus maksaa 50
jos katsastuksessa mitataan päästö, bensiiniautolla se on 22 ja dieselautolla 31
jos katsastuksessa ei mitata päästöjä, ohjelma ei kysy auton polttoaineen tyyppiä. */

package Ehtorakenteet;

import java.util.Scanner;

public class Katsastus {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		int hinta = 0;
		
		System.out.print("Onko 1=katsastus, 2=jälkitarkastus: ");
		int ensimmainen = lukija.nextInt();
		
		if (ensimmainen == 1) {
			hinta += 50;
			System.out.print("Mitataanko päästöt 0=ei, 1=kyllä: ");
			int toinen = lukija.nextInt();
			switch (toinen) {
				case 0:
					System.out.println("Hinta on " + hinta);
					break;
				case 1:
					System.out.print("Onko auto 0=bensa, 1=diesel: ");
					int kolmas = lukija.nextInt();
					switch (kolmas) {
					case 0:
						hinta += 22;
						System.out.println("Hinta on " + hinta);
						break;
					case 1:
						hinta += 31;
						System.out.println("Hinta on " + hinta);
						break;
					}
					break;
			}
			
		} else if (ensimmainen == 2) {
			System.out.println("Hinta on 30");
		}

		lukija.close();
	}

}
