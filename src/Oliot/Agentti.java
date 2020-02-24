package Oliot;

public class Agentti {
	
    private String etunimi;
    private String sukunimi;
    
    public static void main(String[] args) {
		
    	Agentti bond = new Agentti("James", "Bond");
    	
    	bond.toString();
    	System.out.println(bond);
    	
	}
    
    public Agentti(String etunimi, String sukunimi) {
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
    }

    public String toString() {
        return "My name is " + sukunimi + ", " + etunimi + " " + sukunimi;
    }
}