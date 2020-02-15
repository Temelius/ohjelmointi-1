package Perusteet;

import java.util.Scanner;

public class Juhlat {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		
		double pullonAnnokset = 7;
		
		System.out.println("Anna juhliin tulevien aikuisten määrä: ");
		double aikuiset = lukija.nextInt();
		
		int pullojenTarve = (int) Math.ceil(aikuiset / pullonAnnokset);
		
		int pullonJaannos = (int) Math.ceil(pullojenTarve * pullonAnnokset - aikuiset);
		
		
		System.out.println("Pulloja tarvitaan " + pullojenTarve + " kappaletta");
		
		System.out.println("Viimeisestä pullosta jää " + pullonJaannos + " lasia");
		
		lukija.close();

	}

}
