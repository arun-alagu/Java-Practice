package leetcode.h2o;

import java.util.concurrent.Semaphore;

class H2O {

    public H2O() {

    }

    Semaphore hydrogen = new Semaphore(0);
    Semaphore oxygen = new Semaphore(0);
    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {

        // releaseHydrogen.run() outputs "H". Do not change or remove this line.
        hydrogen.release();
        releaseHydrogen.run();




    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {

        // releaseOxygen.run() outputs "O". Do not change or remove this line.
        hydrogen.acquire();
        hydrogen.acquire();
        releaseOxygen.run();
    }
}
