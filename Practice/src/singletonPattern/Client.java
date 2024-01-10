package singletonPattern;

public class Client {

    public static void main(String[] args) {
        EarlyInstantiation e1 = EarlyInstantiation.getInstance();
        e1.hello();
        System.out.println("-------------------------------------------------");
        System.out.println("Value display using object e1: "+e1.displayValue());
        System.out.println("Value add using object e1: "+e1.addValue());
        System.out.println("-------------------------------------------------");
        EarlyInstantiation e2 = EarlyInstantiation.getInstance();
        System.out.println("Value display using object e2: "+e2.displayValue());
        System.out.println("Value add using object e2: "+e2.addValue());
        System.out.println("-------------------------------------------------");
        System.out.println("Value display using object e1: "+e1.displayValue());
        System.out.println("Value display using object e2: "+e2.displayValue());
    }

}
