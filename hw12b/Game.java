import java.util.*;

public class Game {

    public static void main(String[] args) {

	System.out.println("What kind of character do you want to be?");
	System.out.println("Nerd, Jock, or a Teacher? N/J/T");
	
	Scanner s;
	String choice;
	Actor player = null;
	Actor enemy = null;

	s = new Scanner(System.in);
	choice = s.next().toLowerCase();

	do {
	    if (choice.equals("n")) {
		player = new Nerd();
	    } else if (choice.equals("j")) {
		player = new Jock();
	    } else if (choice.equals("t")) {
		player = new Teacher();
	    } else {
		System.out.println("Try again!");
		choice = s.next().toLowerCase();
	    }
	} while (player.equals(null));

	System.out.println("Who is your enemy? N/J/T");

	choice = s.next().toLowerCase();

	do {
	    if (choice.equals("n")) {
		enemy = new Nerd();
	    } else if (choice.equals("j")) {
		enemy = new Jock();
	    } else if (choice.equals("t")) {
		enemy = new Teacher();
	    } else {
		System.out.println("Try again!");
		choice = s.next().toLowerCase();
	    }
	} while (enemy.equals(null)); 

	while (!choice.equals("quit") && player.getHealth() > 0 && enemy.getHealth() > 0) {
	    System.out.println("Attack, SpecialAttack, Defend, Quit");
	    choice = s.next().toLowerCase();
	    if (choice.equals("attack")) {
		System.out.println(player.attack(enemy));
	        System.out.println(enemy.attack(player));
	    }
	    if (choice.equals("specialattack")) {
		System.out.println(player.specialAttack(enemy));
		System.out.println(enemy.specialAttack(player));
	    }
		
	    // If player defends, take no damage. Same goes for the enemy.

	    if (!choice.equals("quit")) {
	        System.out.println("Your enemy copies your move.");
		System.out.println("Your health: " + player.getHealth());
		System.out.println("Enemy health: " + enemy.getHealth());
	    }

	    if (player.getHealth() <= 0 && enemy.getHealth() <= 0) {
		System.out.println("TIE!");
	    } else if (player.getHealth() <= 0) {
		System.out.println("Enemy WON! You lost. Sorry...");
	    } else if (enemy.getHealth() <= 0) {
		System.out.println("You have WON! Congratulations!");
	    }
	}


    }
}
