package Merkkijonot;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Tuotteet {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		DecimalFormat kaksiDesimaalia = new DecimalFormat("0.00");
		System.out.print("Anna tuotenumero: ");
		int id = lukija.nextInt();
		
		System.out.print("Anna tuotteen nimi: ");
		String nimi = lukija.next();
		
		System.out.print("Anna tuotteen hinta: ");
		double hinta = lukija.nextDouble();
		String hintaForm = kaksiDesimaalia.format(hinta);
		
		System.out.print("Anna tuotteen kuvaus: ");
		String kuvaus = lukija.next();
		
		System.out.println("Numero: " + id);
		System.out.println("Nimi: " + nimi.trim().toUpperCase());
		System.out.println("Hinta: " + hintaForm);
		System.out.println("Kuvaus: " + kuvaus.trim());
		
		lukija.close();
	}

}
