package Poikkeukset;

import java.util.Scanner;

public class Summaaja {

	public static void main(String[] args) {
		
		Scanner lukija = new Scanner(System.in);
		
		int sum = 0;
		while(true) {
			try {
				System.out.print("Syötä seuraava luku (0 lopettaa): ");
				int luku = lukija.nextInt();
				if (luku == 0) {	
					break;
				}
				if (luku == (int)luku) {
					sum += luku;
				} 
			} catch (Exception e) {
				System.out.println("Virheellinen syöte!\n");
				lukija.nextLine();
			}
		}
		System.out.println("Lukujen summa on " + sum + ".");
		
		lukija.close();
	}

}
