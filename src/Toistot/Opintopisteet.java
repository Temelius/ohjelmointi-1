package Toistot;

import java.util.Scanner;

public class Opintopisteet {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		
		int tavoitePkk = 30;
		int tavoite = 210;
		int opintopisteet = 0;
		
		System.out.print("Anna lukukausien määrä: ");
		int  lukukaudet = lukija.nextInt();
		
		for (int i = 1; i <= lukukaudet; i++) {
			System.out.print("Anna " + i + ". lukukauden opintopisteesi: ");
			int lukukausi = lukija.nextInt();
			opintopisteet += lukukausi;
		}
		
		int tarvittavatOP = lukukaudet * tavoitePkk;
		int puuttuvatOP = tavoite - opintopisteet;
		
		System.out.println("Sinulla pitäisi olla tähän mennessä " + tarvittavatOP + " opintopistettä.");
		System.out.println("Sinulla on " + opintopisteet + " opintopistettä.");
		
		if (tarvittavatOP > opintopisteet) {
			System.out.println("Olet jäljessä tavoitteesta.");
		} else if (tarvittavatOP < opintopisteet) {
			System.out.println("Olet edellä tavoitteesta.");
		} else {
			System.out.println("Olet tavoitteessa.");
		}
		
		System.out.println("Tutkinnosta puuttuu vielä " + puuttuvatOP + " opintopistettä.");
		
		lukija.close();
	}

}
