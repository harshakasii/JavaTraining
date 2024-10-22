package Oops;

public class Q8StaticVariable {
    int age;
    String name;
    static long population;

    Q8StaticVariable(int age, String name) {
        this.age = age;
        this.name = name;
        Q8StaticVariable.population += 1;
    }
}




class Ram{
    public static void main(String[] args) {
        Q8StaticVariable ss = new Q8StaticVariable(23, "Harsha");
        Q8StaticVariable ss1 = new Q8StaticVariable(24, "Vamsi");
        System.out.println(ss.population);
        System.out.println(ss1.population);
    }
}