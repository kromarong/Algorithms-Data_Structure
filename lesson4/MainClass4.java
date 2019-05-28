package lesson4;

import lesson4.LinkedList.SimpleLinkedListImpl;
import lesson4.LinkedList.TwoSideLinkedListImpl;


public class MainClass4 {
    public static void main(String[] args) {
        SimpleLinkedListImpl<Integer> testList = new SimpleLinkedListImpl<>();
//        TwoSideLinkedList<Integer> testList = new TwoSideLinkedListImpl<>();
        testList.insertFirst(1);
        testList.insertFirst(2);
        testList.insertFirst(3);
        testList.insertFirst(4);
        testList.insertFirst(4);
        testList.removeFirst();

//        testList.display();

        for (Integer value : testList){
            System.out.println(value);
        }
    }



}
