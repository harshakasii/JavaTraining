package Oops;

public class Testing {
    public static void main(String[] args) {
        Aa ss = new Aa(25, "Vamsi");
        System.out.println(ss.name);
        System.out.println(ss.aa);

    }
}

class Aa {
    int aa;
    String name;

    Aa() {
        aa = 23;
        name = "harsha";
    }

    Aa(int aa, String name) {
        this.aa= aa;
        this.name = name;
    }
}
