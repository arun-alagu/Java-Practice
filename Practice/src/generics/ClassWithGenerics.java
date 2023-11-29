package generics;

public class ClassWithGenerics<T> {
    T input;

    public ClassWithGenerics(T input) {
        this.input = input;
    }

    public void display(){
        System.out.println("The input given is: "+input+" of type: "+ ((Object)input).getClass().getName());
    }
}
