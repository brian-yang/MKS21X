public class Jock extends Actor{
    private int endurance;

    //1. Must override the three consructors
    public Jock(String name, int str, int agi, int intel, int health){
        super(name, str, agi, intel, health);
	endurance = 9000;
    }

    public Jock(String name){
        this(name,20,15,10,15);
    }

    public Jock(){
        this("Muhammad Ali");
    }

    public String toString(){
        return getName() + " hp: "+ getHealth()+ "\ns/a/i: "+ getStr() +"/"+ getAgi() +"/"+ getInt();
    }

    //2. need to override all methods below this comment
    public String attack(){
        return getName() +" uppercuts the enemy";
    }

    public String specialAttack(){
        return getName() +" endures all of the enemy's attacks and one-hit KO's the enemy";
    }

    //how much special resource is left
    public int getResource(){return endurance;}

    //what is the name of the special resource
    public String getResourceName(){return "Endurance";}
}
