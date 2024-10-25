package regularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q1CharacterClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        String input = sc.nextLine();
        Pattern pattern = Pattern.compile("[^!a-zA-Z]");
        // [a-z] a to z
        // [a-zA-Z]
        // [0-9]
        // [0-9a-zA-Z]
        // [^a-z] searches for other characters except a - z
        // ^ is used to exclude those characters
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            System.out.println("You entered wrong input");
        }
    }
}
