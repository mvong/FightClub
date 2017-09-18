package controller;

/*
 * Alex Man, Mark Vong
 * ITP 368
 * 9/17/2017
 * Hwk 4
 */

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
			// Player wants to fight enemies
			// Set player state
			case "1" : 
				// Generate random number of enemies
				gamePlay.setEnemyMap(EnemyController.createEnemies());
				// If there are enemies, print out the number
				if(gamePlay.getEnemyMap().size() > 0) {
					System.out.println("There are " + gamePlay.getEnemyMap().size() + " enemies! Attack them to survive.");
					gamePlay.getPlayer().setPlayerState(PlayerState.ATTACKING);
				}
				// No enemies to attack
				else {
					System.out.println("There are no enemies to attack!");
					gamePlay.getPlayer().setPlayerState(PlayerState.IDLE);
				}
				// Set the game state
				gamePlay.setGameState(GameState.FIGHT_MONSTERS);
				break;
			// Player wants to view items	
			case "2":
				// If player has items, print them
				if(gamePlay.getPlayer().getItemList().size() > 0) {
					StringBuilder sb = new StringBuilder("You have the following " + gamePlay.getPlayer().getItemList().size() + " items: ");
					for(int i = 1 ; i <= gamePlay.getPlayer().getItemList().size(); i++) {
						sb.append("\n\t"+i+": "+gamePlay.getPlayer().getItemList().get(i-1).getDescription());
					}
					System.out.println(sb.toString());
				}
				else {
					System.out.println("You have no items to view.");
				}
				// Set game state and player state
				gamePlay.setGameState(GameState.VIEW_ITEMS);
				gamePlay.getPlayer().setPlayerState(PlayerState.IDLE);
				break;
			// Player wants to use items
			case "3":
				// No items to use
				if(gamePlay.getPlayer().getItemList().size() == 0) {
					System.out.println("You have no items to use!");
				}
				else {
					StringBuilder sb = new StringBuilder("You have the following items: ");
					for(int i = 1 ; i <= gamePlay.getPlayer().getItemList().size(); i++) {
						sb.append("\n\t"+i+": "+gamePlay.getPlayer().getItemList().get(i-1).getDescription());
					}
					sb.append("\nWhich ones will you use?");
					System.out.println(sb.toString());
				}
				// Set game state and player state
				gamePlay.setGameState(GameState.USE_ITEM);
				gamePlay.getPlayer().setPlayerState(PlayerState.IDLE);
				break;
			// Player wants to quit
			case "4":
				//Set game and player states
				System.out.println("Bye, thanks for playing!");
				gamePlay.getPlayer().setPlayerState(PlayerState.IDLE);
				gamePlay.setGameState(GameState.EXIT_GAME);
				sc.close();
				break;
			// Exit
			default:
				System.exit(1);
		}
	}
}
