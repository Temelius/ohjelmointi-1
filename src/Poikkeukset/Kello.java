package Poikkeukset;

public class Kello {
	private int tunnit;
	private int minuutit;
	
	public Kello(int tunnit, int minuutit) {
		if (tarkistaTunnit(tunnit) && tarkistaMinuutit(minuutit)) {
			this.tunnit = tunnit;
			this.minuutit = minuutit;			
		} else {
			throw new IllegalArgumentException("Virheellinen kellonaika");
		}
	}

	public int getTunnit() {
		return tunnit;
	}

	public void setTunnit(int tunnit) {
		if (tarkistaTunnit(tunnit)) {
			this.tunnit = tunnit;			
		} else {
			throw new IllegalArgumentException("Virheellinen kellonaika");
		}
	}

	public int getMinuutit() {
		return minuutit;
	}

	public void setMinuutit(int minuutit) {
		if(tarkistaMinuutit(minuutit)) {
			this.minuutit = minuutit;			
		} else {
			throw new IllegalArgumentException("Virheellinen kellonaika");
		}
	}
	
	public void lisaaMinuutit(int mins) {
		if (mins < 0) {
			throw new IllegalArgumentException("Virheellinen kellonaika");
		} else {
			int tmpMins = this.minuutit + mins;
			if (tmpMins > 59) {
				this.minuutit = tmpMins - 60;
				if (this.tunnit > 22) {
					this.tunnit = 0;
				} else {
					this.tunnit += 1;
				}
			} else {
				this.minuutit += mins;
			}
		}
	}
	
	public boolean tarkistaTunnit (int tunnit) {
		if (tunnit < 23 && 0 < tunnit) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean tarkistaMinuutit (int minuutit) {
		if (minuutit < 59 && 0 < minuutit) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		String mins = String.format("%02d", minuutit);
		return tunnit + ":" + mins;
	}
}
