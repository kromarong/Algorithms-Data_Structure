package lesson3;

public interface Deque<E> {

    void addFirst(E value) throws Exception;

    void addLast(E value) throws Exception;

    E removeFirst() throws Exception;

    E removeLast() throws Exception;

    E peekFirst();

    E popFirst();

    E peekLast();

    E popLast();

    boolean isEmpty();

    boolean isFull();

    int getSize();
}
