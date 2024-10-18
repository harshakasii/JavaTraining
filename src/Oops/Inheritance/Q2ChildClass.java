package Oops.Inheritance;

public class Q2ChildClass extends Q1InheritanceParentClass{
    int weight;

    Q2ChildClass() {
        this.weight = 5;
    }

    Q2ChildClass(int a, int b, int c, int weight) {
        super(a,b,c);
        this.weight = weight;
    }
}
