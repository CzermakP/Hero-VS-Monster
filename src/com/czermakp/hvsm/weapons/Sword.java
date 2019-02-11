package com.czermakp.hvsm.weapons;
import com.czermakp.hvsm.abstracts.Weapon;

public class Sword extends Weapon {

	public Sword() {
		super(5, 10);
	}
	
	public Sword(int power, int speed) {
		super(power, speed);
	}
	
	public String toString() {
		return "Sword";
	}
	
}
