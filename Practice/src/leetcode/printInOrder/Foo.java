package leetcode.printInOrder;

import java.util.concurrent.Semaphore;

public class Foo {

    public Foo() {

    }

    Semaphore first = new Semaphore(1);
    Semaphore second = new Semaphore(1);

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
    }

    public void second(Runnable printSecond) throws InterruptedException {

        // printSecond.run() outputs "second". Do not change or remove this line.
        first.acquire();
        printSecond.run();
    }

    public void third(Runnable printThird) throws InterruptedException {

        // printThird.run() outputs "third". Do not change or remove this line.
        first.acquire();
        second.acquire();
        printThird.run();
    }
}
