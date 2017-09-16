package player;

import model.Item;

public class Enemy extends Character implements Action {
	
	private String name;
	
	public Enemy(String name) {
		this.name = name;
		this.setHealthPoints(100);
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void Attack(Character character) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UseItem(Item item) {
		// TODO Auto-generated method stub
		
	}

}
