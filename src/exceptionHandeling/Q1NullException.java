package exceptionHandeling;

public class Q1NullException {
    private static String name;

    public static void main(String[] args) {



        System.out.println(name.toLowerCase());
        // abnormal termination because null can't
        // be converted into lowercase.




    }
}
