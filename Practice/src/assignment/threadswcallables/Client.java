package assignment.threadswcallables;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayCreator arrayCreator = new ArrayCreator(n);

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<List<Integer>> arrayList = executor.submit(arrayCreator);
        System.out.println(arrayList.get());

        executor.shutdown();

    }
}
