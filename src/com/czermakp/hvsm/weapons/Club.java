package com.czermakp.hvsm.weapons;
import com.czermakp.hvsm.abstracts.Weapon;

public class Club extends Weapon{
	
	public Club() {
		super(30, 2);
	}
	
	public Club(int power, int speed) {
		super(power, speed);
	}
	
	public String toString() {
		return "Club";
	}
}
