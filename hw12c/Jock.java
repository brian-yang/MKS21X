public class Jock extends Actor{
    private int rage;
    private final int maxValue;

    //1. Must override the three consructors
    public Jock(String name, int str, int agi, int intel, int health){
        super(name, str, agi, intel, health);
	maxValue = 1000;
	rage = 0;
    }

    public Jock(String name){
        this(name,20,15,10,15);
    }

    public Jock(){
        this("Muhammad Ali");
    }

    //2. need to override all methods below this comment
    public String attack(Actor enemy){
	if (enemy instanceof Teacher) { enemy.takeDamage(3); }
 	if (enemy instanceof Jock) { enemy.takeDamage(1); }
	if (enemy instanceof Nerd) { enemy.takeDamage(2); }
        return getName() +" uppercuts " + enemy.getName();
    }

    public String specialAttack(Actor enemy){
	if (rage >= 5) {
	    if (enemy instanceof Teacher) { enemy.takeDamage(7); }
	    if (enemy instanceof Jock) { enemy.takeDamage(2); }
	    if (enemy instanceof Nerd) { enemy.takeDamage(5); }
	    rage -= 5;
	    return getName() +" endures all of the enemy's attacks and one-hit KO's " + enemy.getName();
	} else {
	    return getName() + " failed to use Berserker Strike. Out of rage!";
	}
    }

    public int takeDamage(int damage) {
	if (rage <= maxValue - 5) {
	    rage += 5;
	}
	return super.takeDamage(damage);
    }

    //how much special resource is left
    public int getResource(){return rage;}

    //what is the name of the special resource
    public String getResourceName(){return "Rage";}
}

// NEED TO IMPLEMENT PART 5 - Special attacks need to reduce specialresource
// (5b) & (6) is done
// NEED TO IMPLEMENT PART 7 - Rage needs to increase when taking damage and
// cannot go higher than the max value
