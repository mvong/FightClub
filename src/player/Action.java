package player;

import model.Item;

// Action interface all players must implement
public interface Action {
	public void Attack(Character character);
	public void UseItem(Item item);
}