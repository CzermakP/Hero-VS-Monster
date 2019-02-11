package com.czermakp.hvsm.monsters;

import com.czermakp.hvsm.abstracts.Monster;
import com.czermakp.hvsm.abstracts.Weapon;
import com.czermakp.hvsm.weapons.Chain;

public class Ogre extends Monster {

	public static final String TYPE = "Ogre";
	
	public Ogre() {
		super(500, 50, new Chain());
	}
	
	public Ogre(int hitpoints, int luck, Weapon weapon) { 
		super(hitpoints, luck, weapon);
	}
	
	@Override
	public String toString() {
		return TYPE;
	}

	@Override
	public int badGuyAttackBonus() {
		return 6;
	}

	@Override
	public int badGuyDefenceBonus() {
		return 2;
	}
}
