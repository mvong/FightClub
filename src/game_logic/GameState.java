package game_logic;

// Enum for state of the game
public enum GameState {
	FIGHT_MONSTERS("Player is fighting a monster."), 
	VIEW_ITEMS("Player is viewing his items."), 
	VIEW_MENU("Player is viewing the menu option."), 
	USE_ITEM("Player is using an item.");
	
	private final String description;
	
	GameState(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return this.description;
	}
	
}
