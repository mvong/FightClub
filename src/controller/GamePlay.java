package controller;

import java.util.HashMap;

import model.Weapon;
import player.Enemy;
import player.Player;

// Initiates game play
public class GamePlay {
	private GameState gameState;
	private Player player;
	// Map of enemies
	private HashMap<Integer, Enemy> enemyMap;
	
	// Begin the game
	public void startGame() {
		String username = InputHelper.readInput("Please enter a username for your character.");
		this.player = new Player(username, new Weapon(50, 10, 0, "sword"), PlayerState.IDLE);
		this.gameState = GameState.VIEW_MENU;
		playGame();
	}
	
	public Player getPlayer() {
		return this.player;
	}
	
	public GameState getGameState() {
		return this.gameState;
	}
	
	public void setGameState(GameState gameState) {
		this.gameState = gameState;
	}
	
	public HashMap<Integer, Enemy> getEnemyMap() {
		return this.enemyMap;
	}
	
	public void setEnemyMap(HashMap<Integer, Enemy> enemyMap) {
		this.enemyMap = enemyMap;
	}
	
	// Print menu of options
	private String printMenuOptions() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nWelcome to Fight Club, " + this.player.getUsername() + "!");
		sb.append("\nPlease choose from the following menu options: ");
		sb.append("\n\t 1. Fight randomly generated enemies."
				+ "\n\t 2. View your items."
				+ "\n\t 3. Use one of your items."
				+ "\n\t 4. Exit.");
		return sb.toString();
	}
	// Play game
	private void playGame() {
		String inputString = "";
		while(!inputString.equalsIgnoreCase("4")) {
			inputString = InputHelper.readInput(printMenuOptions());
			// If valid input, parse it
			if(inputString.equals("1") || inputString.equals("2") || inputString.equals("3") || inputString.equals("4")) {
				InputHelper.parseInput(inputString, this);
				// Print out the game state after every input
				System.out.println("GAME STATE: " + this.gameState.getDescription());
				System.out.println("PLAYER STATE: " + this.player.getPlayerState().getDescription());
			}
			else {
				System.out.println("Enter a valid input.");
			}
		}
		
	}
	public static void main(String args[]) {
		new GamePlay().startGame();
	}
}
