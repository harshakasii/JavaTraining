package Oops.Polymorphisum;

public class Q2FunctionOverriding {
    void fun() {
        System.out.println("Hi i am parent");
    }
}

class Q2 extends Q2FunctionOverriding{
    @Override
    void fun() {
        System.out.println("I am Older child");
    }
}

class Main1 {
    public static void main(String[] args) {
        Q2 ss = new Q2();
        ss.fun();
    }
}