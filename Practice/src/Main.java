public class Main {
    public static void main(String[] args) {
       String s = new String("Hello");
       String t = new String("Hello");

       String copyS = s;

        System.out.println("s == t: "+(s==t));
        System.out.println("s == copyS: "+(s==copyS));
        System.out.println("s.equals(t): "+ s.equals(t));
        System.out.println("s.equals(copyS): "+s.equals(copyS));

        System.out.println("Hello World!");

    }

}