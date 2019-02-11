package com.czermakp.hvsm.monsters;
import com.czermakp.hvsm.abstracts.Monster;
import com.czermakp.hvsm.abstracts.Weapon;
import com.czermakp.hvsm.weapons.Club;

public class Troll extends Monster {
	
	public static final String TYPE = "Troll";
	
	public Troll() {
		super(450, 50, new Club());
	}
	
	public Troll(int hitpoints, int luck, Weapon weapon) { 
		super(hitpoints, luck, weapon);
	}
	
	@Override
	public String toString() {
		return TYPE;
	}

	@Override
	public int badGuyAttackBonus() {
		return 10;
	}

	@Override
	public int badGuyDefenceBonus() {
		return 4;
	}


}
