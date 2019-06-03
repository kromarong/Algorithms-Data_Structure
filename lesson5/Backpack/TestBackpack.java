package lesson5.Backpack;

import java.util.ArrayList;
import java.util.List;

public class TestBackpack {
    public static void main(String[] args) {
        List<Item> listItem = new ArrayList<Item>();
        listItem.add(new Item("Book", 1, 600));
        listItem.add(new Item("Binoculars", 2, 5000));
        listItem.add(new Item("First aid kit", 4, 1500));
        listItem.add(new Item("Laptop", 2, 40000));
        listItem.add(new Item("Bowler", 1, 500));

        Backpack backpack = new Backpack(4);

        backpack.calcBackpack(listItem);

        List<Item> result = backpack.getBestSet();

        List<Item> test = new ArrayList(listItem);

        test.remove(1);

        test = listItem;


        for (Item item : result){
            System.out.println(item);
        }

    }
}
