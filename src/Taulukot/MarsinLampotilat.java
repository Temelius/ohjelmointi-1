package Taulukot;

import java.util.Scanner;
import java.util.Arrays;

public class MarsinLampotilat {
	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		int[] lampotilat = new int[10];
		
		double lampotilatSum = 0;
		
		int i = 0;
		while (i < 10) {
			System.out.print("Syötä mittaus " + (i + 1) + "/10: ");
			int luku = lukija.nextInt();
			if (luku < -140 || luku > 20) {
				System.out.println("Anna lämpötila väliltä -140 - +20!");
			} else {
				lampotilat[i] = luku;
				lampotilatSum += luku;
				i++;
			}
		}
		
		Arrays.sort(lampotilat);
		double keskiarvo = lampotilatSum / lampotilat.length;
		int pienin = lampotilat[0];
		int suurin = lampotilat[9];
		
		System.out.println("Mittausten keskiarvo: " + keskiarvo);
		System.out.println("Pienin mittaustulos: " + pienin);
		System.out.println("Suurin mittaustulos: " + suurin);
		
		lukija.close();
	}
}
