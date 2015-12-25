public class Teacher extends Actor {
    private int mana;
    private final int maxValue;

    //1. Must override the three consructors
    public Teacher(String name, int str, int agi, int intel, int health){
	super(name, str, agi, intel, health);
	maxValue = 1000;
	mana = maxValue;
    }

    public Teacher(String name){
        this(name,10,15,20,15);
    }

    public Teacher(){
        this("Bill Gates");
    }

    public String toString(){
        return getName() + " hp: "+ getHealth()+ "\ns/a/i: " + getStr() +"/"+ getAgi() +"/" + getInt();
    }

    //2. need to override all methods below this comment
    public String attack(Actor enemy){
	if (enemy instanceof Teacher) { enemy.takeDamage(2); }
 	if (enemy instanceof Jock) { enemy.takeDamage(3); }
	if (enemy instanceof Nerd) { enemy.takeDamage(1); }
        return getName() +" stares down the enemy with a menacing stare";
    }

    public String specialAttack(Actor enemy){
	if (mana > 0) {
	    if (enemy instanceof Teacher) { enemy.takeDamage(5); }
	    if (enemy instanceof Jock) { enemy.takeDamage(8); }
	    if (enemy instanceof Nerd) { enemy.takeDamage(3); }
	    mana -= 5;
	    return getName() +" makes the enemy feel so much pressure that the enemy faints";
	} else {
	    return getName() + " failed to use Mana Bomb. Out of mana!";
	}
    }

    public String defend() {
	mana += 5;
	return super.defend();
    }

    //how much special resource is left
    public int getResource(){return mana;}

    //what is the name of the special resource
    public String getResourceName(){return "Mana";}

// NEED TO IMPLEMENT PART 5 - Special attacks need to reduce specialresource
// (5b) is done -- CONSTANT NEEDED FOR (6)
// NEED TO IMPLEMENT PART 7 - Mana needs to increase when defending and
// cannot go higher than the max value
}
