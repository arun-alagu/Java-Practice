package staticExamples;

public class Student {
    static int rollNo = 0;
    String name;

    String college = "KCT";

    Student(String n){
        rollNo++;
        name = n;
    }

    void display(){
        System.out.println("RollNo: "+rollNo+"\nName: "+name+"\nCollege: "+college);
    }
}
