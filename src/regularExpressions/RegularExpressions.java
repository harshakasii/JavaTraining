package regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    public static void main(String[] args) {
        int count = 0;
        String sentence = "Hello my name is harsha";
        Pattern pattern = Pattern.compile("harsha");
        Matcher matcher = pattern.matcher(sentence);
        while (matcher.find()) {
            count++;
            System.out.println("harsha is present at index "+ matcher.start());
            System.out.println(matcher.end());
            System.out.println(matcher.group());
        }
        System.out.println("No of occurrences of the regex is " + count);

     }
}
