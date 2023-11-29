package staticExamples;

public class Main {
    public static void main(String[] args) {
        Integer a = 5;
        Integer b = 5;

        System.out.println(a+b);

        Student st1 = new Student("Arun");
        st1.display();
        Student st2 = new Student("Ahesh");
        st2.display();
        System.out.println(st1.name);
    }
}
