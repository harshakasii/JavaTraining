package regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {
    public static void main(String[] args) {
        String email = "harshakasi2003@gmail.com";
        Pattern pattern = Pattern.compile(".+@gmail[.]com");
        Matcher matcher = pattern.matcher(email);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
