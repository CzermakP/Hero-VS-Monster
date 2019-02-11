package com.czermakp.hvsm.weapons;

import com.czermakp.hvsm.abstracts.Weapon;

public class Axe extends Weapon{
	
	public Axe() {
		super(35, 3);
	}
	
	public Axe(int power, int speed) {
		super(power, speed);
	}
	
	@Override
	public String toString() {
		return "Weapon";
	}
}
