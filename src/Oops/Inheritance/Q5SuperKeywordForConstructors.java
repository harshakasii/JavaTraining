package Oops.Inheritance;

public class Q5SuperKeywordForConstructors {
    String name;
    Q5SuperKeywordForConstructors(String name) {
        System.out.println("Animal name = " + name);
    }
}


class InheritedClass extends Q5SuperKeywordForConstructors {
    String name;
    InheritedClass(String name) {
        super(name);
        System.out.println("Dog created");
    }
}



class Main {
    public static void main(String[] args) {
        InheritedClass ss1 = new InheritedClass("Harsha");
        System.out.println(ss1.name);
    }
}

