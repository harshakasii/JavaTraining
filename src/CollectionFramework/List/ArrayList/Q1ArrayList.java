package CollectionFramework.List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q1ArrayList {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(45);
        System.out.println(l);
        l.add(24);
        l.add(24);
        l.add(36);
        l.add(2);
        l.add(10);
        System.out.println(l);
        l.add(1, 89);
        System.out.println(l);
        l.remove(Integer.valueOf(24));
        System.out.println(l);
        l.remove(1);
        System.out.println(l);
        int a = l.get(2);
        System.out.println(a);
        l.set(0, 7);
        System.out.println(l);
        System.out.println(l.contains(7));
        System.out.println(l.indexOf(24));
        System.out.println(l.size());
        System.out.println(l.isEmpty());

        //Iterating over elements
        for(int element: l)  {
            System.out.println(element);
        }

        //or
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Iterator<Integer> iterate = l.iterator();
        while(iterate.hasNext()) {
            System.out.println(iterate.next());
        }
        System.out.println("=========================================================");

        Integer[] arr = l.toArray(new Integer[0]);
        System.out.println(arr[0]);

        System.out.println("=========================================================");

        l.clear();
        System.out.println(l);
    }
}


//It's recommended to use generics (e.g., List<String> ss = new ArrayList<>();) to ensure type safety and clarity in your code.
