package Oliot;

import java.util.Scanner;

public class AsuntoOhjelma {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		
		System.out.print("Anna asunnon tyyppi: ");
		String tyyppi = lukija.nextLine();
		
		System.out.print("Anna osoite: ");
		String osoite = lukija.nextLine();
		
		System.out.print("Anna pinta-ala: ");
		double pinta_ala = lukija.nextDouble();
		
		System.out.print("Anna hinta: ");
		double hinta = lukija.nextDouble();
		lukija.nextLine();
		System.out.print("Anna kuvaus: ");
		String kuvaus = lukija.nextLine();
		
		Asunto asunto = new Asunto(tyyppi, osoite, pinta_ala, hinta, kuvaus);
		
		System.out.println(asunto.toString());
		lukija.close();
		

	}

}
