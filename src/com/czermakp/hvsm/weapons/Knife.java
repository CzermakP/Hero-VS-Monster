package com.czermakp.hvsm.weapons;
import com.czermakp.hvsm.abstracts.Weapon;

public class Knife extends Weapon{
	
	public Knife() {
		super(15, 5);
	}
	
	public Knife(int power, int speed) {
		super(power, speed);
	}
		
	public String toString() {
		return "Knife";
	}
}
