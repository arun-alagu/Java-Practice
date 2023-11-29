package abstractClass;

abstract public class Animal {
    private final String name;

    public Animal(String name){
        this.name = name;
    }
    abstract void sound();
    void eat(){
        System.out.println(name+" is eating");
    }
}
