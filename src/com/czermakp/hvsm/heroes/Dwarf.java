package com.czermakp.hvsm.heroes;

import com.czermakp.hvsm.abstracts.Hero;
import com.czermakp.hvsm.abstracts.Weapon;
import com.czermakp.hvsm.weapons.Axe;

public class Dwarf extends Hero {

	public static final String TYPE = "Dwarf";
	
	public Dwarf() {
		super(485, 90, new Axe());
	}
	
	public Dwarf(int hitpoints, int luck, Weapon weapon) {
		super(hitpoints, luck, weapon);
	}

	@Override
	public String toString() {
		return TYPE;
	}

	@Override
	public int goodGuyAttackBonus() {
		return 8;
	}

	@Override
	public int goodGuyDefenseBonus() {
		return 1;
	}
}
