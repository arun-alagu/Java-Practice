package leetcode.printInOrder;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Foo foo = new Foo();
        Thread A = new Thread();
        Thread B = new Thread();
        Thread C = new Thread();

        foo.third(C);
        foo.first(A);
        foo.second(B);

    }
}
