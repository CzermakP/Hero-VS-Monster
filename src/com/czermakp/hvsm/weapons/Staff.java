package com.czermakp.hvsm.weapons;

import com.czermakp.hvsm.abstracts.Weapon;

public class Staff extends Weapon{
	
	public Staff() {
		super(45, 4);
	}
	
	public Staff(int power, int speed) {
		super(power, speed);
	}
	
	@Override
	public String toString() {
		return "Staff";
	}
}
