package TypicalTopics.AnonymousObject;

public class AnonymousObject {

    public int add(int a, int b) {
        return a+b;
    }
}



class Main {
    public static void main(String[] args) {
        int result = new AnonymousObject().add(1,3);
        System.out.println(result);
    }
}