package exceptionHandeling;

/**
 * Default exception handler throws exception as there is no try catch block
 *
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
 * 	at exceptionHandeling.Q2DefaultExceptionHandler.main(Q2DefaultExceptionHandler.java:5)
 */
public class Q2DefaultExceptionHandler {
    public static void main(String[] args) {
        int a = 10/0;
        System.out.println(a);
    }
}
