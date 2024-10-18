package Oops.Inheritance;

public class Q7SingleLevelInheritance {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog1 extends Q7SingleLevelInheritance {
    void bark() {
        System.out.println("The dog barks.");
    }
}

class Main1 {
    public static void main(String[] args) {
        Dog1 dog = new Dog1();
        dog.eat();  // Inherited method
        dog.bark(); // Dog's own method
    }
}
