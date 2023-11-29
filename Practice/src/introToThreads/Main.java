package introToThreads;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World! from "+Thread.currentThread().getName());

        HelloWithThreads hello = new HelloWithThreads();
        Thread t = new Thread(hello);
        t.run();

        System.out.println("Bye! from "+Thread.currentThread().getName());


    }
}
