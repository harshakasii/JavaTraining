package Strings;

public class Q1StringPool {
    public static void main(String[] args) {

        // All objects are stored in String pool which is in heap memory.
        // String pool has unique values. If we create same object the both reference point to same object
        String name = "Harsha";
        String name1 = "Harsha";
        System.out.println(name);
        System.out.println(name1);
        /*
        here both name and name1 points to same object as it has same value
         */
        String  name2 = "Vamsi";
        name2 = "Sam";
        System.out.println(name2);

        /*
        When we assign new object to reference the old object has no reference pointing to it
        and it is available for garbage collection.
         */
    }
}
