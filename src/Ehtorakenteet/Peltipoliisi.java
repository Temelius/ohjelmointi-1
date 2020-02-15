package Ehtorakenteet;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Peltipoliisi {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		DecimalFormat kaksiDesimaalia = new DecimalFormat("0.00");
		
		System.out.print("Anna nopeutesi: ");
		int nopeus = lukija.nextInt();
		
		if (nopeus > 80 && 100 >= nopeus) {
			
			System.out.println("Rikesakko");
			
		} else if (nopeus > 100) {
			
			System.out.println("Päiväsakko");
			System.out.print("Anna nettokuukausitulosi: ");
			double nettotulo = lukija.nextDouble();
			
			double sakko = (nettotulo - 255) / 60;
			if (sakko < 6) {
				sakko = 6;
			}
			String sakkoForm = kaksiDesimaalia.format(sakko);
			System.out.println("Päiväsakon määrä on " + sakkoForm + " euroa");
			
		} else {
			System.out.println("Ei sakkoja");
		}
		
		lukija.close();
	}

}
