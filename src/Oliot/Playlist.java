package Oliot;

import java.util.ArrayList;

public class Playlist {
	private ArrayList<Song> songs;

	public static void main(String[] args) {
		Playlist playlist = new Playlist();

		Artist artist = new Artist("Rick Astley", 1966);

		Song song = new Song();
		song.setTitle("Never Gonna Give You Up");
		song.setYear(1987);
		song.setLength(215);
		song.setArtist(artist);

		playlist.addSong(song);

		System.out.println(playlist);
		System.out.println(playlist.getTotalLength());

		Artist artist2 = new Artist("David Hasselhoff", 1952);

		Song song2 = new Song();
		song2.setTitle("Hooked on a Feeling");
		song2.setYear(1997);
		song2.setLength(211);
		song2.setArtist(artist2);

		playlist.addSong(song2);

		System.out.println(playlist);
		System.out.println(playlist.getTotalLength());

	}
	
	public Playlist() {
		this.songs = new ArrayList<Song>();
	}
	
	public void addSong(Song song) {
		songs.add(song);
	}
	
	public Song getSong(int index) {
		try {
			if (index <= this.songs.size() && this.songs.get(index) != null) {
				return this.songs.get(index);
			} else {
				return null;
			}
		} catch (Exception e) {
			// Eipä tule index out of boundsia.
			return null;
		}
		
	}
	
	public int getTotalLength() {
		int sum = 0;
		for (int i = 0; i < this.songs.size(); i++) {
			sum += this.getSong(i).getLength();
		}
		return sum;
		
	}
	
	@Override
	public String toString() {
		String str = "";
		for (int i = 0; i < this.songs.size(); i++) {
			str += (i + 1) + ": " + this.getSong(i) + "\n";
		}
		return str;
	}

}
