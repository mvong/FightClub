package game_logic;

import java.util.Scanner;

// Input helper to read user input
public class InputHelper {
	private static Scanner sc = new Scanner(System.in);
	public static String readInput(String question) {
		System.out.println(question);
		String userInput = "";
		try {
			userInput = sc.nextLine();
		} catch (Exception e) {
			System.out.println("Error in scanner.");
		} 
		return userInput;
	}
	
	public static void parseInput(String option, GamePlay gamePlay) {
		switch(option) {
			case "1" : 
				gamePlay.setEnemyMap(EnemyController.createEnemies());
				if(gamePlay.getEnemyMap().size() > 0) {
					System.out.println("There are " + gamePlay.getEnemyMap().size() + " enemies! Attack them to survive.");
					gamePlay.setGameState(GameState.FIGHT_MONSTERS);
				} else {
					System.out.println("There are no enemies to attack!");
				}
				break;
			case "2":
				if(gamePlay.getPlayer().getItemList().size() > 0) {
					System.out.println("You have " + gamePlay.getPlayer().getItemList().size() + " items!");
				}
				else {
					System.out.println("You have no items to view.");
				}
				gamePlay.setGameState(GameState.VIEW_ITEMS);
				break;
			case "3":
				if(gamePlay.getPlayer().getItemList().size() == 0) {
					System.out.println("You have no items to use!");
				}
				else {
					StringBuilder sb = new StringBuilder("You have the following items: ");
					for(int i = 0 ; i < gamePlay.getPlayer().getItemList().size(); i++) {
						sb.append("\n\t"+(i+1)+": "+gamePlay.getPlayer().getItemList().get(i).getDescription());
					}
					sb.append("\nWhich ones will you use?");
					System.out.println(sb.toString());
				}
				gamePlay.setGameState(GameState.USE_ITEM);
				break;
			case "4":
				System.out.println("Bye");
				gamePlay.setGameState(GameState.EXIT_GAME);
				break;
			default:
				System.exit(1);
		}
	}
	
	public static void closeScanner() {
		sc.close();
	}
}
