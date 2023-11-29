package collections;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4);

        Node<Integer> head = new Node<>(5);
        head.next = new Node<>(10);
        head.next.next = new Node<>(15);

//        NodeIterator<Integer> iterator = new NodeIterator<>(head);
//
//        while(iterator.hasNext()){
//            System.out.println(iterator.next().data);
//        }
//
//        System.out.println("\n");
//
//        LinkedList<Integer> ll = new LinkedList<>(head);
//        for(Node<Integer> i : ll){
//            System.out.println(i.data);
//        }
        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext()){
            System.out.printf("%d ",iterator.next());
        }
        System.out.println();
        for (Integer integer : list) {
            System.out.printf("%d ",integer);
        }
    }
}
