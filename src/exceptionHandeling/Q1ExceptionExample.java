package exceptionHandeling;

/**
 * It will throw this exception
 *
 * To handle this i will use try catch
 *
 * Exception in thread "main" java.lang.NumberFormatException: For input string: "four"
 * 	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
 * 	at java.base/java.lang.Integer.parseInt(Integer.java:665)
 * 	at java.base/java.lang.Integer.parseInt(Integer.java:781)
 * 	at exceptionHandeling.Q1ExceptionExample.main(Q1ExceptionExample.java:7)
 */
public class Q1ExceptionExample {
    public static void main(String[] args) { //  arguments -> 2 4 four 34 4
        int sum = 0;
        /*for (String arg : args) {
            sum += Integer.parseInt(arg); // this line will cause error because we give string four
            }
        */

        // To correct this code
        for (String arg:args) {
            try {
                sum += Integer.parseInt(arg);
            }
            catch (Throwable a) {
                System.out.println("For is a String which can't be converted into int");
            }
        }

        System.out.println(sum);
    }
}



