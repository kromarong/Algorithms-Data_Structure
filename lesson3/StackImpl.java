package lesson3;

public class StackImpl<E> implements Stack<E> {

    private E[] data;
    private int size;
    private int pos;

    public StackImpl(int size) {
        this.data = (E[]) new Object[size];
        this.size = size;
    }

    @Override
    public void push(E value) throws Exception {
        if (isFull()){
            throw new Exception("Stack is full");
        }
        data[pos++] = value;
    }

    @Override
    public E peek() {
        return data[pos - 1];
    }

    @Override
    public E pop() {
        return data[--pos];
    }

    @Override
    public boolean isEmpty() {
        return (pos == 0);
    }

    @Override
    public boolean isFull() {
        return (pos == size);
    }

    @Override
    public void clear() {
        if (isEmpty()){
            return;
        }
        for(int i = 0; i <= pos; i++){
            data[i] = null;
        }
    }

    @Override
    public int getSize() {
        return pos;
    }
}
