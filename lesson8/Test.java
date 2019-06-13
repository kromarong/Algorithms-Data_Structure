package lesson8;

public class Test {
    public static void main(String[] args) {
//        HashTable hashTable = new HashTableImpl(5);//5 * 2 = 10
//        HashTable hashTable = new DoubleHashTableImpl(5);//5 * 2 = 10
        HashTable hashTable = new ChainHashTableImpl(10);//10 * 2 = 20

        hashTable.put(new Item(1, "Orange"), 150);
        hashTable.put(new Item(77, "Banana"), 100);
        hashTable.put(new Item(60, "Lemon"), 250);
        hashTable.put(new Item(21, "Potato"), 67);
        hashTable.put(new Item(31, "Beer"), 80);
        hashTable.put(new Item(65, "Juice"), 80);
        hashTable.put(new Item(23, "Cucumber"), 120);
        hashTable.put(new Item(43, "Carrot"), 77);
        hashTable.put(new Item(63, "Onion"), 60);
        hashTable.put(new Item(44, "Milk"), 120);

        System.out.println("Size is " + hashTable.getSize());
        hashTable.display();

        System.out.println("Cost potato is " + hashTable.get(new Item(21, "Potato")));
        System.out.println("Cost banana is " + hashTable.get(new Item(77, "Banana")));
        System.out.println("Cost carrot is " + hashTable.get(new Item(43, "Carrot")));

        hashTable.remove(new Item(21, "Potato"));
        hashTable.remove(new Item(77, "Banana"));
        hashTable.remove(new Item(43, "Carrot"));

        System.out.println("Cost potato is " + hashTable.get(new Item(21, "Potato")));
        System.out.println("Cost banana is " + hashTable.get(new Item(77, "Banana")));
        System.out.println("Cost carrot is " + hashTable.get(new Item(43, "Carrot")));
        hashTable.display();

    }
}
