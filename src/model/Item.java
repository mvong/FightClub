package model;

/*
 * Alex Man, Mark Vong
 * ITP 368
 * 9/17/2017
 * Hwk 4
 */

// Abstract item class, all items must have a description/name
public abstract class Item {
	private String description;
	
	public Item(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return this.description;
	}
	
}
