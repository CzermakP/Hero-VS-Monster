package com.czermakp.hvsm.heroes;

import com.czermakp.hvsm.abstracts.Hero;
import com.czermakp.hvsm.abstracts.Weapon;
import com.czermakp.hvsm.weapons.Staff;

public class Wizard extends Hero{

	public static final String TYPE = "Wizard";
	
	public Wizard() {
		super(495, 110, new Staff());
	}
	public Wizard(int hitpoints, int luck, Weapon weapon) {
		super(hitpoints, luck, weapon);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return TYPE;
	}

	@Override
	public int goodGuyAttackBonus() {
		return 10;
	}

	@Override
	public int goodGuyDefenseBonus() {
		return 2;
	}
}
