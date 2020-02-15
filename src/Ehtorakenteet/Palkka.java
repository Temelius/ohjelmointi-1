package Ehtorakenteet;

import java.util.Scanner;
import java.text.*;

public class Palkka {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		
		DecimalFormat kaksiDesimaalia = new DecimalFormat("0.00");
		
		System.out.print("Anna palkka: ");
		int palkka = lukija.nextInt();
		
		System.out.print("Anna veroprosentti: ");
		int veroprosentti = lukija.nextInt();
		
		System.out.print("Anna ikä: ");
		int ika = lukija.nextInt();
		
		double vero = palkka * veroprosentti / 100;
		
		double tyoElake = 0;
		
		if (ika >= 53 && 62 >= ika) {
			tyoElake = palkka * 0.0825;
		} else {
			tyoElake = palkka * 0.0675;
		}
		
		double tyottomyys = palkka * 0.015;
		
		double netto = palkka - vero - tyottomyys - tyoElake;
		
		String veroForm = kaksiDesimaalia.format(vero);
		String tyoElakeForm = kaksiDesimaalia.format(tyoElake);
		String tyottomyysForm = kaksiDesimaalia.format(tyottomyys);
		String nettoForm = kaksiDesimaalia.format(netto);
		
		System.out.println("Bruttopalkka " + palkka);
		System.out.println("Veron osuus " + veroForm);
		System.out.println("Työeläkevakuutusmaksun osuus " + tyoElakeForm);
		System.out.println("Työttömyysvakuutuksen osuus " + tyottomyysForm);
		System.out.println("Käteen jää " + nettoForm);
		
		lukija.close();

	}

}
