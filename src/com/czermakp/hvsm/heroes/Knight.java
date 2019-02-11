package com.czermakp.hvsm.heroes;
import com.czermakp.hvsm.abstracts.Hero;
import com.czermakp.hvsm.abstracts.Weapon;
import com.czermakp.hvsm.weapons.Sword;

public class Knight extends Hero {
	
	public static final String TYPE = "Knight";
	
	public Knight() {
		super(525, 75, new Sword());
	}
	
	public Knight(int hitpoints, int luck, Weapon weapon) { 
		super(hitpoints, luck, weapon);
	}
	
	@Override
	public String toString() {
		return TYPE;
	}

	@Override
	public int goodGuyAttackBonus() {
		return 7;
	}

	@Override
	public int goodGuyDefenseBonus() {
		return 2;
	}
}
