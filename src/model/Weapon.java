package model;

/*
 * Alex Man, Mark Vong
 * ITP 368
 * 9/17/2017
 * Hwk 4
 */

// Weapon class extending from item
public class Weapon extends Item {
	private int attackPower;
	private int defensePower;
	private int attackRange;
	
	public Weapon(int attackPower, int defensePower, int attackRange, String description) {
		super(description);
		this.attackPower = attackPower;
		this.defensePower = defensePower;
		this.attackRange = attackRange;
	}
	public int getAttackPower() {
		return attackPower;
	}
	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	public int getDefensePower() {
		return defensePower;
	}
	public void setDefensePower(int defensePower) {
		this.defensePower = defensePower;
	}
	public int getAttackRange() {
		return attackRange;
	}
	public void setAttackRange(int attackRange) {
		this.attackRange = attackRange;
	}
}
