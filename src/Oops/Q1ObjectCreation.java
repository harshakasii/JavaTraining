package Oops;

public class ObjectCreation {
    public static void main(String[] args) {
        Student ss = new Student();
        ss.name = "Harsha";
        ss.roll_no = 1;
        ss.age = 23;
        ss.weight = 45.3f;

        System.out.println(ss.weight);
    }
}

class Student{
    String name = "Sam";
    int roll_no;
    int age;
    float weight = 23.3f;
}
