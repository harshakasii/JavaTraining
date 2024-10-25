package regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q2PreDefinedCharacterClass {
    public static void main(String[] args) {
        String a = "HeWQ#* @FKI sS!";
        Pattern pattern = Pattern.compile("\\s"); // for space character
        // \\S -> for any character except space
        // \\d -> for any digit from 0 to 9
        // \\D -> for any character except digit 0 to 9
        // \\w -> for any alphanumeric word [a-zA-Z0-9]
        // \\W -> for any character except [a-zA-Z0-9] means [^a-zA-Z0-9]
        // .   -> for any character

        Matcher matcher = pattern.matcher(a);
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group());
        }
    }
}
