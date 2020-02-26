package Oliot;

public class Song {
	private String title;
	private Artist artist;
	
	private int year;
	private int length;
	
	public static void main(String[] args) {
		Artist artist = new Artist("Matti & Teppo", 1920);
		Song kappale = new Song();
		kappale.setTitle("Mä joka päivä töitä teen");
		kappale.setArtist(artist);
		kappale.setYear(1945);
		kappale.setLength(13);
		System.out.println(kappale.toString());
	}
	
	public Song() {
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	@Override
	public String toString() {
		if(this.getArtist() != null) {
			return this.getTitle() + " by " + this.getArtist();	
		} else {
			return this.getTitle();
		}

	}
	


}
