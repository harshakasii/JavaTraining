package Oops.Polymorphisum;

public class Q1FunctionOverloading {
    public void sum(int a, int b) {
        System.out.println(a+b);
    }

    public int sum(String a, int b) {
        System.out.println(a);
        return b;
    }
}


class Main {
    public static void main(String[] args) {
        Q1FunctionOverloading aa = new Q1FunctionOverloading();
        aa.sum(2,3);
        aa.sum("harsha",34);
    }
}