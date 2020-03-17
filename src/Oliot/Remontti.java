package Oliot;

import java.time.LocalDate;

public class Remontti {
	private int vuosi;
	private String kuvaus;
	
	public Remontti() {
		this.vuosi = LocalDate.now().getYear();
	}

	public int getVuosi() {
		return vuosi;
	}

	public boolean setVuosi(int vuosi) {
		if (vuosi > LocalDate.now().getYear()) {
			return false;
		} else {
			this.vuosi = vuosi;
			return true;
		}
	}

	public String getKuvaus() {
		return kuvaus;
	}

	public void setKuvaus(String kuvaus) {
		this.kuvaus = kuvaus;
	}
	
	@Override
	public String toString() {
		return "Vuonna " + vuosi + " tehtiin remontti " + kuvaus;
	}
	
	
}
