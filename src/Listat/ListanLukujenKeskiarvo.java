package Listat;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

/**
 * Toteuta ohjelma, joka lukee käyttäjältä lukuja listalle. Syötteiden lukeminen
 * päätetään kun käyttäjä syöttää luvun -1.
 * 
 * Kun lukujen lukeminen lopetetaan, laske listalla olevien lukujen keskiarvo ja
 * tulosta se.
 * 
 * Tämän tehtävän on laatinut Helsingin yliopiston Agile Education Research
 * -tutkimusryhmä. Tehtävä on lisensoitu on lisensoitu Creative Commons BY-NC-SA
 * 4.0 -lisenssillä ja se on julkaistu kurssilla https://ohjelmointi-19.mooc.fi.
 */

public class ListanLukujenKeskiarvo {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		List<Integer> lista = new ArrayList<Integer>();
		
		System.out.println("Syötä kokonaislukuja listalle (-1 lopettaa): ");
		while(true) {
			int input = lukija.nextInt();
			
			if (input == -1) {
				break;
			} else {
				lista.add(input);
			}
		}
		lukija.close();
		System.out.println();
		double summa = 0;
		for (int i : lista) {
			summa += i;
		}
		double keskiarvo = summa / lista.size();
		
		System.out.println("Keskiarvo: " + keskiarvo);
		
	}

}
