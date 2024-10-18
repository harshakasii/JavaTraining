package Oops.Inheritance;

public class Q8MultiLevelInheritance {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog3 extends Q8MultiLevelInheritance {
    void bark() {
        System.out.println("The dog barks.");
    }
}

class Puppy extends Dog3 {
    void weep() {
        System.out.println("The puppy weeps.");
    }
}

class Main5 {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.eat();  // Inherited from Animal
        puppy.bark(); // Inherited from Dog
        puppy.weep(); // Own method
    }
}
