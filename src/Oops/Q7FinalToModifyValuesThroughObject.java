package Oops;

public class Q7FinalToModifyValuesThroughObject {
    public static void main(String[] args) {
        Example1 bb = new Example1("Ram");
        final Example1 ss = new Example1("Harsha");
        ss.name = "Vamsi";//we can just change the values.
        System.out.println(ss.name);
        //ss = bb;
        /*
        We can't assign another object.
         */
    }
}


class Example1 {
    String name;

    Example1(String name) {
        this.name = name;
    }
}
