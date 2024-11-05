package CollectionFramework.List.LinkedList;

import java.util.LinkedList;

public class Q1LinkedList {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("Harsha");
        l.add(30);
        l.add(null);
        l.add("Sharmista");
        l.add(0, "Software");
        l.add(0, "Venky");
        l.removeLast();
        l.addFirst(23);
        l.set(1, 45);
        System.out.println(l);
    }
}
