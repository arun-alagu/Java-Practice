package singletonPattern;

public class Client {

    public static void main(String[] args) {
//        EarlyInstantiation obj1 = EarlyInstantiation.getInstance();
//        LazyInstantiation obj1 = LazyInstantiation.getInstance();
        EnumSingleton obj1 = EnumSingleton.INSTANCE;
        obj1.hello();
        System.out.println("-------------------------------------------------");
        System.out.println("Value display using object obj1: "+obj1.displayValue());
        System.out.println("Value add using object obj1: "+obj1.addValue());
        System.out.println("-------------------------------------------------");

//        EarlyInstantiation obj2 = EarlyInstantiation.getInstance();
//        LazyInstantiation obj2 = LazyInstantiation.getInstance();
        EnumSingleton obj2 = EnumSingleton.INSTANCE;
        System.out.println("Value display using object obj2: "+obj2.displayValue());
        System.out.println("Value add using object obj2: "+obj2.addValue());
        System.out.println("-------------------------------------------------");
        System.out.println("Value display using object obj1: "+obj1.displayValue());
        System.out.println("Value display using object obj2: "+obj2.displayValue());
    }

}
