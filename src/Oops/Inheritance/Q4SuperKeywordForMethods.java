package Oops.Inheritance;

public class Q4SuperKeywordForMethods {
    void eat() {
        System.out.println("Animal eats");
    }
}



class Dog extends Q4SuperKeywordForMethods{
    void eat() {
        System.out.println("Dog eats");
    }

    void show() {
        super.eat();
    }
}



class Object1 {
    public static void main(String[] args) {
        Dog ss = new Dog();
        ss.show();
    }
}

class Object2 {
    public static void main(String[] args) {
        Q4SuperKeywordForMethods ss2 = new Dog();
        ss2.eat();
    }
}



