package player;

import game_logic.PlayerState;
import weapon.Weapon;

public abstract class Player {
	private int healthPoints;
	private String username;
	private Weapon weapon;
	private PlayerState playerState;
	
	public Player(String username, Weapon weapon, PlayerState playerState) {
		this.username = username;
		this.weapon = weapon;
		this.playerState = playerState;
		this.healthPoints = 100;
	}
	public PlayerState getPlayerState() {
		return this.playerState;
	}
	public void setPlayerState(PlayerState playerState) {
		this.playerState = playerState;
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
