package player;

/*
 * Alex Man, Mark Vong
 * ITP 368
 * 9/17/2017
 * Hwk 4
 */

import model.Item;

// Action interface all players must implement
public interface Action {
	public void Attack(Character character);
	public void UseItem(Item item);
}