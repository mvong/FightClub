package controller;

/*
 * Alex Man, Mark Vong
 * ITP 368
 * 9/17/2017
 * Hwk 4
 */

// Enum for state of the game
public enum GameState {
	FIGHT_MONSTERS("Player is fighting a monster."), 
	VIEW_ITEMS("Player is viewing his items."), 
	VIEW_MENU("Player is viewing the menu option."), 
	USE_ITEM("Player is using an item."),
	EXIT_GAME("Player exited the game.");
	
	private final String description;
	
	GameState(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return this.description;
	}
	
}
