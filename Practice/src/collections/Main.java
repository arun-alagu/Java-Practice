package collections;

public class Main {
    public static void main(String[] args) {
        Node<Integer> head = new Node<>(5);
        head.next = new Node<>(10);
        head.next.next = new Node<>(15);

        NodeIterator<Integer> iterator = new NodeIterator<>(head);

        while(iterator.hasNext()){
            System.out.println(iterator.next().data);
        }

        System.out.println("\n");

        LinkedList<Integer> ll = new LinkedList<>(head);
        for(Node<Integer> i : ll){
            System.out.println(i.data);
        }
    }
}
