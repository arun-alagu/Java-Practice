package Inheritance;

public class C extends P {
    protected int d2 = 20;
    protected int d = 200;
    @Override
    protected void fun() {
        System.out.println("C's fun.");
    }

    protected void fun2() {
        System.out.println("C's fun2.");
    }

    protected static void sfun(){
        System.out.println("C's sfun.");
    }
}
