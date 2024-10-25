package regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q3Quantifiers {
    public static void main(String[] args) {
        String search = "abaabaaab";
        Pattern pattern = Pattern.compile("a");
        Pattern pattern1 = Pattern.compile("a+");
        Pattern pattern2 = Pattern.compile("a*");
        Pattern pattern3 = Pattern.compile("a?");


        Matcher matcher = pattern.matcher(search);
        Matcher matcher1 = pattern1.matcher(search);
        Matcher matcher2 = pattern2.matcher(search);
        Matcher matcher3 = pattern3.matcher(search);


        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }

        System.out.println("======================================================");

        while (matcher1.find()) {
            System.out.println(matcher1.start() + " " + matcher1.group());
        }

        System.out.println("======================================================");
        while (matcher2.find()) {
            System.out.println(matcher2.start() + " " + matcher2.group());
        }
        System.out.println("======================================================");
        while (matcher3.find()) {
            System.out.println(matcher3.start() + " " + matcher3.group());
        }
    }
}
