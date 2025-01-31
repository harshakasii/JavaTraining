package modifiers;



abstract class Animal {
    // Abstract method (no implementation)
    abstract void sound();

    // Concrete method (with implementation)
    void sleep() {
        System.out.println("Sleeping...");
    }

    // Constructor
    Animal() {
        System.out.println("Animal created!");
    }
}

class Dog extends Animal {
    // Providing implementation for the abstract method
    int id;
    @Override
    void sound() {
        System.out.println("Woof!");
    }
}


public class Q4Testing {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sleep();
        dog.sound();
    }
}


