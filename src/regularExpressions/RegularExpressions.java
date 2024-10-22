package regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    public static void main(String[] args) {
        new RegularExpressions().f1();
    }

    private void f1() {
        String target = "Hello World, How are you?w";
        Pattern pattern = Pattern.compile("w");
        Matcher matcher = pattern.matcher(target);
        while (matcher.find()) {
            System.out.println("Match found at index " + matcher.start() + " end Index " + matcher.end());
        }
    }
}
