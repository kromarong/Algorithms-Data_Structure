package lesson6;

public class TreeWithLimitLayer<E extends Comparable<? super E>> extends TreeImpl<E> {

    private static final int LIMIT = 4;

    @Override
    public boolean add(E value) {

        if (isEmpty()) {
            root = new Node<>(value, 0);
            return true;
        }

        NodeAndPrevious nodeAndPrevious = doFind(value);
        if (nodeAndPrevious.current != null || nodeAndPrevious.previous.position >= LIMIT - 1) {
            return false;//Found duplicate
        }

        Node<E> newValue = new Node<>(value, nodeAndPrevious.previous.position + 1);
        Node<E> parent = nodeAndPrevious.previous;

        if (parent.shouldBeLeft(value)) {
            parent.setLeftChild(newValue);
        } else {
            parent.setRightChild(newValue);
        }

        return true;
    }

    @Override
    protected TreeImpl<E>.NodeAndPrevious doFind(E value) {
        Node<E> previous = null;
        Node<E> current = root;

        while (current != null) {
            if (current.getValue().equals(value)) {
                return new NodeAndPrevious(current, previous);
            }

            previous = current;
            if (current.shouldBeLeft(value)) {
                current = current.getLeftChild();
            } else {
                current = current.getRightChild();
            }
        }

        return new NodeAndPrevious(null, previous);
    }
}
