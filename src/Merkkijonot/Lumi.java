package Merkkijonot;

import java.util.Scanner;

public class Lumi {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		
		boolean jatka = true;
		int nimiLaskuri = 0;
		int onLumi = 0;
		
		while (jatka) {
			System.out.print("Anna nimi: ");
			String nimi = lukija.nextLine();
			if (nimi.contentEquals("LOPPU")) {
				jatka = false;
			} else {
				nimiLaskuri++;
				if (nimi.equalsIgnoreCase("lumi")) {
					onLumi++;
				}
			}
		}
		System.out.println("Nimiä oli " + nimiLaskuri + " kappaletta.");
		System.out.println("Nimi Lumi esiintyi " + onLumi + " kertaa.");

		lukija.close();
	}

}
