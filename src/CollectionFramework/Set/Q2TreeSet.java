package CollectionFramework.Set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Q2TreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>(new MyCompare());
        treeSet.add(23);
        treeSet.add(45);
        treeSet.add(45);
        treeSet.add(56);
        treeSet.add(37);
        System.out.println(treeSet);
        System.out.println("===================================================");
        treeSet.remove(45);
        System.out.println(treeSet);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(treeSet.contains(23));
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.higher(23));
        System.out.println(treeSet.higher(56));
        System.out.println(treeSet.lower(56));
        System.out.println(treeSet.floor(56));
        System.out.println(treeSet.ceiling(23));
        System.out.println("=======================================================");
        System.out.println(treeSet.size());
        System.out.println(treeSet.isEmpty());
        System.out.println("======================================================");
        for (int a: treeSet) {
            System.out.println(a);
        }
        System.out.println("========================================================");
        Iterator<Integer> iterator = treeSet.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Integer[] arr = treeSet.toArray(new Integer[0]);
        System.out.println(arr[2]);
        System.out.println("==============================================================");
        treeSet.clear();
        System.out.println(treeSet);
    }
}



class MyCompare implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
    }
}