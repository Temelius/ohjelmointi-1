package Taulukot;

import java.util.Scanner;

public class MerkkijononPalat {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		
		System.out.print("Kirjoita lause: ");
		String lause = lukija.nextLine();
		String[] pilkottu = lause.split(" ");
		
		for (String i : pilkottu) {
			System.out.println(i);
		}
		
		lukija.close();

	}

}
