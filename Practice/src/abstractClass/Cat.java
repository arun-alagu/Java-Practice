package abstractClass;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println("Cat sound is meow!");
    }
}
