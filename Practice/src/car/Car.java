package car;

import java.util.Comparator;

public class Car {

    public int price;
    public int speed;


    public Car(int price, int speed){
        this.price = price;
        this.speed = speed;
    }

    public Car(){}

    public int compare(Car o1, Car o2) {
        return o1.price - o2.price;
    }

    public String toString(){
        return "("+price+"|"+speed+")";
    }

}
