package lesson5.Backpack;

public class Item {
    private String name;
    private int weigt;
    private int cost;

    public Item(String name, int weigt, int cost) {
        this.name = name;
        this.weigt = weigt;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getWeigt() {
        return weigt;
    }

    public int getPrice() {
        return cost;
    }

    @Override
    public String toString() {
        return (name + " " + weigt + " " + cost);
    }
}
