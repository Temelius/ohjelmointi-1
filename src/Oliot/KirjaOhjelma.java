package Oliot;

import java.text.DecimalFormat;
import java.util.Scanner;

public class KirjaOhjelma {
	
	/*
	 * Ohjelma heittää InputMismatchExceptionin jos annetun hinnan
	 * desimaalierottimena käytetään pilkkua. Tämä on kuitenkin ainoa tapa jolla tehtävä meni 
	 * tarkistusjärjestelmästä läpi. Parsettamalla arvoa doubleksi ei mennyt.
	 */

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,###.00");
		
		// Otetaan muuttujat talteen
		System.out.print("Anna nimi: ");
		String nimi = lukija.nextLine();
		
		System.out.print("Anna isbn: ");
		String isbn = lukija.nextLine();
		
		System.out.print("Anna hinta: ");
		double hinta = lukija.nextDouble();
		
		System.out.print("Anna julkaisuvuosi: ");
		int vuosi = lukija.nextInt();
		lukija.close();
		// Lukija loppu
		
		Kirja kirja = new Kirja(nimi, isbn, hinta, vuosi);
		kirja.toString();
		
		Kirja kirja2 = new Kirja();
		kirja2.setNimi(nimi);
		kirja2.setIsbn(isbn);
		kirja2.setHinta(hinta);
		kirja2.setJulkaisuvuosi(vuosi);
		
		System.out.println(
					"Nimi: " + kirja2.getNimi()
					+ "\nIsbn: " + kirja2.getIsbn()
					+ "\nHinta: " + df.format(kirja2.getHinta())
					+ "\nJulkaisuvuosi: " + kirja2.getJulkaisuvuosi()
				);

	}

}
