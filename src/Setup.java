import java.util.Scanner;

public class Setup {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String heroTypeInput;
		String heroWeaponInput;
//		Weapon heroWeapon;
//		Hero hero = null;
		String monsterTypeInput;
		String monsterWeaponInput;
//		Weapon monsterWeapon;
//		Monster monster = null;
//		Game game;

		System.out.print("Enter the type of Hero you wish to use: ");
		heroTypeInput = input.nextLine();
		System.out.print("\nEnter the type of Weapon the Hero will use: ");
		heroWeaponInput = input.nextLine();
		
		// create the Weapon object that the Hero object will use
		Weapon hWeapon = new Weapon(heroWeaponInput);
		// after Weapon object is created, now create the Hero object
		Hero h = new Hero(heroTypeInput, hWeapon);
		
		System.out.print("\nEnter the type of Monster you will fight: ");
		monsterTypeInput = input.nextLine();
		System.out.print("\nEnter the type of Weapon the Monster will use: ");
		monsterWeaponInput = input.nextLine();
		
		// create Weapon object for the Monster
		Weapon mWeapon = new Weapon(monsterWeaponInput);
		// after Weapon object is created, now create the Monster
		Monster m = new Monster(monsterTypeInput, mWeapon);
		// now use the Hero and Monster objects to create the Game object
		
		Game g = new Game(h, m);
		g.beginGame(); 
		System.out.println();
		System.out.println(g.getResult());
		
		System.exit(0);
	}
}