package Oops.Polymorphisum;

public class Example {
    int a = 10;

    void ss(){
        System.out.println("Hello I am parent");
    }
}

class E1 extends Example{
    int b = 20;
    @Override
    void ss() {
        System.out.println("Hello i am child");
    }
}


class Main2{
    public static void main(String[] args) {
        Example aa = new E1();
        System.out.println(aa.a); // we can access the parent attribute
        aa.ss(); // it will print child method


        Example aa1 = new Example();
        System.out.println(aa1.a);
        aa1.ss();



        E1 ss2 = new E1();
        System.out.println(ss2.a);
        System.out.println(ss2.b);
        ss2.ss();
    }
}