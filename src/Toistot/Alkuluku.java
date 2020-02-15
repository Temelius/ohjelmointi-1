package Toistot;

import java.util.Scanner;

public class Alkuluku {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		
		System.out.print("Syötä jokin positiivinen kokonaisluku: ");
		int luku = lukija.nextInt();
		
		boolean alkuluku = true;
		
		for (int i = 2; i < luku; i++) {
			if (luku % i == 0) {
				alkuluku = false;
			}	
		}
		
        if (alkuluku) {
            System.out.println("Luku " + luku + " on alkuluku.");
        } else {
            System.out.println("Luku " + luku + " ei ole alkuluku.");
        }
        lukija.close();

	}

}
