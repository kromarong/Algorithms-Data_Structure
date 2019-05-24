package lesson3;

public class DequeImpl<E> implements Deque<E> {

    private E[] data;
    private int size;
    private int head;
    private int tale;

    public DequeImpl(int size) {
        this.data = (E[]) new Object[size];
        this.head = 0;
        this.tale = -1;
    }



    @Override
    public void addFirst(E value) throws Exception {
        if (isFull()){
            throw new Exception("Deque is full");
        }

        if (head == 0){
            head = data.length - 1;
        }
        size++;
        data[head--] = value;

    }

    @Override
    public void addLast(E value) throws Exception {
        if (isFull()){
            throw new Exception("Deque is full");
        }

        if (tale == data.length - 1){
            tale = -1;
        }
        data[++tale] = value;
        size++;
    }

    @Override
    public E removeFirst() throws Exception {
        if (isEmpty()){
            throw new Exception("Queue is empty");
        }

        if (head == data.length - 1){
            head = -1;
        }
        size--;
        return data[++head];
    }

    @Override
    public E removeLast() throws Exception {
        if (isEmpty()){
            throw new Exception("Queue is empty");
        }

        if (tale == - 1){
            tale = data.length - 1;
        }
        size--;
        return data[tale--];
    }

    @Override
    public E peekFirst() {
        return data[head];
    }

    @Override
    public E popFirst() {
        size--;
        return data[++head];
    }

    @Override
    public E peekLast() {
        return data[tale + 1];
    }

    @Override
    public E popLast() {
        size--;
        return data[tale--];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }

    @Override
    public int getSize() {
        return size;
    }
}
