package com.czermakp.hvsm.heroes;
import com.czermakp.hvsm.abstracts.Hero;
import com.czermakp.hvsm.abstracts.Weapon;
import com.czermakp.hvsm.weapons.Bow;

public class Archer extends Hero {
	
	public static final String TYPE = "Archer";
	
	public Archer() {
		super(475, 100, new Bow());
	}
	
	public Archer(int hitpoints, int luck, Weapon weapon) {
		super(hitpoints, luck, weapon);
	}

	@Override
	public String toString() {
		return TYPE;
	}

	@Override
	public int goodGuyAttackBonus() {
		return 9;
	}

	@Override
	public int goodGuyDefenseBonus() {
		return 3;
	}
}
