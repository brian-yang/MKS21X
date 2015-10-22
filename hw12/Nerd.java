public class Nerd extends Actor{
    private int psychicPower;

    //1. Must override the three consructors
    public Nerd(String name, int str, int agi, int intel, int health){
        super(name, str, agi, intel, health);
	psychicPower = 300;
    }

    public Nerd(String name){
        this(name, 10, 15, 20, 15);
    }

    public Nerd(){
	this("Bill Nye the Science Guy");
    }

    public String toString(){
        return getName() + " hp: "+ getHealth()+ "\ns/a/i: "+ getStr() +"/"+ getAgi() +"/"+ getInt();
    }

    //2. need to override all methods below this comment
    public String attack(){
        return getName() +" telekinetically throws objects at the enemy";
    }

    public String specialAttack(){
        return getName() + " completely erases any traces of his enemy's existence";
    }

    //how much special resource is left
    public int getResource(){return psychicPower;}

    //what is the name of the special resource
    public String getResourceName(){return "Psychic Power";}
}
