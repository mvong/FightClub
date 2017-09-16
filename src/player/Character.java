package player;

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
