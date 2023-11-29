package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(1,2,3));

        Node<Integer> head = new Node<>(5);
        head.next = new Node<>(10);
        head.next.next = new Node<>(15);

        NodeIterator<Integer> NodeIterator = new NodeIterator<>(head);

        System.out.print("Linked List iteration using iterator: ");
        while(NodeIterator.hasNext()){
            System.out.printf("%d ",NodeIterator.next().data);
        }

        System.out.println();
        System.out.print("Linked List iteration using enhanced for: ");
        LinkedList<Integer> ll = new LinkedList<>(head);
        for(Node<Integer> i : ll){
            System.out.printf("%d ",i.data);
        }

        Iterator<Integer> iterator = list.iterator();

        System.out.println();
        System.out.print("List iteration using iterator: ");
        while(iterator.hasNext()){
            System.out.printf("%d ",iterator.next());
        }

        System.out.println();

        System.out.print("List iteration using enhanced for: ");
        for (Integer integer : list) {
            System.out.printf("%d ",integer);
        }
    }
}
