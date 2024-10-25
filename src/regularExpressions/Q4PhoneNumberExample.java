package regularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q4PhoneNumberExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter phone number to check whether it is 10 digit or not");
        String num = sc.nextLine();
        Pattern pattern = Pattern.compile("^\\^[0-9]{9}\\$$");
        Matcher matcher = pattern.matcher(num);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
