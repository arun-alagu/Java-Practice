package collections;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<Node<T>>{
    Node<T> head;

    public LinkedList(Node<T> head) {
        this.head = head;
    }

    @Override
    public Iterator<Node<T>> iterator() {
        return new NodeIterator<>(head);
    }
}
