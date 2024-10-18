package Oops.Inheritance;


class Shapes {
    void area() {
        System.out.println("I am in shapes");
    }
}

class Circle extends Shapes {
    void area() {
        System.out.println("I am in Circles");
    }
}

class Square extends Shapes{
    void area() {
        System.out.println("I am in square");
    }
}
class Triangle extends Shapes{
    void area() {
        System.out.println("I am in Triangle");
    }
}



public class Q9HierarchicalInheritance {
    public static void main(String[] args) {
        Shapes ss = new Shapes();
        Circle ss1 = new Circle();
        Triangle ss2 = new Triangle();
        Square ss3 = new Square();


        ss.area();
        ss1.area();
        ss2.area();
        ss3.area();
    }
}
