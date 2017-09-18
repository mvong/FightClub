package player;

/*
 * Alex Man, Mark Vong
 * ITP 368
 * 9/17/2017
 * Hwk 4
 */

public abstract class Character {
	// Base class for both a player and an enemy
	private int healthPoints;
	
	public int getHealthPoints() {
		return healthPoints;
	}
	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}
}
