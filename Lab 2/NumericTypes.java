
/**
   This program demonstrates how numeric types and operators behave in Java
*/
import java.util.*;

public class NumericTypes {
	public static void main(String[] args) {
		// TASK #2 Create a Scanner object here
		Scanner scan = new Scanner(System.in);

		System.out.println("Score 1: ");
		int score1 = scan.nextInt();
		System.out.println("Score 2: ");
		int score2 = scan.nextInt();

		// identifier declarations
		final double NUMBER = 2; // number of scores
		// int score1 = 100; // first test score
		// int score2 = 95; // second test score
		final int BOILING_IN_F = 212; // boiling temperature
		double fToC = 0; // temperature in Celsius
		double average; // arithmetic average
		String output; // line of output to print out
		// Task #2 declare a variable to hold the user’s temperature
		// Task #2 prompt user to input score1
		// Task #2 read score1
		// Task #2 prompt user to input score2
		// Task #2 read score2
		// Find an arithmetic average
		average = (score1 + score2) / NUMBER;
		output = score1 + " and " + score2 + " have an average of " + average;
		System.out.println(output);
		// Convert Fahrenheit temperatures to Celsius
		fToC = (BOILING_IN_F - 32) * 5 / 9;
		output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		// Task #2 prompt user to input another temperature
		// Task #2 read the user’s temperature in Fahrenheit
		// Task #2 convert the user’s temperature to Celsius
		// Task #2 print the user’s temperature in Celsius\
		System.out.println("Temperature in F: ");
		double faren = scan.nextDouble();
		fToC = (faren - 32) * 5 / 9;
		output = faren + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		System.out.println("Goodbye"); // to show that the program is ended
	}
}
