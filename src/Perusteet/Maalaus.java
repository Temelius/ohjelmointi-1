package Perusteet;

import java.util.Scanner;
import java.text.*;

public class Maalaus {

	public static void main(String[] args) {
		
		Scanner lukija = new Scanner(System.in);
		System.out.println("Anna huoneen leveys, pituus ja korkeus: ");
		double leveys = lukija.nextDouble();
		double pituus = lukija.nextDouble();
		double korkeus = lukija.nextDouble();
		System.out.println("Paljonko litralla saadaan maalattua neliöitä: ");
		int neliotPerLitra = lukija.nextInt();
		
		double sum = (leveys + leveys + pituus + pituus) * korkeus / neliotPerLitra;
		
		DecimalFormat kaksiDesimaalia = new DecimalFormat("0.00");
		
		String muotoiltu = kaksiDesimaalia.format(sum);
		
		System.out.println("Maalin tarve on " + muotoiltu + " litraa");
		
		lukija.close();

	}

}
