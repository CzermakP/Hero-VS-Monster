
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
			System.out.println(hero.getType() + " attacks first!\n");
			while (true) {
				heroAttack();
				if (monster.getHitpoints() <= 0) {
					result = hero.getType() + " defeated " + monster.getType() + " with a "
							+ hero.getWeapon().getType() + "!!!"; // hero wins
					break;
				}
				monsterAttack();

				if (hero.getHitpoints() <= 0) {
					result = monster.getType() + " defeated " + hero.getType() + " with a "
							+ monster.getWeapon().getType() + "!!!"; // monster wins
					break;
				}
			}
		} else if (monster.getLuck() > hero.getLuck()) {
			System.out.println();
			System.out.println(monster.getType() + " attacks first!\n");
			while (true) {
				monsterAttack();

				if (hero.getHitpoints() <= 0) {
					result = monster.getType() + " defeated " + hero.getType() + " with a "
							+ monster.getWeapon().getType() + "!!!"; // monster wins
					break;
				}
				heroAttack();

				if (monster.getHitpoints() <= 0) {
					result = hero.getType() + " defeated " + monster.getType() + " with a "
							+ hero.getWeapon().getType() + "!!!"; // hero wins
					break;
				}
			}
		}
	}

	public void heroAttack() {
		double damage = 0;
		damage = (hero.getWeapon().getPower() * 0.5) + (hero.getWeapon().getSpeed() * 0.5) - (monster.getLuck() * 0.02);

		monster.setHitpoints((int) (monster.getHitpoints() - damage));
		System.out.println(hero.getType() + " attacks " + monster.getType() + " for " + damage + ".  "
				+ monster.getType() + " has " + monster.getHitpoints() + " hitpoints remaining.");

	}

	public void monsterAttack() {
		double damage = 0;
		damage = (monster.getWeapon().getPower() * 0.5) + (monster.getWeapon().getSpeed() * 0.5)
				- (hero.getLuck() * 0.02);

		hero.setHitpoints((int) (hero.getHitpoints() - damage));
		System.out.println(monster.getType() + " attacks " + hero.getType() + " for " + damage + ". " + hero.getType()
				+ " has " + hero.getHitpoints() + " hitpoints remaining.");
	}

	public String getResult() {
		return result;
	}
}
