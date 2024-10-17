public class Aa {
    int age;
    String name;
    static long population;

    Aa(int age, String name) {
        this.age = age;
        this.name = name;
        Aa.population += 1;
    }
}




class Ram{
    public static void main(String[] args) {
        Aa ss = new Aa(23, "Harsha");
        Aa ss1 = new Aa(24, "Vamsi");
        System.out.println(ss.population);
        System.out.println(ss1.population);
    }
}