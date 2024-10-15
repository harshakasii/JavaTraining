package Oops;


public class Q4PassingObjectToConstructor {
    public static void main(String[] args) {

        ObjectClass harsha = new ObjectClass(21, "harsha");

        ObjectClass ss = new ObjectClass(harsha);
        System.out.println(ss.name);
        System.out.println(ss.age);
    }
}


class ObjectClass {
    int age;
    String name;


    ObjectClass(ObjectClass aa) {
        this.age = aa.age;
        this.name = aa.name;
    }

    ObjectClass(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
