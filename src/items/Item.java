package items;

public abstract class Item {
	private String description;
	
	public Item(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return this.description;
	}
	
}
