package game_logic;

import java.util.Scanner;

public class InputHelper {
	
	public static String readInput(String question) {
		Scanner sc = new Scanner(System.in);
		System.out.println(question);
		String userInput = sc.nextLine();
		sc.close();
		return userInput;
	}
}
