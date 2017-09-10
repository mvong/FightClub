package game_logic;

public enum CharacterState {
	ATTACKING("Player is attacking."),
	DEAD("Player is dead."),
	STUNNED("Player is stunned.");

	private final String description;
	
	CharacterState(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return this.description;
	}
}
