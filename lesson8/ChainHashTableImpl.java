package lesson8;

public class ChainHashTableImpl implements HashTable {
    private Entry[] data;
    private int size;
    private int maxSize;

    public ChainHashTableImpl(int maxSize) {
        this.maxSize = maxSize;
        this.data = new Entry[maxSize * 2];
    }

    private static class Entry {
        private Item key;
        private int value;
        private Entry next;

        public Entry getNext() {
            return next;
        }

        public void setNext(Entry next) {
            this.next = next;
        }

        public Entry(Item key, int value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Entry{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }


    private int hashFunc(Item key) {
        return key.hashCode() % data.length;
    }

    @Override
    public boolean put(Item item, Integer cost) {
        if (size == maxSize) {
            return false;
        }

        Entry newElement = new Entry(item, cost);
        int index = hashFunc(item);

        if (data[index] == null){
            data[index] = newElement;
            size++;
        } else {
            Entry current = data[index];
            while (current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(newElement);
        }

        return true;
    }

    @Override
    public Integer get(Item item) {
        int index = indexOf(item);
        if (index != -1){
            Entry current = data[index];
            while (current != null){

                if (current.key.equals(item)){
                    return current.value;
                }

                current = current.getNext();
            }
        }

        return null;
    }

    private int indexOf(Item item) {
        int index = hashFunc(item);

        Entry current = data[index];
        while (current != null) {

            if (current.key.equals(item)) {
                return index;
            }
            current = current.getNext();
        }

        return -1;
    }

    @Override
    public boolean remove(Item item) {
        int index = indexOf(item);
        if (index != -1) {
            Entry current = data[index];
            if(current.key.equals(item) && current.getNext() == null){
                data[index] = null;
                size--;
            } else if (current.key.equals(item) && current.getNext() != null) {
                data[index] = current.getNext();
            } else {
                Entry previous = current;
                current = current.getNext();
                while(!current.key.equals(item)){
                    previous = current;
                    current = current.getNext();
                }
                if(current.getNext() == null){
                    previous.setNext(null);
                    current = null;
                } else {
                    previous.setNext(current.getNext());
                }

            }

            return true;
        }

        return false;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void display() {
        Entry current;
        System.out.println("----------");
        for (int i = 0; i < data.length; i++) {
            System.out.println(String.format("%d = [%s]", i , data[i]));
            if(data[i] != null){
                current = data[i];
                while (current.getNext() != null){
                    System.out.print(" -->      " + current.getNext());
                    current = current.getNext();
                }
                System.out.println("");
            }
        }
        System.out.println("----------");
    }
}
