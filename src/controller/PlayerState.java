package controller;

/*
 * Alex Man, Mark Vong
 * ITP 368
 * 9/17/2017
 * Hwk 4
 */

// Enum for state of the player
public enum PlayerState {
	IDLE("Player is idle."),
	ATTACKING("Player is attacking."),
	DEAD("Player is dead."),
	STUNNED("Player is stunned.");

	private final String description;
	
	PlayerState(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return this.description;
	}
}
