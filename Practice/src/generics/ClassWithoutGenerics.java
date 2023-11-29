package generics;

public class ClassWithoutGenerics {
    String input;

    public ClassWithoutGenerics(String input){
        this.input = input;
    }

    public void display(){
        System.out.println("The input given is: "+input+" of type: "+ ((Object)input).getClass().getName());
    }
}
