package Toistot;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Kilometrikorvaus {
	
	public static void main(String[] args) {
		
		DecimalFormat kaksiDesimaalia = new DecimalFormat("0.00");
		Scanner lukija = new Scanner(System.in);
		
		double korvausPkm = 0.43;
		int kmYht = 0;
		
		boolean jatka = true;
		
		while (jatka) {
			System.out.print("Anna ajetut kilometrit (0 lopettaa): ");
			
			int kilometrit = lukija.nextInt();
			
			if (kilometrit != 0) {
				kmYht += kilometrit;
			} else {
				jatka = false;
			}
			
		}
		
		String korvaus = kaksiDesimaalia.format(kmYht * korvausPkm);
		
		System.out.println("Yhteensä " + kmYht + " kilometriä");
		System.out.println("Korvaus on " + korvaus + " euroa");
		
		
		lukija.close();

	}

}
