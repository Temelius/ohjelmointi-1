package Oliot;

import java.util.Scanner;

public class RemonttiOhjelma {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		Remontti remontti = new Remontti();
		
		System.out.print("Anna vuosi: ");
		int vuosi = lukija.nextInt();
		if (!remontti.setVuosi(vuosi)) {
			System.out.println("Vuosi ei voi olla tulevaisuudessa");
		} else {
			lukija.nextLine();
			System.out.print("Anna kuvaus: ");
			String kuvaus = lukija.nextLine();
			remontti.setKuvaus(kuvaus);
			
			System.out.println(remontti);
		}
		
		


		lukija.close();

	}

}
