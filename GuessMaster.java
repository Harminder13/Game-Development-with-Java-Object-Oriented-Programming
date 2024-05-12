// Harminder-Singh Saini
// Student Number: 20207736

// Scanner and Random class imported
import java.util.Scanner;
import java.util.Random;

public class GuessMaster {

	// Instance variables used in the class
	private int numberOfCandidateEntities = 0;
	private Entity[] entities = new Entity[20];
	private int numTickets = 0, totalTickets = 0;

	// Method used to add a new Entity to the Entity array
	public void addEntity(Entity entity) {
		entities[numberOfCandidateEntities] = entity.clone();
		numberOfCandidateEntities++;
	}

	// Method used to get the tickets won in a round and the total number of tickets
	// then return the values
	public String getTickets(Entity object) {
		numTickets = object.getAwardedTicketNumber();
		totalTickets += numTickets;
		return ("*************Bingo!***************\r\n" + "You won " + numTickets + " tickets in this round.\r\n"
				+ "The total number of your tickets is " + totalTickets + ".\r\n"
				+ "**********************************");
	}

	// Method used to play the game regards to the given entity
	public void playGame(Entity entity) {

		// Created a scanner object to scan user input
		Scanner sc = new Scanner(System.in);
		System.out.println(entity.welcomeMessage());
		System.out.println("Guess " + entity.getName() + "'s birthday\n(mm/dd/yyyy)");
		String str = sc.nextLine();

		// If the user types "quit" the game will exit
		if (str.equals("quit")) {
			System.exit(0);
		}

		// Date object created to store the used input
		Date holdStr = new Date(str);

		// Infinite while loop that will end if used decided to quit the game
		while (true) {

			// If the user input matches the entity date the following will execute
			if (entity.getBorn().equals(holdStr)) {
				System.out.println(getTickets(entity));
				System.out.println(entity.closingMessage());
				System.out.println("*********************************");
				playGame();

			}

			// If the user date in ahead of the entity date the following will execute
			else if (entity.getBorn().precedes(holdStr)) {

				System.out.println("Incorrect. Try a earlier date or type 'quit' to stop:");
				str = sc.nextLine();

				// If used types "quit", the program will exit
				if (str.equals("quit")) {
					System.exit(0);
				}

				// Otherwise the instance variables in the holdStr object are overwritten with
				// the setter method in the date class
				holdStr.setDate(str);

			}

			// If the above cases are all false the following is executed
			else {

				System.out.println("Incorrect. Try a later date or type 'quit' to stop");
				str = sc.nextLine();

				// If used types "quit", the program will exit
				if (str.equals("quit")) {
					System.exit(0);
				}

				// Otherwise the instance variables in the holdStr object are overwritten with
				// the setter method in the date class
				else
					holdStr.setDate(str);
			}
		}

	}

	// Method used to check if you have reached the end of the entity array list and
	// then initiate the game
	public void playGame(int entityInd) {

		playGame(entities[entityInd]);

	}

	// Method used to generate a random number and then call the playGame(int
	// entityInd) method above
	public void playGame() {

		int val = 0;

		Random rand = new Random();
		val = rand.nextInt((numberOfCandidateEntities - 0) + 0);
		playGame(val);
	}

}
