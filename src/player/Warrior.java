package player;

import game_logic.PlayerState;
import items.Weapon;

public class Warrior extends Player {

	// Warrior class extending from base player
	public Warrior(String username, Weapon weapon, PlayerState playerState) {
		super(username, weapon, playerState);
	}

}
