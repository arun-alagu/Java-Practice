package singletonPattern;

public class EarlyInstantiation {
    public static EarlyInstantiation obj  = new EarlyInstantiation();

    private int value = 0;
    private EarlyInstantiation(){

    }

    public static EarlyInstantiation getInstance() {
        return obj;
    }

    public void hello() {
        System.out.println("Hello from Early Instantiation!");
    }

    public int addValue(){
        return ++value;
    }

    public int displayValue(){
        return value;
    }
}
