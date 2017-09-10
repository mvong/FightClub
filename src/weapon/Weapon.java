package weapon;

public abstract class Weapon {
	private int attackPower;
	private int defensePower;
	private int attackRange;
	
	public Weapon(int attackPower, int defensePower, int attackRange) {
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
