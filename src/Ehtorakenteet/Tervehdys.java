package Ehtorakenteet;

import java.time.LocalTime;

public class Tervehdys {

	public static void main(String[] args) {
		LocalTime nykyHetki = LocalTime.now();
		
		int tunnit = nykyHetki.getHour();
		
		if (tunnit >= 7 && 10 > tunnit) {
			
			System.out.println("Hyvää huomenta!");
			
		} else if (tunnit >= 10 && 17 > tunnit) {
			
			System.out.println("Hyvää päivää!");
			
		} else if (tunnit >= 17 && 22 > tunnit) {
			
			System.out.println("Hyvää iltaa!");
			
		} else {
			System.out.println("Hyvää yötä!");
		}

	}

}
