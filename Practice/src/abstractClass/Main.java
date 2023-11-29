package abstractClass;

public class Main {
    public static void main(String[] args) {
//        Animal dog = new Animal("Dog") {
//            @Override
//            void sound() {
//                System.out.println("Dog sound is woow!");
//            }
//        };
//        dog.eat();
//        dog.sound();

//        Animal cat = new Animal("Cat") {
//            @Override
//            void sound() {
//                System.out.println("Cat sound is meow!");
//            }
//        };
//
//        cat.sound();
//        cat.eat();


        Dog papu = new Dog("Papu");
        Cat soori = new Cat("Soori");

        papu.eat();
        papu.sound();

        soori.eat();
        soori.sound();

    }
}
