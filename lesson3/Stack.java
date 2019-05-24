package lesson3;

public interface Stack<E> {

    void push(E value) throws Exception;

    E peek();

    E pop();

    boolean isEmpty();

    boolean isFull();

    void clear();

    int getSize();
}
