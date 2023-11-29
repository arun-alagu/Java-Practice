public class Person {
    int age;
    String name;

    Person(){

    }
    Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    void display(){
        System.out.println("Age :"+this.age);
        System.out.println("Name: "+this.name);
    }
}
