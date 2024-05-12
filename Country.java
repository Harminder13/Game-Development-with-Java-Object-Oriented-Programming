// Harminder-Singh Saini
// Student Number: 20207736

public class Country extends Entity {

	// Instance Variable
	private String capital;

	// Constructor for the class that initializes the parents variables and current
	// class variables
	public Country(String name, Date born, String capital, double difficulty) {

		super(name, born, difficulty);
		this.capital = capital;
	}

	// Copy constructor for the country class
	public Country(Country other) {
		super(other);
		this.capital = other.capital;
	}

	// setter method
	public void setCapital(String capital) {
		this.capital = capital;
	}

	// getter method
	public String getCapital() {
		return capital;
	}

	// clone method that uses the copy constructor
	public Country clone() {
		return new Country(this);
	}

	// to string method that add's onto the main method in the parent class
	public String toString() {
		return (super.toString() + "\nCapital: " + capital);
	}

	// Returns the entity type
	public String entityType() {
		return ("This entity is a country!");
	}

}
