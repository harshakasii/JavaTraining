
interface mother {
    abstract void sound();
}


interface father {
    abstract void sound();
}

public class aa implements mother, father{

    @Override
    public void sound() {
        System.out.println("I am father");
    }
}

class tt {
    public static void main(String[] args) {
        aa s = new aa();
        s.sound();
    }
}