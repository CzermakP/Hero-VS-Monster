package com.czermakp.hvsm.monsters;

import com.czermakp.hvsm.abstracts.Monster;
import com.czermakp.hvsm.abstracts.Weapon;
import com.czermakp.hvsm.weapons.Chain;

public class Demon extends Monster {

	public static final String TYPE = "Demon";
	
	public Demon() {
		super(500, 50, new Chain());
	}
	
	public Demon(int hitpoints, int luck, Weapon weapon) { 
		super(hitpoints, luck, weapon);
	}
	
	@Override
	public String toString() {
		return TYPE;
	}

	@Override
	public int badGuyAttackBonus() {
		return 7;
	}

	@Override
	public int badGuyDefenceBonus() {
		return 4;
	}
}
