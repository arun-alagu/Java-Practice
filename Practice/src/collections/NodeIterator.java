package collections;

import java.util.Iterator;

public class NodeIterator<T> implements Iterator<Node<T>> {

    Node<T> curr;
    public NodeIterator(Node<T> curr) {
        this.curr = curr;
    }

    @Override
    public boolean hasNext() {
        return curr != null;
    }

    @Override
    public Node<T> next() {
        Node<T> toReturn = curr;
        curr = curr.next;
        return toReturn;
    }
}
