import collections.LinkedList;
import collections.Node;
import collections.NodeIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public class Main {
    static class Node implements  Iterable<Integer>{
        private int data;
        private Node next;

        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }

        @Override
        public Iterator<Integer> iterator() {
            return new NodeIterator(this);
        }
    }

    static class NodeIterator implements Iterator<Integer> {

        Node curr;

        NodeIterator(Node curr){
            this.curr = curr;
        }

        public boolean hasNext(){
            return curr != null;
        }

        public Integer next(){
            Integer toReturn = curr.data;
            curr = curr.next;

            return toReturn;
        }
    }

    public static void main(String[] args) {

        collections.Node<Integer> head = new collections.Node<>(5);
        head.next = new collections.Node<>(1);
        head.next.next = new collections.Node<>(15);

        collections.NodeIterator<Integer> NodeIterator = new collections.NodeIterator<>(head);

        System.out.print("Linked List iteration using iterator: ");
        while(NodeIterator.hasNext()){
            System.out.printf("%d ",NodeIterator.next().data);
        }
    }


}