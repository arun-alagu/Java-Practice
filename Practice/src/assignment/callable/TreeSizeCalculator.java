package assignment.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TreeSizeCalculator implements Callable<Integer> {
    Node root;
    ExecutorService executorService;

    public TreeSizeCalculator(Node root, ExecutorService executorService) {
        this.root = root;
        this.executorService = executorService;
    }

    @Override
    public Integer call() throws Exception {
        if(root == null) return 0;
        TreeSizeCalculator leftNode = new TreeSizeCalculator(root.left, executorService);
        TreeSizeCalculator rightNode = new TreeSizeCalculator(root.right, executorService);

        Future<Integer> leftNodeSize = executorService.submit(leftNode);
        Future<Integer> rightNodeSize = executorService.submit(rightNode);
        return 1 + leftNodeSize.get() + rightNodeSize.get();
    }

}
