import java.util.Scanner;

public class RandomNumberGuesser {
	public static int randNum;
	public static int nextGuess;
	public static int highGuess;
	public static int lowGuess;
	public static String userInput;
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("This is a random number guessing game.");
		System.out.println("All the guessable numbers are whole numbers and are between a low # and a high # exclusive");
		do {
			playGame();
			System.out.println("Try again? (yes or no)");
			// clear newline character
			scan.nextLine();
			userInput = scan.nextLine();
		} while (userInput.equalsIgnoreCase(("yes")));
		System.out.println("Thanks for playing...");
		System.out.println("Programmer: Max Chiu");
	}

	public static void playGame() {
		// initialize starting conditions
		RNG.resetCount();
		RNG game = new RNG();

		randNum = RNG.rand();
		// doing 0 and 101 instead of 1 and 100 because inputValidation is exclusive
		// randNum is inclusive between 1 and 100
		lowGuess = 0;
		highGuess = 101;

		do {
			// getInput that is within bounds
			getInput();
			System.out.println("Number of guesses is " + RNG.getCount());
		} while (checkInput() == false);
	}

	public static void getInput() {
		if (RNG.getCount() == 1) {
			System.out.println("Enter your first guess");
		} else {
			System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess);
		}
		nextGuess = scan.nextInt();
		while (RNG.inputValidation(nextGuess, lowGuess, highGuess) == false) {
			nextGuess = scan.nextInt();
		}
	}

	public static boolean checkInput() {
		if (nextGuess > randNum) {
			highGuess = nextGuess;
			System.out.println("Your guess is too high");
		} else if (nextGuess < randNum) {
			lowGuess = nextGuess;
			System.out.println("Your guess is too low");
		} else if (nextGuess == randNum) {
			System.out.println("Congratulations, you guessed correctly");
			return true;
		}
		return false;
	}

}
