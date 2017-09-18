package model;

/*
 * Alex Man, Mark Vong
 * ITP 368
 * 9/17/2017
 * Hwk 4
 */

import java.util.Random;

public class Potion extends Item {
	int amount;
	// Potion class 
	public Potion(String description) {
		super(description);
		this.amount = new Random().nextInt(100);
	}
	public int getAmount() {
		return this.amount;
	}
}
