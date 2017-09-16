package player;

import java.util.ArrayList;
import java.util.Random;

import game_logic.PlayerState;
import items.Item;
import items.Potion;
import items.Weapon;

// Base player class implementing action interface
public class Player extends Character implements Action{
	
	private String username;
	private Weapon weapon;
	private PlayerState playerState;
	// List of items
	private ArrayList<Item> itemList;	
	
	public Player(String username, Weapon weapon, PlayerState playerState) {
		this.username = username;
		this.weapon = weapon;
		this.playerState = playerState;
		this.setHealthPoints(100);
		this.itemList = new ArrayList<Item>();
		// Generate random number of potions for player
		for(int i = 1 ; i <= new Random().nextInt(10) ; i++) {
			itemList.add(new Potion("Potion " + (i)));
		}
	}
	
	// Player attack method
	public void Attack(Character character) {
		if(character instanceof Enemy) {
			Enemy enemy = (Enemy)character;
			enemy.setHealthPoints(enemy.getHealthPoints() - this.weapon.getAttackPower());
		} 
	}
	// Player use item method
	public void UseItem(Item item) {
		if(item instanceof Potion) {
			Potion potion = (Potion)item;
			this.setHealthPoints(this.getHealthPoints() + potion.getAmount());
		}
		
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public ArrayList<Item> getItemList() {
		return this.itemList;
	}
	
	
}
