// Harminder-Singh Saini
// Student Number: 20207736

// Created Abstract entity class
public abstract class Entity {

	// Instance Variables used in the class
	private String name;
	private Date born;
	private double difficulty;
	private int numTicket;

	// Constructor to initialize the name and born date
	public Entity(String name, Date born) {
		this.name = name;
		this.born = born;
	}

	// Constructor to initialize the name born date, and difficulty
	public Entity(String name, Date born, double difficulty) {
		this.name = name;
		this.born = born;
		this.difficulty = difficulty;
	}

	// Setter method to set the name
	public void setName(String name) {
		this.name = name;
	}

	// Setter method to set the born date
	public void setBorn(Date born) {
		this.born = born;
	}

	// Getter method to get the name
	public String getName() {
		return name;
	}

	// Getter method used to get new object born date to prevent privacy leaks
	public Date getBorn() {
		return new Date(born);
	}

	// Getter method used to get the difficulty. No setter methods, so don't need to
	// worry about privacy leak
	public double getDifficulty() {
		return difficulty;

	}

	// To string method to convert into a string
	public String toString() {
		return ("\nName: " + name + "\nBorn at: " + born);
	}

	// Calculates the tickets and returns the value
	public int getAwardedTicketNumber() {
		numTicket = (int) (getDifficulty() * 100);
		return numTicket;
	}

	// Two abstract methods that are defined in the subclasses of entity
	public abstract String entityType();

	public abstract Entity clone();

	// Welcome message method
	public String welcomeMessage() {
		return ("Welcome! Let's start the game! " + entityType() + "\n");
	}

	// Closing message method
	public String closingMessage() {
		return ("Congratudations! The detailed information of the entity you guessed is:" + toString());
	}

	// Copy constructor
	public Entity(Entity other) {
		this.name = other.name;
		this.born = other.born;
		this.difficulty = other.difficulty;
		this.numTicket = other.numTicket;
	}

	// Equals method to check if current entity is equal to the other entity
	public boolean equals(Entity otherEntity) {
		if (otherEntity == null)
			return false;
		else
			return ((name.equals(otherEntity.name)) && (born.equals(otherEntity.born)));
	}

}
