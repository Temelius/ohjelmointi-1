package Oliot;

import java.text.DecimalFormat;

public class Asunto {
	DecimalFormat df = new DecimalFormat("###,###.00");
	private String tyyppi;
	private String osoite;
	private double pinta_ala;
	private double hinta;
	private String kuvaus;
	
	
	
	public Asunto(String tyyppi, String osoite, double pinta_ala, double hinta, String kuvaus) {
		this.tyyppi = tyyppi;
		this.osoite = osoite;
		this.pinta_ala = pinta_ala;
		this.hinta = hinta;
		this.kuvaus = kuvaus;
	}

	public Asunto() {
		
	}
	
	public String getTyyppi() {
		return tyyppi;
	}
	public void setTyyppi(String tyyppi) {
		this.tyyppi = tyyppi;
	}
	public String getOsoite() {
		return osoite;
	}
	public void setOsoite(String osoite) {
		this.osoite = osoite;
	}
	public double getPinta_ala() {
		return pinta_ala;
	}
	public void setPinta_ala(double pinta_ala) {
		this.pinta_ala = pinta_ala;
	}
	public double getHinta() {
		return hinta;
	}
	public void setHinta(double hinta) {
		this.hinta = hinta;
	}
	public String getKuvaus() {
		return kuvaus;
	}
	public void setKuvaus(String kuvaus) {
		this.kuvaus = kuvaus;
	}

	@Override
	public String toString() {
		return "Tyyppi: " + tyyppi 
				+ "\nOsoite: " + osoite 
				+ "\nPinta-ala: " + df.format(pinta_ala) 
				+ "\nHinta: " + df.format(hinta) + " euroa"
				+ "\nKuvaus: " + kuvaus;
	}
	
}
