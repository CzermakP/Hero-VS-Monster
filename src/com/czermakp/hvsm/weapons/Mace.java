package com.czermakp.hvsm.weapons;

import com.czermakp.hvsm.abstracts.Weapon;

public class Mace extends Weapon{

	public Mace() {
		super(31, 1);
	}
	
	public Mace(int power, int speed) {
		super(power, speed);
	}
	
	@Override
	public String toString() {
		return "Mace";
	}

}
