public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    // Static factory method for autoboxing
    public static MyInteger valueOf(int value) {
        return new MyInteger(value);
    }
}