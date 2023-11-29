package assignment;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {


    private int count;

    Main(int count) {
        this.count = count;
    }

    public synchronized void incValue(int offset) {
        count += offset;
    }

    public synchronized void getValue() {
        System.out.println(count);
    }

    public synchronized void decValue(int offset) {
        count -= offset;
    }

    public static void main(String[] args) throws InterruptedException {

    }
}
