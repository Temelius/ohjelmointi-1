package Metodit;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Numerot {

	public static void main(String[] args) {
		List<Integer> arvot = new ArrayList<>();
		arvot.add(12);
		arvot.add(16);
		arvot.add(1);
		arvot.add(-12);
		arvot.add(4);
		
		System.out.println(pienin(arvot));
		System.out.println(suurin(arvot));
		System.out.println(summa(arvot));

	}
	
	public static int pienin(List<Integer> arvot) {
		List<Integer> kopio = new ArrayList<>(arvot);
		Collections.sort(kopio);
		return kopio.get(0);
	}
	
	public static int suurin(List<Integer> arvot) {
		List<Integer> kopio = new ArrayList<>(arvot);
		Collections.sort(kopio);
		return kopio.get(kopio.size() - 1);
	}
	
	public static int summa(List<Integer> arvot) {
		int sum = 0;
		
		for (int i = 0; i < arvot.size(); i++) {
			sum += arvot.get(i);
		}
		
		return sum;
	}

}
