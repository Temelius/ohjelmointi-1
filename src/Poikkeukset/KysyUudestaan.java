package Poikkeukset;

import java.util.Scanner;

public class KysyUudestaan {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.print("Syötä kokonaisluku: ");
				int luku = lukija.nextInt();
				if (luku == (int)luku) {
					System.out.println("Syötit luvun " + luku + ".");
					break;
				}
			} catch (Exception e) {
				System.out.println("Virheellinen luku!");
				lukija.nextLine();
			}
		}

		lukija.close();
	}

}
