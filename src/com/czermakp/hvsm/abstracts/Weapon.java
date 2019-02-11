package com.czermakp.hvsm.abstracts;


public abstract class Weapon {
	private int power;
	private int speed;

	public Weapon() {

	}

	public Weapon(int power, int speed) { //weapon type can be either sword or knife
		this.power = power;
		this.speed = speed;
	}

	public int getPower(){
		return power;
	}
	
	public void setPower(int power) {
		this.power = power;
	}

	public double getSpeed(){
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public abstract String toString();
}
