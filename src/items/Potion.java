package items;

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
