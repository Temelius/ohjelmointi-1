package Perusteet;

import java.util.Scanner;

public class Puoluetuki {

	public static void main(String[] args) {
		
		int puolueTuki = 148175;
		
		Scanner lukija = new Scanner(System.in);
		
		System.out.println("Anna kansanedustajien lukumäärä: ");
		int kansanEdustajat = lukija.nextInt();
		
		System.out.println("Puoluetuen määrä on " + kansanEdustajat * puolueTuki + " euroa");
		
		lukija.close();

	}

}
