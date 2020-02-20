package Taulukot;

import java.util.Scanner;
import java.util.Arrays;

/* Toteuta ohjelma Mars-planeetan lämpötilamittausten tarkasteluun.
 * Marsin alin lämpötila (pinnalla) on -140 astetta, korkein lämpötila on 20 astetta. 
 * Ohjelmalle tulee syöttää 10 hyväksyttyä mittaustulosta, jotka ohjelma kerää int[]-tyyppiseen taulukkoon, 
 * jonka pituus on 10. Jos käyttäjä syöttää luvun, joka on pienempi kuin -140 tai suurempi kuin 20, 
 * lukua ei laiteta taulukkoon vaan se pyydetään uudelleen esimerkkisuorituksen mukaisesti.
 * Lopuksi ohjelman tulee tulostaa lämpötilamittausten keskiarvo sekä minimi- ja maksimiarvot. 
 * Tehtävässä on tarkoitus harjoitella taulukoiden käyttöä, joten listojen käyttäminen on tässä tehtävässä kiellettyä.
 * Huom! Älä pyöristä lopussa tulostettavaa keskiarvoa */

public class MarsinLampotilat {
	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		int[] lampotilat = new int[10];
		
		int i = 0;
		while (i < 10) {
			System.out.print("Syötä mittaus " + (i + 1) + "/10: ");
			int luku = lukija.nextInt();
			if (luku < -140 || luku > 20) {
				System.out.println("Anna lämpötila väliltä -140 - +20!");
			} else {
				lampotilat[i] = luku;
				i++;
			}
		}
		System.out.println(Arrays.toString(lampotilat));
		/*
		 * TODO Alla oleva ei toimi tällä hetkellä
		int pienin = lampotilat[0];
		int suurin = lampotilat[0];
		
		for (int x = 0; x < lampotilat.length; i++) {
			if (pienin > lampotilat[x]) {
				pienin = lampotilat[x];
			}
			if (suurin < lampotilat[x]) {
				suurin = lampotilat[x];
			}
		}
		
		System.out.println("Pienin mittaustulos: " + pienin);
		System.out.println("Suurin mittaustulos: " + suurin); */
		
		lukija.close();
	}
}
