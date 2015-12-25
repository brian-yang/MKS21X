public class Nerd extends Actor{
    private int something;
    private final int maxValue;

    //1. Must override the three consructors
    public Nerd(String name, int str, int agi, int intel, int health){
        super(name, str, agi, intel, health);
	maxValue = 0;
    }

    public Nerd(String name){
        this(name, 10, 20, 15, 15);
    }

    public Nerd(){
	this("Bill Nye the Science Guy");
    }

    public String toString(){
        return getName() + " hp: "+ getHealth()+ "\ns/a/i: "+ getStr() +"/"+ getAgi() +"/"+ getInt();
    }

    //2. need to override all methods below this comment
    public String attack(Actor enemy){
	if (enemy instanceof Teacher) { enemy.takeDamage(1); }
 	if (enemy instanceof Jock) { enemy.takeDamage(2); }
	if (enemy instanceof Nerd) { enemy.takeDamage(3); }
        return getName() +" telekinetically throws objects at the enemy";
    }

    public String specialAttack(Actor enemy){
	if (something > 0) {
	    if (enemy instanceof Teacher) { enemy.takeDamage(3); }
	    if (enemy instanceof Jock) { enemy.takeDamage(6); }
	    if (enemy instanceof Nerd) { enemy.takeDamage(8); }
	    return getName() + " completely erases any traces of his enemy's existence";
	} else {
	    return getName() + " failed to use THE SOMETHING POWER. Out of SOMETHING!";
	}
    }

    //how much special resource is left
    public int getResource(){return something;}

    //what is the name of the special resource
    public String getResourceName(){return "Something";}
}


// Need to implement special resource and then work on 5 through 7
