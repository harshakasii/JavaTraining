package modifiers;

public class Q3StaticKeyword {

    static int id;
    public static void printId() {
        System.out.println(id);
    }
    static {
        System.out.println("Static block");
    }

    public static void main(String[] args) {
        System.out.println("Main Block");
        printId();
    }
}
