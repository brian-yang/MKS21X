public class Wizard extends Actor {

    private String name;
    private int strength, agility, intelligence;
    private int health;
    private int mana;

    // Constructors
    public Wizard(String name, int str, int agi, int intel, int health, int MP) {
	super(name, str, agi, intel, health);
	mana = MP;
    }

    public Wizard(String name, int MP) {
	super(name);
	mana = MP;
    }

    public Wizard() {
	super();
	mana = 100;
    }

    public String attack() {
	return "Used firebolt. Dealt " + Integer.toString(this.agility * 2 + this.intelligence * 3 + mana) + " damage";
    }

    public String specialAttack() {
	return "Used grand magic: Extehr Raquia. Obliterated!";
    }

    public static void main(String[] args) {
	Wizard gandalf = new Wizard();
	System.out.println(gandalf.attack());
	System.out.println(gandalf.specialAttack());
    }

}
