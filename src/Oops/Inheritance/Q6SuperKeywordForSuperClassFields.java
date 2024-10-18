package Oops.Inheritance;

/**
 * 1. Inherited2 ss3 = new Inherited2();
 * Type: Inherited2
 * Object Created: An instance of Inherited2.
 * Access: This variable can access all members (fields and methods) of Inherited2, including those inherited from Q6SuperKeywordForSuperClassFields.
 * Usage: This is a standard way to create an object of the subclass and interact with its features.
 * 2. Q6SuperKeywordForSuperClassFields ss4 = new Inherited2();
 * Type: Q6SuperKeywordForSuperClassFields
 * Object Created: An instance of Inherited2, but referenced as Q6SuperKeywordForSuperClassFields.
 * Access: This variable can only access members defined in Q6SuperKeywordForSuperClassFields. It cannot directly access any members or methods specific to Inherited2 (like print()).
 * Polymorphism: This demonstrates polymorphism, where a subclass object is referenced by a superclass type. You can call overridden methods if they are present in the superclass.
 */

public class Q6SuperKeywordForSuperClassFields {
    String name = "Harsha";
}

class Inherited2 extends Q6SuperKeywordForSuperClassFields{
    String name = "Vamsi";

    void print() {
        System.out.println(name);
        System.out.println(super.name);
    }
}



class Object {
    public static void main(String[] args) {
        Inherited2 ss3 = new Inherited2();
        Q6SuperKeywordForSuperClassFields ss4 = new Inherited2();
        ss3.print();
        System.out.println(ss4.name);
    }
}
