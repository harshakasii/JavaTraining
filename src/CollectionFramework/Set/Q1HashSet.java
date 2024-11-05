package CollectionFramework.Set;

import java.util.HashSet;
import java.util.Iterator;

public class Q1HashSet {
    public static void main(String[] args) {
        HashSet<String> hashset = new HashSet<>();
        hashset.add("Harsha");
        hashset.add("Vamsi");
        hashset.add("Shiva");
        hashset.add("Aman");
        System.out.println(hashset.add("Harsha"));
        System.out.println(hashset);
        hashset.remove("Vamsi");
        System.out.println(hashset.contains("Harsha"));
        System.out.println(hashset.size());
        System.out.println(hashset.isEmpty());
        System.out.println("==========================================================");
        for(String a: hashset) {
            System.out.println(a);
        }
        System.out.println("===========================================================");
        Iterator<String> iterator = hashset.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        hashset.clear();
        System.out.println(hashset);

    }
}
