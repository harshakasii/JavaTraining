class Animal {
    int id;
    void sound() {
        System.out.println("Animal makes a sound");
    }
    void parent(){
        System.out.println("ss");
    }
}

class Dog extends Animal {
    int ram;
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
    void fetch() {
        System.out.println("Dog fetches the ball");
    }
}


class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
    void child() {
        System.out.println("Cat climbs the tree");
    }
}

public class Ex3 {
    public static void main(String[] args) {
        Animal aa = new Dog();
        aa.sound();
    }
}
