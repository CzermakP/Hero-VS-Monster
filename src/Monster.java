
public class Monster {
	private String type;
	private Weapon weapon;
	private int hitpoints;
	private int luck = 0;

	public Monster() {

	}

	public Monster(String type, Weapon weapon) { //monster can be either troll or skeleton and uses Weapon class to get weapon
		this.type = type;
		this.weapon = weapon;
		if (type.equals("troll")) {
			hitpoints = 500;
			luck = 50;
		} else if (type.equals("skeleton")) {
			hitpoints = 100;
			luck = 200;
		}
	}

	public String getType() {
		return type;
	}

	public Weapon getWeapon() {
		return weapon;

	}

	public int getLuck() {
		return luck;

	}
	
	public void setLuck(int luck) {
		this.luck = luck;
	}

	public int getHitpoints() {
		return hitpoints;

	}

	public void setHitpoints(int hitpoints) {
		this.hitpoints = hitpoints;

	}
}
