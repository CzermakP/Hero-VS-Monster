package com.czermakp.hvsm.start;

import com.czermakp.hvsm.abstracts.Hero;
import com.czermakp.hvsm.abstracts.Monster;
//import java.util.Random;
import java.text.DecimalFormat;
import java.util.Random;

public class Game {
	private Hero hero;
	private Monster monster;
	private String result;

	public Game() {

	}

	public Game(Hero hero, Monster monster) {
		this.hero = hero;
		this.monster = monster;

	}

	public void beginGame() {
		if (hero.getLuck() > monster.getLuck()) {
			System.out.println();
			System.out.println(hero.toString() + " first to attack!\n");
			while (true) {
				heroAttack();
				if (monster.getHitpoints() <= 0) {
					result = hero.toString() + " defeates " + monster.toString() + " with a "
							+ hero.getWeapon().toString() + "!!!"; // hero wins
					break;
				}
				monsterAttack();
				if (hero.getHitpoints() <= 0) {
					result = monster.toString() + " defeates " + hero.toString() + " with a "
							+ monster.getWeapon().toString() + "!!!"; // monster wins
					break;
				}
			}
		} else if (monster.getLuck() > hero.getLuck()) {
			System.out.println();
			System.out.println(monster.toString() + " attacks first!\n");
			while (true) {
				monsterAttack();
				if (hero.getHitpoints() <= 0) {
					result = monster.toString() + " defeates " + hero.toString() + " with a "
							+ monster.getWeapon().toString() + "!!!"; // monster wins
					break;
				}
				heroAttack();
				if (monster.getHitpoints() <= 0) {
					result = hero.toString() + " defeates " + monster.toString() + " with a "
							+ hero.getWeapon().toString() + "!!!"; // hero wins
					break;
				}
			}
		}
	}

	public void heroAttack() {
		Random RD = new Random();
		RD.nextInt(3);
		DecimalFormat df = new DecimalFormat("00.0");
		double damage = 0;
		damage = (hero.getWeapon().getPower() * RD.nextInt(3) + 0.4) + (hero.getWeapon().getSpeed() * RD.nextInt(3) + 0.4) 
				+ (hero.goodGuyAttackBonus()) - (monster.getLuck() * 0.02) - (monster.badGuyDefenceBonus());
		monster.setHitpoints((int) (monster.getHitpoints() - damage));
		System.out.println(hero.toString() + " attacks " + monster.toString() + " for " + df.format(damage)
				+ " damage...  " + monster.toString() + " has " + monster.getHitpoints() + " hitpoints remaining!");

	}

	public void monsterAttack() {
		Random RD = new Random();
		RD.nextInt(3);
		DecimalFormat df = new DecimalFormat("00.0");
		double damage = 0;
		damage = (monster.getWeapon().getPower() * RD.nextInt(3) + 0.4) + (monster.getWeapon().getSpeed() * RD.nextInt(3) + 0.4) 
				+ (monster.badGuyAttackBonus())	- (hero.getLuck() * 0.03) - (hero.goodGuyDefenseBonus());

		hero.setHitpoints((int) (hero.getHitpoints() - damage));
		System.out.println(monster.toString() + " attacks " + hero.toString() + " for " + df.format(damage)
				+ " damage...  " + hero.toString() + " has " + hero.getHitpoints() + " hitpoints remaining!");
	}

	
	public String getResult() {
		return result;
	}
}
