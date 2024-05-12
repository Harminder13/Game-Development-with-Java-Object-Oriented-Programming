// Harminder-Singh Saini
// Student Number: 20207736

public class Singer extends Person {
	private String debutAlbum;
	private Date releaseDate;

	// Constructor for the class that initializes the parents variables and current
	// class variables
	public Singer(String name, Date born, String gender, String debutAlbum, Date releaseDate, double difficulty) {

		super(name, born, gender, difficulty);
		this.debutAlbum = debutAlbum;
		this.releaseDate = releaseDate;
	}

	// Copy constructor for the Singer class
	public Singer(Singer other) {
		super(other);
		this.debutAlbum = other.debutAlbum;
		this.releaseDate = other.releaseDate;
	}

	// Setter method for album debut
	public void setDebutAlbum(String debutAlbum) {
		this.debutAlbum = debutAlbum;
	}

	// getter method for album debut
	public String getDebutAlbum() {
		return debutAlbum;
	}

	// setter method for release date
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	// getter method for release date
	public Date getReleaeDate() {
		return new Date(releaseDate);
	}

	// clone method that uses the copy constructor
	public Person clone() {
		return new Person(this);
	}

	// to string method that add's onto the main method in the parent class
	public String toString() {
		return (super.toString() + "\nDebut Album: " + debutAlbum + "\nRelease Date: " + releaseDate);
	}

	// Returns the entity type
	public String entityType() {
		return ("This entity is a Singer!");
	}

}