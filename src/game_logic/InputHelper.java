package game_logic;

import java.util.Scanner;

// Input helper to read user input
public class InputHelper {
	public static String readInput(String question) {
		Scanner sc = new Scanner(System.in);
		System.out.println(question);
		String userInput = "";
		try {
			userInput = sc.nextLine();
		} catch (Exception e) {
			System.out.println("Error in scanner.");
		} 
		return userInput;
	}
	
	public static void parseInput(String option) {
		switch(option) {
		case "1" : 
			System.out.println("No enemies exist yet!");
			break;
		case "2":
			System.out.println("No items to view!");
			break;
		case "3":
			System.out.println("No items to use!");
			break;
		case "4":
			System.out.println("Bye");
			break;
		default:
			System.exit(1);
		}
	}
}
