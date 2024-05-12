// Harminder-Singh Saini
// Student Number: 20207736

public class Person extends Entity {

	// Instance Variable
	private String gender;

	// Constructor for the class that initializes the parents variables and current
	// class variables
	public Person(String name, Date born, String gender, double difficulty) {

		super(name, born, difficulty);
		this.gender = gender;
	}

	// Copy constructor for the person class
	public Person(Person other) {
		super(other);
		this.gender = other.gender;
	}

	// Setter method
	public void setGender(String gender) {
		this.gender = gender;
	}

	// getter method
	public String getGender() {
		return gender;
	}

	// clone method that uses the copy constructor
	public Person clone() {
		return new Person(this);
	}

	// to string method that add's onto the main method in the parent class
	public String toString() {
		return (super.toString() + "\nGender: " + gender);
	}

	// Returns the entity type
	public String entityType() {
		return ("This entity is a person!");
	}
}
