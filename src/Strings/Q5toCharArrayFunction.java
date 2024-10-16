package Strings;


import java.util.Arrays;

/**
 * How System.out.println() Handles Arrays:
 * For object arrays (like int[], double[], or Object[]), when you print them directly,
 * Java prints the object's internal memory address (like [I@1b6d3586 for an int[]).
 *
 * For char[] arrays, System.out.println() does something special. Instead of printing the memory address,
 * it interprets the array as a sequence of characters and prints them as a string. That's why it prints "Harsha" directly.
 */

public class Q5toCharArrayFunction {
    public static void main(String[] args) {
        String name = "Harsha";
        //System.out.println(name.toCharArray());
        System.out.println(Arrays.toString(name.toCharArray()));
    }
}
