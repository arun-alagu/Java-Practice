package assignment.callable;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        TreeSizeCalculator treeSizeCalculator = new TreeSizeCalculator(root, executorService);

        Future<Integer> future = executorService.submit(treeSizeCalculator);

        System.out.println("Binary Tree Size: "+future.get());

        executorService.shutdown();


    }
}
