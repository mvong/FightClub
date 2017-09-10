package player;

import weapon.Weapon;

public abstract class Player {
	private int healthPoints;
	private String username;
	private Weapon weapon;
	
	public Player(String username, Weapon weapon) {
		this.username = username;
		this.weapon = weapon;
		this.healthPoints = 100;
	}
	public Weapon getWeapon() {
		return weapon;
	}
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	public int getHealthPoints() {
		return healthPoints;
	}
	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
