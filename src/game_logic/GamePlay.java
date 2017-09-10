package game_logic;

import player.Player;
import player.Warrior;
import weapon.Weapon;

public class GamePlay {
	private GameState gameState;
	private Player player;
	
	public void startGame() {
		String username = InputHelper.readInput("Please enter a username for your character.");
		this.player = new Warrior(username, null, PlayerState.IDLE);
		this.gameState = GameState.VIEW_MENU;
		printMenuOptions();
	}
	
	public Player getPlayer() {
		return this.player;
	}
	
	public GameState getGameState() {
		return this.gameState;
	}
	
	private void printMenuOptions() {
		StringBuilder sb = new StringBuilder();
		sb.append("Welcome to Fight Club!" );
		sb.append("\nPlease choose from the following menu options: ");
		sb.append("\n\t 1. Fight randomly generated enemies."
				+ "\n\t 2. View your items."
				+ "\n\t 3. Use one of your items."
				+ "\n\t 4. Exit.");
		System.out.println(sb.toString());
	}
	
	public static void main(String args[]) {
		new GamePlay().startGame();
	}
}
