package com.czermakp.hvsm.abstracts;

import com.czermakp.hvsm.interfaces.IGoodGuy;

public abstract class Hero implements IGoodGuy {
	private Weapon weapon;
	private int hitpoints;
	private int luck;

	public Hero(int hitpoints, int luck, Weapon weapon) {
		this.hitpoints = hitpoints;
		this.luck = luck;
		this.weapon = weapon;
	}
	
	public Weapon getWeapon() {
		return weapon;
	}
	
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public int getLuck() {
		return luck;
	}
	
	public void setLuck(int luck) {
		this.luck = luck;
	}

	public int getHitpoints() {
		return hitpoints;
	}

	public void setHitpoints(int hitpoints) {
		this.hitpoints = hitpoints;
	}
	
	public abstract String toString();
}
