package generics;

public class DemoClass implements demoInterface<Integer, String>{
    public void display1(Integer t) {
        System.out.println("The input is: "+t);
    }
    public void display2(String t) {
        System.out.println("The input is: "+t);
    }
}
