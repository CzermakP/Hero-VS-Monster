package com.czermakp.hvsm.monsters;
import com.czermakp.hvsm.abstracts.Monster;
import com.czermakp.hvsm.abstracts.Weapon;
import com.czermakp.hvsm.weapons.Knife;

public class Skeleton extends Monster {

	public static final String TYPE = "Skeleton";
	
	public Skeleton() {
		super(500, 50, new Knife());
	}
	
	public Skeleton(int hitpoints, int luck, Weapon weapon) { 
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
		return 1;
	}	
}
