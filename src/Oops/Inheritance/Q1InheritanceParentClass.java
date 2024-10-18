package Oops.Inheritance;

public class Q1InheritanceParentClass {
    int a;
    int b;
    int c;

    Q1InheritanceParentClass() {
        this.a = 4;
        this.b = 5;
        this.c = 6;
    }

    Q1InheritanceParentClass(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    Q1InheritanceParentClass(int a) {
        this.a = a;
        this.b = 9;
        this.c = 9;
    }

    Q1InheritanceParentClass(Q1InheritanceParentClass ab) {
        this.a = ab.a;
        this.b = ab.b;
        this.c = ab.c;
    }
}
