
public class Hero {
	private String type;
	private Weapon weapon;
	private int hitpoints;
	private int luck = 0;

	public Hero() {

	}

	public Hero(String type, Weapon weapon) {  //hero type can be either knight or archer and uses Weapon class to get weapon 
		this.type = type;
		this.weapon = weapon;
		if (type.equals("knight")) {
			hitpoints = 300;
			luck = 100;
		} else if (type.equals("archer")) {
			hitpoints = 200;
			luck = 75;
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
	

	public int getHitpoints() {
		return hitpoints;
	}

	public void setHitpoints(int hitpoints) {
		this.hitpoints = hitpoints;
	}
}
