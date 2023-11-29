package generics;

public class Main {

    public static void main(String[] args) {
//        ClassWithoutGenerics cog = new ClassWithoutGenerics("Hello");
//        ClassWithGenerics<String> cwg = new ClassWithGenerics<>("Hello");
//
//        System.out.println(cwg.input.length());
//
//        cog.display();
//        cwg.display();

        DemoClass demo = new DemoClass();

        demo.display1(5);
        demo.display2("Hai");
    }


}
