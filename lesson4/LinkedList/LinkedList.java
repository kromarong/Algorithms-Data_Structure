package lesson4.LinkedList;

public interface LinkedList<E> {

    void insertFirst(E value);

    E removeFirst();

    boolean remove(E value);

    void display();

    boolean isEmpty();

    int getSize();

    boolean contains(E value);

    E getFirstElement();

}
