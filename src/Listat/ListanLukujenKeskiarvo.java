package Listat;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

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
		int summa = 0;
		for (int i : lista) {
			summa += i;
		}
		double keskiarvo = summa / lista.size();
		
		System.out.println("Keskiarvo: " + keskiarvo);
		
	}

}
