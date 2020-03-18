package Oliot_Bonus;

import java.util.Scanner;

public class AddressBookApp {
	
	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		AddressBook ab = new AddressBook();
		
		help();
		
		
		boolean running = true;
		while(running) {
			System.out.print("> ");
			String command = lukija.next();
			String theRest = lukija.nextLine().trim();
			
			switch (command) {
			case "help":
			    // tulosta ohje
				help();
			    break;
			case "list":
			    // tulosta osoitekirjan koko sisältö
				ab.toString();
			    break;
			case "add":
			    // käytä annettua nimeä, emailia ja puhelinnumeroa luodaksesi uuden yhteystiedon
				String[] parts = theRest.split(",");

				String name = parts[0].trim();
				String email = parts[1].trim();
				String phone = parts[2].trim();
				Contact kontakti = new Contact(name, email, phone);
				if (ab.add(kontakti)) {
					System.out.println("Added " + kontakti.toString());
					break;
				} else {
					System.out.println("That contact already exists.");
					break;
				}
			case "search":
			    // etsi yhteystietoa ja tulosta se
				if (ab.search(theRest) != null) {
					System.out.println(ab.search(theRest));					
				} else {
					System.out.println(theRest + " does not match any contact.");
				}
			    break;
			case "exit":
			    // poistu ohjelmasta
				running = false;
				System.out.println("Bye!");
			    break;
			default:
			    // tunnistamaton komento:
			    System.out.println("Unknown command");
			    break;
			}
		}
		lukija.close();

	}
	
	public static void help() {
		System.out.println("This is an address book application. Available commands:\n"
							+ "list\n"
							+ "help\n"
							+ "add <name>, <email>, <phone>\n"
							+ "search <name>\n"
							+ "exit\n");
	}

}
