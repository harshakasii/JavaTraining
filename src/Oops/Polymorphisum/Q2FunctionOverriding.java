package Oops.Polymorphisum;

public class Q2FunctionOverriding {
    int a = 10;
    void fun() {
        System.out.println("Hi i am parent");
    }
}

class Q2 extends Q2FunctionOverriding{
    int b = 20;
    @Override
    void fun() {
        System.out.println("I am Older child");
    }
}

class Main1 {
    public static void main(String[] args) {
        Q2 ss = new Q2();
        ss.fun();
        System.out.println(ss.b);
    }
}