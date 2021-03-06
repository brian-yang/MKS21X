public class Teacher extends Actor {
    private int fearFactor;

    //1. Must override the three consructors
    public Teacher(String name, int str, int agi, int intel, int health){
	super(name, str, agi, intel, health);
	fearFactor = 1000;
    }

    public Teacher(String name){
        this(name,10,10,15,20);
    }

    public Teacher(){
        this("Bill Gates");
    }

    public String toString(){
        return getName() + " hp: "+ getHealth()+ "\ns/a/i: " + getStr() +"/"+ getAgi() +"/" + getInt();
    }

    //2. need to override all methods below this comment
    public String attack(){
        return getName() +" stares down the enemy with a menacing stare";
    }

    public String specialAttack(){
        return getName() +" makes the enemy feel so much pressure that the enemy faints";
    }

    //how much special resource is left
    public int getResource(){return fearFactor;}

    //what is the name of the special resource
    public String getResourceName(){return "Fear Factor";}
}
