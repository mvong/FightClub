package player;

import java.util.ArrayList;

import game_logic.PlayerState;
import items.Item;
import items.Weapon;

// Base player class implementing action interface
public class Player implements Action{
	
	private int healthPoints;
	private String username;
	private Weapon weapon;
	private PlayerState playerState;
	// List of items
	private ArrayList<Item> backpack;	
	
	public Player(String username, Weapon weapon, PlayerState playerState) {
		this.username = username;
		this.weapon = weapon;
		this.playerState = playerState;
		this.healthPoints = 100;
		this.backpack = new ArrayList<Item>();
	}
	// Player attack method
	public void Attack() {
		
	}
	// Player use item method
	public void UseItem() {
		
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
