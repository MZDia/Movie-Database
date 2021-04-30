// Written by Mia Dia


import java.util.Scanner;
public class MovieDatabaseFrontEnd {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		boolean running = true;
		MovieDatabase MD = new MovieDatabase();
		
		p("Welcome to the Movie Database!");
		while(running) {
			p("\n-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --");
			p("Enter 1: to Add a Movie");
			p("Enter 2: to Remove a Movie by Title");
			p("Enter 3: to Search for a Movie by Title");
			p("Enter 4: to Print all Movies");
			p("Enter 9: to Quit");
			
			int userInput = input.nextInt();
			switch(userInput) {
			
			case 1: //Add
				p("Enter the movie's title:");
				input.nextLine();
				MD.add(input.nextLine());
				break;
				
			case 2: //Remove
				p("Enter a movie to remove:");
				input.nextLine();
				MD.remove(input.nextLine());
				break;
				
			case 3://
				p("Enter a movie to search:");
				input.nextLine();
				String name =input.nextLine();
				if(MD.findMovie(name))
					p(""+name+" is in the database!");
				else
					p(""+name+" is not in the database!");
				
				break;
				
			case 4:
				MD.printList();
				break;
				
			case 9:
				running = false;
				break;
				
			default:
				p("Invalid Input! Please try again.");
			}
			
		}
		input.close();
		

	}
	
	
	
	
// Print method / / / / / / / / / / / / / / / / / / 
	public static void p(String words) {
		System.out.println(words);
	}

}
