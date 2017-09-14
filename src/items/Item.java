package items;

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
