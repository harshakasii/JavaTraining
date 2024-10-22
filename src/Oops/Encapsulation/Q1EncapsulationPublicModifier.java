package Oops.Encapsulation;

public class Q1EncapsulationPublicModifier {
    public int a = 10;
    protected int b = 20;
    int c = 30;
    private int d = 40;

    public void getterName() {
        System.out.println(d);;
    }

    public void displayOutput() {
        System.out.println(a); //public variable a can be accessible in same class
        System.out.println(b); // protected variable a can be accessible from same class
        System.out.println(c);
        System.out.println(d);

        getterName();
    }
}

class PublicModifierForSamePackage{
    public void accessA() {
        Q1EncapsulationPublicModifier ss = new Q1EncapsulationPublicModifier();
        System.out.println(ss.a); // public variable a can be accessible from same package
        System.out.println(ss.b); // protected variable a can be accessible from same package different class
        System.out.println(ss.c);
        //System.out.println(ss.d);
        // d cannot be accessed from same package different class as it is private


        ss.getterName();
    }
}



class InheritedClass extends Q1EncapsulationPublicModifier{
    public void display() {
        System.out.println(a); // public variable can be accessed from sub clas
        System.out.println(b); // protected variable
        System.out.println(c);
        //System.out.println(d);
        // private variable can't be accessed from sub class of same package



        getterName();
    }
}
