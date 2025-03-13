import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        //hashMapExample();

        polymorphismExample();

    }

    private static void polymorphismExample() {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Flower"));
        items.add(new Item("Ball"));
        items.add(new Food("Pizza", 15));
        items.add(new Weapon("Axe", 2));


        for(Item currentItem:items){
            currentItem.use();
        }



    }


    public static void hashMapExample(){
        HashMap<String, Integer> klassLista = new HashMap<>();

        klassLista.put("TE22A",26);
        klassLista.put("TE22B",23);
        klassLista.put("TE22C",28);
        klassLista.put("TE22D",32);
        klassLista.put("TE22E",25);
        klassLista.putIfAbsent("TE22C",54);

        System.out.println("TE22C " + klassLista.get("TE22C"));

    }
}