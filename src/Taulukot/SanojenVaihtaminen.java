package Taulukot;

import java.util.Scanner;

public class SanojenVaihtaminen {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		
		System.out.print("Kirjoita lause: ");
		String lause = lukija.nextLine();
		String[] taulu = lause.trim().split(" ");
		
		System.out.println("Mitkä sanat vaihdetaan keskenään?");
		int luku1 = lukija.nextInt();
		int luku2 = lukija.nextInt();
		
		String kopio = taulu[luku1];
		taulu[luku1] = taulu[luku2];
		taulu[luku2] = kopio;
		
		for (int i = 0; i < taulu.length; i++) {
			System.out.print(taulu[i] + " ");
		}
		
		//System.out.println(Arrays.toString(taulu));
		
		lukija.close();
		
	}

}
