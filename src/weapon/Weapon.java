package weapon;

public abstract class Weapon {
	private int attackPower;
	private int defensePower;
	private int attackRange;
	
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
