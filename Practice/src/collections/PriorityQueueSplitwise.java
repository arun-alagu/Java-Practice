package collections;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeSet;

import Inheritance.P;

/**
 * Person
 */
class Person implements Comparable<Person>{
    private String name;
    private Double amount;

    public Person(String name, Double amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public int compareTo(Person o) {
        return Double.compare(o.getAmount(), this.getAmount());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}

class PriorityQueueSplitwise{
    public static void main(String[] args) {

        PriorityQueue<Person> paidBy = new PriorityQueue<>();
        PriorityQueue<Person> paidTo = new PriorityQueue<>();

        paidBy.add(new Person("A", 2000.0));
        paidBy.add(new Person("C", 1500.0));
        paidBy.add(new Person("E", 1200.0));

        paidTo.add(new Person("B", 3000.0));
        paidTo.add(new Person("D", 1700.0));

        System.out.println(paidBy.peek());
        System.out.println(paidTo.peek());

        while(!paidBy.peek().getAmount().equals(0.0) || !paidTo.peek().getAmount().equals(0.0)){
            Person payer = paidTo.poll(), payee = paidBy.poll();
            Double payerAmount = payer.getAmount(), payeeAmount = payee.getAmount();
            String payerName = payer.getName(), payeeName = payee.getName();

            Double minAmount = Math.min(payeeAmount, payerAmount);
            payerAmount -= minAmount;
            payeeAmount -= minAmount;

            paidTo.add(new Person(payerName, payerAmount));
            paidBy.add(new Person(payeeName, payeeAmount));

            System.out.print(payerName + " gives: "+ minAmount + " to ");
            System.out.println(payeeName + ", " + payeeName + " still needs: "+payeeAmount);

        }

    }



}