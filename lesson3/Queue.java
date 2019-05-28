package lesson3;

public interface Queue<E> {

    void insert(E value) throws Exception;

    E remove() throws Exception;

    E peek();

    boolean isEmpty();

    boolean isFull();

    int getSize();
}
