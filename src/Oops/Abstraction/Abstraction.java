package Oops.Abstraction;

public abstract class Abstraction {
    int a = 10;
    abstract public void display();
}


class Inherited extends Abstraction {
    public void display() {
        System.out.println("Hello I am inherited class");
    }
}


class Main{
    public static void main(String[] args) {
        Inherited ss = new Inherited();
        ss.display();


        Abstraction ss1 = new Abstraction() {
            @Override
            public void display() {
                System.out.println("Hello I am parent");
            }
        };

        ss1.display();
        System.out.println(ss1.a);
    }
}



