package com.czermakp.hvsm.weapons;

import com.czermakp.hvsm.abstracts.Weapon;

public class Chain extends Weapon{

	public Chain() {
		super(35, 3);
	}
	
	public Chain(int power, int speed) {
		super(power, speed);
	}
	
	@Override
	public String toString() {
		return "Chain";
	}
}
