package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(2);
        lhs.add(3);
        lhs.remove(3);
        lhs.add(1);
        lhs.add(3);

        TreeSet<Integer> tset = new TreeSet<>();
        tset.add(5);
        tset.add(1);
        tset.add(2);
        
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

        System.out.println();
        
        System.out.print("Linked Hash Set:");
        for(int i : lhs){
            System.out.printf("%d ", i);
        }

        System.out.println();

        System.out.print("TreeSet values using iterator: ");
        Iterator tsetIterator = tset.iterator();
        while(tsetIterator.hasNext()){
            System.out.printf("%d ", tsetIterator.next());
        }
        System.out.println(tset.higher(1));
    }
}
