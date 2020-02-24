package Oliot;

public class Artist {
	
	public static void main(String[] args) { // Main metodi testausta varten
		Artist rick = new Artist("Rick", 1966);
		System.out.println(rick.getName());
		System.out.println(rick.getYearOfBirth());

		rick.setName("Rick Astley");
		System.out.println(rick.getName());
	}

    private String name;
    private int yearOfBirth;

    public Artist(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        // Kirjoita tämän metodin toteutus
    	return this.name;
    }

    public void setName(String name) {
        // Kirjoita tämän metodin toteutus
    	this.name = name;
    }

    public int getYearOfBirth() {
        // Kirjoita tämän metodin toteutus
    	return this.yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        // Kirjoita tämän metodin toteutus
    	this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
