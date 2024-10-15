package Oops;

public class Q5CallingConstructorFromConstructor {
    public static void main(String[] args) {

        Test ss = new Test();
        System.out.println(ss.age);
        System.out.println(ss.name);

    }
}



class Test {

    int age;
    String name;


    Test() {
        this(23, "Harsha");
    }


    Test(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
