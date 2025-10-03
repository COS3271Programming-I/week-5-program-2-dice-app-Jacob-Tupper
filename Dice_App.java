package dice_app;

//Importing functions
import java.util.Scanner;
import java.io.PrintStream;

public class Dice_App {
	// Creating a scanner
	static Scanner usin = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Creating variables
		PrintStream so = System.out;
		
		String roll;
		
		//Asking the user for an input
		so.println("Would you like to roll some dice(yes or no)? ");
		roll = usin.nextLine();
		roll = roll.toLowerCase();
		
		//Creating a while loop as long as the user wants to run it
		while (roll.toLowerCase().equals("yes")) {
			//Creating variables for the dice
			int a = Math.addExact((int)(Math.random()*10)%6, 1);
			int b = Math.addExact((int)(Math.random()*10)%6, 1);
			
			//Printing the output and asking the user if they want to continue
			so.println("Here are your numbers: "+ a + " and " + b + "\nThe combined total of both rolls: " + Math.addExact(a, b) + "\nWould you like to roll again(Enter yes or no)? ");
			roll = usin.nextLine();
		}
		//Stating that the program ended
		so.println("Program Ended or Invalid Input");
	}
	
}
