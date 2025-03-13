public class Food extends Item{
    int healingPower;

    public Food(String name, int hp){
        super(name);
        healingPower = hp;

    }


    @Override
    public void use() {
        System.out.println(this.name + " was used for " + this.healingPower + " of healing");
    }
}
