package Perusteet;

import java.util.Scanner;

public class Cooper {

	public static void main(String[] args) {
		
		Scanner lukija = new Scanner(System.in);
		
		System.out.println("Anna juostu matka: ");
		int matka = lukija.nextInt();
		
		int kierrokset = matka / 400;
		
		System.out.println("Kokonaisia 400 metrin kierroksia oli " + kierrokset);
		
		lukija.close();

	}

}
