package textgame;

import java.util.Random;
import java.util.Scanner;
import java.util.Scanner;

public class RPGTextGame {

	public static void main(String[] args) {
		System.out.println("Press Start To Begin");

// System objects
		Scanner in = new Scanner(System.in);
		Random rand = new Random();

// Game variables
		String[] enemies = { "Dragon", "Imp", "Sasquatch" };
		int maxEnemyHealth = 100;
		int enemyAttackDamage = 50;

// Player variables
		int health = 120;
		int attackDamage = 50;
		int numHealMagic = 3;
		int healMagicCureAmount = 40;
		

		boolean running = true;

		GAME: while (running) {
			System.out.println("---------------------------------------------------");

			int enemyHealth = rand.nextInt(maxEnemyHealth);
			String enemy = enemies[rand.nextInt(enemies.length)];
			System.out.println("\t# " + enemy + " has arrived! #\n");

			while (enemyHealth > 0) {
				System.out.println("\tYour HP " + health);
				System.out.println("\t " + enemy + "'s HP: " + enemy);
				System.out.println("\n\tChoose your action!");
				System.out.println("\t1 Attack");
				System.out.println("\t2 Magic");
				System.out.println("\t3 Block");

				String input = in.nextLine();
				if (input.equals("1")) {
					int damageDealt = rand.nextInt(attackDamage);
					int damageTaken = rand.nextInt(enemyAttackDamage);
					
					
					enemyHealth -= damageDealt;
					health -= damageTaken;

					System.out.println("\t> You slashed the " + enemy + " for " + damageDealt + " damage. ");
					System.out.println("\t> You took " + damageTaken + "as a counter!");

					if (health < 1) {
						System.out.println("\t> You lost all your health and were eaten GAME OVER!");
						break;
					}

				}

				else if (input.equals("2")) {
					health += healMagicCureAmount;
					System.out.println("\t> You casted Refresh magic healing HP for " + healMagicCureAmount + "."
							+ "\n\t> Current HP is now" + health + "HP");
				}

				else if (input.equals("3")) {
					int blockDamage = rand.nextInt(enemyAttackDamage / 2);
					int damageTaken = rand.nextInt(enemyAttackDamage);
					
					health -= blockDamage;
					
					System.out.println("\t> You blocked the attack and took" + blockDamage + "instead of" + damageTaken + "!");
				}

				else {
					System.out.println("Incorrect option");
				}
			}
			if (health < 1) {
				System.out.println("The monster gobbled has you up");
				break;
			}

			while (running) {
				System.out.println("---------------------------------------------------");
				String enemy1 = enemies[rand.nextInt(enemies.length)];
				System.out.println(" # " + enemy1 + " was destroyed! # ");
				System.out.println(" # You have " + health + " HP left. #");

				System.out.println("---------------------------------------------------");
				System.out.println("What is your next move?");
				System.out.println("1. Press on!");
				System.out.println("2. Leave dungeon");

				String input = in.nextLine();

				while (!input.equals("1") && !input.equals("2")) {
					System.out.println("Incorrect option");
					input = in.nextLine();
				}

				if (input.equals("1")) {
					System.out.println("You continue the path of a champion");
					
				}

				else if (input.equals("2")) {
					System.out.println("You left a hero");
					break;
				}

				System.out.println("##################################################");
				System.out.println("# You have made your mark as a legendary warrior #");
				System.out.println("##################################################");
			}
		}
	}
}
