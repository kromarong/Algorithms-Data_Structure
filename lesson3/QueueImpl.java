package lesson3;

public class QueueImpl<E> implements Queue<E> {

    protected E[] data;
    protected int size;
    private int head;
    private int tale;

    public QueueImpl(int size) {
        this.data = (E[]) new Object[size];
        this.head = 0;
        this.tale = -1;
    }

    @Override
    public void insert(E value) throws Exception {
        if (isFull()){
            throw new Exception("Queue is full");
        }

        if (tale == data.length - 1){
            tale = -1;
        }
        data[++tale] = value;
        size++;
    }

    @Override
    public E remove() throws Exception {
        if (isEmpty()){
            throw new Exception("Queue is empty");
        }

        if (head == data.length){
            head = 0;
        }
        size--;
        return data[head++];
    }


    @Override
    public E peek() {
        return data[head];
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
