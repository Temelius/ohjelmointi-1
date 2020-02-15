package Ehtorakenteet;

import java.util.Scanner;

public class Ylinopeus {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		System.out.print("Kerro nopeus: ");
		int luku = lukija.nextInt();
		
		if (luku > 120) {
			System.out.println("Ylinopeussakko!");
		}
		
		lukija.close();

	}

}
