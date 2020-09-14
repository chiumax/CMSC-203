import java.util.*;

public class MovieDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Movie movie = new Movie();

		// TASK #1
//		// setting movie attributes
//		System.out.println("Enter the name of a movie");
//		movie.setTitle(in.nextLine());
//		
//		System.out.println("Enter the rating of the movie");
//		movie.setRating(in.nextLine());
//		
//		System.out.println("Enter the number of tickets sold for this movie");
//		movie.setSoldTickets(in.nextInt());
//		
//		in.close();
//		
//		// printing out the movie
//		System.out.println(movie.toString());
//		System.out.println("Goodbye");

		// TASK #2
		do {
			// setting movie attributes
			System.out.println("Enter the name of a movie");
			movie.setTitle(in.nextLine());

			System.out.println("Enter the rating of the movie");
			movie.setRating(in.nextLine());

			System.out.println("Enter the number of tickets sold for this movie");
			movie.setSoldTickets(in.nextInt());
			
			// printing out the movie
			System.out.println(movie.toString());
			
			in.nextLine();
			System.out.println("Do you want to enter another? (y or n)");
		} while (in.nextLine().equals("y"));
		
		in.close();

		System.out.println("Goodbye");
	}

}
