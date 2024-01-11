package singletonPattern;

public enum EnumSingleton {
    INSTANCE;

    private int value = 0;

    public void hello() {
        System.out.println("Hello from Enum Instantiation!");
    }

    public int addValue(){
        return ++value;
    }

    public int displayValue(){
        return value;
    }
}
