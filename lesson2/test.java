package lesson2;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class test {
    public static void main(String[] args) {
        Array<Integer> array = new ArrayImpl<>();
        Array<Integer> array2 = new ArrayImpl<>();
        Array<Integer> array3 = new ArrayImpl<>();

        Random rnd = new Random();

        for (int i = 0; i < 1_000_000; i++) {
            array.add(rnd.nextInt(1000));
        }

        ((ArrayImpl<Integer>) array2).add(array);
        ((ArrayImpl<Integer>) array3).add(array);

        Thread sortBubble = new Thread(() -> {
            long start = System.nanoTime();
            array.sortBubble();
            long finish = System.nanoTime();
            System.out.println("Sort bubble time: " + (TimeUnit.NANOSECONDS.toMillis(finish - start)) + " ms");
        });

        Thread sortSelect = new Thread(() -> {
            long start = System.nanoTime();
            array2.sortSelect();
            long finish = System.nanoTime();
            System.out.println("Sort select time: " + (TimeUnit.NANOSECONDS.toMillis(finish - start)) + " ms");
        });

        Thread sortInsert = new Thread(() -> {
            long start = System.nanoTime();
            array3.sortInsert();
            long finish = System.nanoTime();
            System.out.println("Sort insert time: " + (TimeUnit.NANOSECONDS.toMillis(finish - start)) + " ms");
        });

        sortBubble.start();
        sortSelect.start();
        sortInsert.start();

        try {
            sortBubble.join();
            sortSelect.join();
            sortInsert.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        System.out.println(array);
//        System.out.println(array2);
//        System.out.println(array3);
    }
}
