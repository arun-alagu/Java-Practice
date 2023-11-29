package abstractClass;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println("Dog sound is woow!");
    }
}
