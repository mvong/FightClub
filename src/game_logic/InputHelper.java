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
		} finally {
			sc.close();
		}
		return userInput;
	}
}
