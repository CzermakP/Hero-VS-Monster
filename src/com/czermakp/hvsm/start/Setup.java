package com.czermakp.hvsm.start;

import java.util.Scanner;

import com.czermakp.hvsm.abstracts.Hero;
import com.czermakp.hvsm.abstracts.Monster;
import com.czermakp.hvsm.heroes.Archer;
import com.czermakp.hvsm.heroes.Dwarf;
import com.czermakp.hvsm.heroes.Knight;
import com.czermakp.hvsm.heroes.Wizard;
import com.czermakp.hvsm.monsters.Demon;
import com.czermakp.hvsm.monsters.Ogre;
import com.czermakp.hvsm.monsters.Skeleton;
import com.czermakp.hvsm.monsters.Troll;

public class Setup {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String heroInput;
		String monsterInput;
		Hero H = null;
		Monster M = null ;

		while (H == null) {
		System.out.print("Enter the type of Hero you wish to use: Knight / Archer / Dwarf / Wizard ?");
		heroInput = input.nextLine();		
			if (heroInput.equalsIgnoreCase(Knight.TYPE)) {
				H = new Knight();
			} else if(heroInput.equalsIgnoreCase(Archer.TYPE)) {
				H = new Archer();
			} else if(heroInput.equalsIgnoreCase(Dwarf.TYPE)) {
				H = new Dwarf();
			}else if(heroInput.equalsIgnoreCase(Wizard.TYPE)) {
				H = new Wizard();
			}
		}
		
		while (M == null) {
		System.out.print("Enter the type of Monster you will fight: Troll / Skeleton / Ogre/ Demon ?");
		monsterInput = input.nextLine();
		if (monsterInput.equalsIgnoreCase(Troll.TYPE)) {
			M = new Troll();
			}else if (monsterInput.equalsIgnoreCase(Skeleton.TYPE)) {
				M = new Skeleton();
			}else if (monsterInput.equalsIgnoreCase(Ogre.TYPE)) {
				M = new Ogre();
			}else if (monsterInput.equalsIgnoreCase(Demon.TYPE)) {
				M = new Demon();
			}
		}
		
		Game G = new Game(H, M);
		G.beginGame(); 
		System.out.println();
		System.out.println(G.getResult());
		
		System.exit(0);
	}
}