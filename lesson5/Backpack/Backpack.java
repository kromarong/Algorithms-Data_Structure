package lesson5.Backpack;

import java.util.ArrayList;
import java.util.List;

public class Backpack {

    private static List<Item> bestSet;
    private static int bestPrice;
    private static int weight;

    public Backpack(int weight) {
        this.weight = weight;
    }

    public static void calcBackpack(List<Item> itemList) {
        if (!itemList.isEmpty()) {
            isBestSet(itemList);
        }

        for (int i = 0; i < itemList.size(); i++) {
            List<Item> newSet = new ArrayList<>(itemList);
            newSet.remove(i);
            calcBackpack(newSet);
        }
    }

    private static boolean isBestSet(List<Item> listItem) {
        boolean result = false;
        if (checkPriceItems(listItem) > bestPrice && checkWeightItems(listItem) <= weight) {
            bestSet = listItem;
            bestPrice = checkPriceItems(listItem);
            result = true;
        }
        return result;
    }

    private static int checkPriceItems(List<Item> list) {
        int result = 0;
        for (Item item : list) {
            result += item.getPrice();
        }
        return result;
    }

    private static int checkWeightItems(List<Item> list) {
        int result = 0;
        for (Item item : list) {
            result += item.getWeigt();
        }
        return result;
    }

    public static List<Item> getBestSet() {
        return bestSet;
    }
}
