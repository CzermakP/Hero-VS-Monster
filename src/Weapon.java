
public class Weapon {
	private String type;
	private double power;
	private double speed;

	public Weapon() {

	}

	public Weapon(String type) { //weapon type can be either sword or knife
		this.type = type;	
		if (type.equals("sword")) {
			power = 15;
			speed = 5;
		} else if (type.equals("knife")) {
			power = 5;
			speed = 10;
		}
	}
	
	public String getType() {
		return type;
	}

	public double getPower() {
		return power;

	}

	public double getSpeed() {
		return speed;

	}
}
