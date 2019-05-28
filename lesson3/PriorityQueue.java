package lesson3;

public class PriorityQueue<E extends Object & Comparable<? super E>> extends QueueImpl<E> {

    public PriorityQueue(int size) {
        super(size);
    }

    @Override
    public void insert(E value) {
        int i;
        if (size == 0)
            data[size++] = value;
        else {
            for (i = size - 1; i >= 0; i--) {
                if (value.compareTo(data[i]) > 0)
                    data[i + 1] = data[i];
                else
                    break;
            }
            data[i + 1] = value;
            size++;
        }

    }

    @Override
    public E remove() {
        return data[--size];
    }

    @Override
    public E peek() {
        return data[size - 1];
    }
}
