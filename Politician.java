// Harminder-Singh Saini
// Student Number: 20207736

public class Politician extends Person {
	private String party;

	// Constructor for the class that initializes the parents variables and current
	// class variables
	public Politician(String name, Date born, String gender, String party, double difficulty) {

		super(name, born, gender, difficulty);
		this.party = party;
	}

	// Copy constructor for the Politician class
	public Politician(Politician other) {
		super(other);
		this.party = other.party;
	}

	// Setter method
	public void setParty(String party) {
		this.party = party;
	}

	// getter method
	public String getParty() {
		return party;
	}

	// clone method that uses the copy constructor
	public Person clone() {
		return new Politician(this);
	}

	// to string method that add's onto the main method in the parent class
	public String toString() {
		return (super.toString() + "\nParty: " + party);
	}

	// Returns the entity type
	public String entityType() {
		return ("This entity is a Politician!");
	}
}
