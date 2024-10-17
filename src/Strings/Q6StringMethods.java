package Strings;

public class Q6StringMethods {
    public static void main(String[] args) {
        String name = "Harsha Va";
        String ss = "Harsha vardhan";
        String fruits = "Harsha:12:Male";


        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.length());



        System.out.println(name.isEmpty()); // returns false if it has space




        System.out.println(name.equals(ss));
        System.out.println(name.equalsIgnoreCase(ss));
        System.out.println(name.startsWith("Har"));
        System.out.println(name.startsWith("s", 3));
        System.out.println(name.endsWith("an"));
        System.out.println(name.indexOf("s"));

        String[] arr = fruits.split(", ");
        for (String a: arr) {
            System.out.println(a);
        }

        System.out.println(name.substring(2));
        System.out.println(name.substring(3,9));


        System.out.println(name.contains(" Va"));
        System.out.println(name.replaceAll("a","b"));
        System.out.println(name.replace('a', 'd'));



        byte[] byteArray = name.getBytes();
        for (byte a: byteArray) {
            System.out.println(a); // returns ascii values of that character
        }


        System.out.println(name.isBlank()); //if the string is empty, or if it only contains whitespace characters,
        // and false if there are non-whitespace characters.

        
    }
}
