package Merkkijonot;

import java.util.Scanner;

public class Lento {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		
		System.out.print("Anna lennon numero: ");
		String lennonNumero = lukija.nextLine();
		
		if(lennonNumero.substring(0, 2).equalsIgnoreCase("ay")) {
			lennonNumero = lennonNumero.substring(2, 3);
			int numero = Integer.parseInt(lennonNumero);
			if (numero == 1) {
				System.out.println("Kaukolento");
			} else if (numero > 1 && 7 > numero) {
				System.out.println("Kotimaan lento");
			} else if (numero == 7) {
				System.out.println("Venäjän lento");
			}
		} else {
			System.out.println("Ei ole Finnairin lento");
		}
		
		lukija.close();

	}

}
