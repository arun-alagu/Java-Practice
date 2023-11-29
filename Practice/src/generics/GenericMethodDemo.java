package generics;

public class GenericMethodDemo {

    public static <T> void display(T t){
        System.out.println(t);
    }

    public static void main(String[] args) {
        display("Hello");
        display(5);
    }
}
