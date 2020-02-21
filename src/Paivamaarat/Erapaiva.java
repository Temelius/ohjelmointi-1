package Paivamaarat;

import java.util.Scanner;
import java.time.LocalDate;

public class Erapaiva {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		
		System.out.print("Anna laskun päivämäärä (vvvv-kk-pp): ");
		String luku = lukija.nextLine();
		
		LocalDate erapaiva = LocalDate.parse(luku).plusDays(14);
		
		System.out.println("Eräpäivä on " + erapaiva);
		
		lukija.close();
	}
}
