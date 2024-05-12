// Harminder-Singh Saini
// Student Number: 20207736

// Class used to test the program
public class Test {

	public static void main(String[] args) {

		Politician trudeau = new Politician("Justin Trudeau", new Date("December", 25, 1971), "Male", "Liberal", 0.25);
		Singer dion = new Singer("Celine Dion", new Date("3/30/1968"), "Female", "La voix du bon Dieu",
				new Date("11/6/1981"), 0.5);
		Person myCreator = new Person("myCreator", new Date("6/1/2000"), "Female", 1);
		Country usa = new Country("United States", new Date("7/4/1776"), "Washinton D.C.", 0.1);
		GuessMaster gm = new GuessMaster();
		gm.addEntity(trudeau);
		gm.addEntity(dion);
		gm.addEntity(myCreator);
		gm.addEntity(usa);

		gm.playGame();
	}
}
