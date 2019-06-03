package lesson6;

import java.util.Random;

public class Test6 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int count = 0;

        for (int i = 0; i < 20 ; i++) {
            TreeWithLimitLayer<Integer> testTree = new TreeWithLimitLayer<>();
            for (int j = 0; j < 20; j++) {
                testTree.add(rnd.nextInt(40) - 20);
            }
            if (testTree.isBalanced(testTree.getRoot())){
                count++;
                System.out.println("is balanced -----------------------------");
            }
            testTree.display();
        }

        System.out.println(count);

    }
}
