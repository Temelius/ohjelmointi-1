package Merkkijonot;

import java.util.Scanner;

public class AlkuTulostin {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		
		System.out.print("Kirjoita sana: ");
		String sana = lukija.nextLine().trim();
		
		for (int i = 1; i <= sana.length(); i++) {
			System.out.println(sana.substring(0, i));
		}
		
		lukija.close();

	}

}
