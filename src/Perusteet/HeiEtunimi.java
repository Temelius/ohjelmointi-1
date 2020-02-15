package Perusteet;
import java.util.Scanner;

public class HeiEtunimi {

	public static void main(String[] args) {
		 Scanner lukija = new Scanner(System.in);
		 System.out.println("Syötä etunimi: ");
		 String etunimi = lukija.nextLine();
		 
		 System.out.println("Hei " + etunimi + "!");
		 
	}

}
