public class Weapon extends Item{
    int strength;

    public Weapon(String name, int strength){
        super(name);
        this.strength = strength;

    }


    @Override
    public void use() {
        System.out.println(this.name + " was used for " + this.strength + " of damage");
    }
}
