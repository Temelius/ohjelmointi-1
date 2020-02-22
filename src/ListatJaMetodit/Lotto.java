package ListatJaMetodit;

import ListatJaMetodit.Leikkaus;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Lotto {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		List<Integer> oikeat = new ArrayList<>();
		List<Integer> tarkistettavat = new ArrayList<>();
		
		System.out.print("Anna oikea rivi (7 numeroa + lisänumero): ");
		for (int i = 0; i < 8; i++) {
			oikeat.add(lukija.nextInt());
		}
		//System.out.println(oikeat);
		
		System.out.print("Anna tarkastettava rivi (7 numeroa): ");
		for (int i = 0; i < 7; i++) {
			tarkistettavat.add(lukija.nextInt());
		}
		
		List<Integer> palautus = Leikkaus.laskeLeikkaus(oikeat, tarkistettavat);
		
		if (tarkistettavat.contains(oikeat.get(oikeat.size() - 1))) {
			System.out.println((palautus.size() - 1) + " oikein ja lisänumero.");
		} else {
			System.out.println(palautus.size() + " oikein.");
		}

		lukija.close();
	}
}
