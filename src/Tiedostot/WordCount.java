package Tiedostot;

import java.util.Scanner;
import java.util.*; 
import java.nio.charset.StandardCharsets; 
import java.nio.file.*; 
import java.io.IOException;

public class WordCount {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		
		int riviCount = 0;
		int sanaCount = 0;
		int merkkiCount = 0;
		
		System.out.print("Anna tiedoston nimi: ");
		String f = lukija.nextLine().trim();
		// Tiedosto projektin juurikansiossa.
		//String f = "lipsum.txt";
		
		
		try {
			List<String> rivit = Files.readAllLines(Paths.get(f), StandardCharsets.UTF_8);
			riviCount = rivit.size();
			sanaCount = rivit.toString().split(" ").length;
			
			for (String rivi : rivit) {
				merkkiCount += rivi.length();
				if (rivi.length() < 1) {
					sanaCount--;
				}
			}
			
			System.out.println(
					"Tiedostossa on: \n" 
					+ riviCount + " riviä\n"
					+ sanaCount + " sanaa\n"
					+ merkkiCount + " merkkiä"
			);
			
		} catch (IOException e) {
			System.out.println(e);
		}
		
		lukija.close();
	}

}
