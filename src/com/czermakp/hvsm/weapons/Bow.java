package com.czermakp.hvsm.weapons;
import com.czermakp.hvsm.abstracts.Weapon;

public class Bow extends Weapon {
	
	public Bow() {
		super(10, 15);
	}
	
	public Bow(int power, int speed) {
		super(power, speed);
	}
	
	public String toString() {
		return "Bow";
	}
}
