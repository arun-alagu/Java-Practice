package singletonPattern;

public class LazyInstantiation {
    public static LazyInstantiation obj;
    private int value = 0;
    private LazyInstantiation(){}

    public static LazyInstantiation getInstance() {
        if (obj == null){
            synchronized(LazyInstantiation.class){
                if (obj == null)
                    return new LazyInstantiation();
            }
        }
        return obj;
    }

    public void hello() {
        System.out.println("Hello from Lazy Instantiation!");
    }

    public int addValue(){
        return ++value;
    }

    public int displayValue(){
        return value;
    }
}
