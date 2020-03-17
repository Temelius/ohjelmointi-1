package Poikkeukset;

import java.util.Scanner;

public class ArvonTarkastus {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		
			System.out.print("Syötä luku väliltä 0-23: ");
			int luku = lukija.nextInt();
			if (luku >= 0 && 23 >= luku) {
				System.out.println("Luku " + luku + " on sallittu.");
			} else {
				throw new IllegalArgumentException();
			}
			lukija.close();
			
		
		
	}

}
