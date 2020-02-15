package Perusteet;

import java.util.Scanner;

public class Bitcoin {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		double arvo = 15.06;
		
		System.out.println("Anna Bitcoineihin investoidun rahan määrä: ");
		double investointi = lukija.nextDouble();
		
		double tuotto = investointi * arvo - investointi;
		
		System.out.println("Bitcoin tuotti vuodessa " + tuotto + " euroa");
		

		lukija.close();
	}

}
