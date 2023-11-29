package assignment;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{
    private final Count count;
    private final Lock lock;

    public Adder(Count count, Lock lock){
        this.count = count;
        this.lock = lock;
    }
    public void run(){
        for(int i=1; i<=10000; i++){
            lock.lock();
            count.i += 1;
            lock.unlock();
        }
    }
}
