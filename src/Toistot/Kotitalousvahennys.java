package Toistot;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Kotitalousvahennys {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		DecimalFormat kaksiDesimaalia = new DecimalFormat("0.00");
		
		double tyokorvausYht = 0;
		boolean jatka = true;
		
		while (jatka) {
			System.out.print("Anna työkorvauksen määrä (0 lopettaa): ");
			double tyokorvaus = lukija.nextDouble();
			if (tyokorvaus != 0) {
				tyokorvausYht += tyokorvaus;
			} else {
				jatka = false;
			}
		}
		
		lukija.close();
		
		double kotitalous = tyokorvausYht * 50 / 100.0 - 100;
		if (kotitalous > 2400) {
			kotitalous = 2400;
		} else if (0 > kotitalous) {
			kotitalous = 0;
		}
		
		String kotitalousForm = kaksiDesimaalia.format(kotitalous);
		
		System.out.println("Kotitalousvähennyksen määrä on " + kotitalousForm + " euroa");
		
	}

}
