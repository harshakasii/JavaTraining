package Oops;

public class Q2ByDefaultConstructor {
    public static void main(String[] args) {
        Constructor ss = new Constructor();
        ss.age = 24;
        ss.name = "Harsha";
        System.out.println(ss.name);
        System.out.println(ss.age);
    }
}


class Constructor {
    int age;
    String name;

    Constructor() {
    }
}
