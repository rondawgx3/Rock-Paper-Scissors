package rockPaperScissors;

import java.util.Scanner; 
import java.util.Random; 

public class rockPaperScissors { 
	
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
	    String userInput = "Y";
	    while(userInput.equals("Y")) {
	    	game();
	    	System.out.print("Do you want to play again? (Y/N): ");
		    userInput = input.next();
		    userInput = userInput.toUpperCase();
	    } System.out.println("\n\n GAME OVER\n It was nice playing with you.");
	}
	public static void game() {
		String userChoice; //User's move 
	    String computerChoice = ""; //Computer's move 
	    int computerInt; //random number used to create computer's move
	    
	    Scanner scan = new Scanner(System.in); 
	    Random pick = new Random(); 
	    
	    System.out.println("\nRock, Paper, and Scissors!");
	    System.out.println("Now choose a move carefully...\nRock = R, Paper = P, Scissors = S");
	    System.out.println();
	    
	    //generates computer's move from 1, 2, and 3 
	    computerInt = pick.nextInt(3)+1; 
	
	    /*Translate computer's randomly generated play to 
	    string symbol using if/else statements*/
	    if (computerInt == 1) {
	        computerChoice = "R"; 
	    } else if (computerInt == 2) {
	    	computerChoice = "P"; 
	    } else if (computerInt == 3) 
	    	computerChoice = "S"; 
	
	    //player's input taken from scanner input and stored in variable
	    System.out.print("Enter your move here: "); 
	    userChoice = scan.next();
	    userChoice = userChoice.toUpperCase(); 
	
	    //prints computer's randomly selected play choice
	    System.out.println("Computer's move is: " + computerChoice + "\n"); 
	    
	    String win = "You have beat the Machine! :)\n";
	    String loss = "Sadly you have been defeated by the Machine! :(\n";
	    
	    /*series of if/else loops used to find the R-P-S pair between user input and computer input
	    then, prints out corresponding output to user*/
	    if (userChoice.equals(computerChoice)) {
	        System.out.println("A draw, no winner declared.\n"); 
	    } else if (userChoice.equals("R")) {
	    	if (computerChoice.equals("S")) {
	           System.out.println("Rock crushes scissors, " + win); 
	        } else if (computerChoice.equals("P")) {
				System.out.println("Paper eats rock, " + loss);
	        }
	    } else if (userChoice.equals("P")) {
	    	if (computerChoice.equals("S")) {
	    	   System.out.println("Scissor cuts paper, " + loss); 
	        } else if (computerChoice.equals("R")) {
	    	   System.out.println("Paper eats rock, " + win); 
	        }
	    } else if (userChoice.equals("S")) {
	    	if (computerChoice.equals("P")) {
				 System.out.println("Scissor slices paper, " + win); 
	        } else if (computerChoice.equals("R")) {
	        	 System.out.println("Rock breaks scissors, " + loss); 
	        }
	    } else { 
			System.out.println("User input is not valid!!!"); 
	    }
	}

}
