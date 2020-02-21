package ListatJaMetodit;

import java.util.List;
import java.util.ArrayList;

/*
 * Tässä tehtävässä sinun tulee kirjoittaa luokka Leikkaus. 
 * Leikkaus-luokassa on oltava laskeLeikkaus-niminen metodi täsmälleen seuraavan kuvauksen mukaisena:
 * 
 * metodi on julkinen
 * metodi on staattinen eli luokkametodi
 * metodi palauttaa uuden listan, joka on tyyppiä List<Integer>
 * metodi saa parametriarvoinaan kaksi kokonaislukulistaa (List<Integer>)
 * metodi palauttaa leikkauksen kahdesta annetusta listasta, eli sellaisen listan, 
 ** joka sisältää kaikki sellaiset luvut, jotka ovat molemmissa parametriarvoina saaduissa listoissa
 * kukin luku saa esiintyä leikkauksessa korkeintaan kerran
 * leikkauksen lukujen järjestyksellä ei ole merkitystä.
 */

public class Leikkaus {

	public static void main(String[] args) {
		List<Integer> lista1 = new ArrayList<>();
		lista1.add(-70);
		lista1.add(120);
		lista1.add(98);
		lista1.add(1);
		lista1.add(789);
		
		List<Integer> lista2 = new ArrayList<>();
		lista2.add(98);
		lista2.add(42);
		lista2.add(5);
		lista2.add(1);
		lista2.add(-70);
		
		System.out.println(laskeLeikkaus(lista1, lista2));
	}
	
	public static List<Integer> laskeLeikkaus(List<Integer> ekaLista, List<Integer> tokaLista) {
		List<Integer> lista = new ArrayList<>();
		for (int i = 0; i < ekaLista.size(); i++) {
			if (tokaLista.contains(ekaLista.get(i))) {
				lista.add(ekaLista.get(i));
			}
		}
		return lista;
	}
	

}
