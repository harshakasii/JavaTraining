package CollectionFramework.Map;

import java.util.*;

public class Q1HashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(101,"Harsha");
        hashMap.put(102,"Aman");
        hashMap.put(103,"Vamsi");
        hashMap.put(104,"Nithin");
        hashMap.put(105,"Sam");
        System.out.println(hashMap);
        System.out.println("==========================================================");
        hashMap.remove(103);
        System.out.println(hashMap);
        System.out.println(hashMap.get(103));
        hashMap.get(104);
        System.out.println(hashMap.containsKey(101));
        System.out.println(hashMap.containsValue("Harsha"));
        System.out.println("===========================================================");
        System.out.println(hashMap.size());
        System.out.println(hashMap.isEmpty());
        System.out.println("============================================================");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("============================================================");
        Iterator<Map.Entry<Integer, String>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey());
        }
        System.out.println("=============================================================");
        Set<Integer> set = hashMap.keySet();
        for (int a: set) {
            System.out.println(a);
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Collection<String> values = hashMap.values();
        for (String val: values) {
            System.out.println(val);
        }
        System.out.println("==============================================================");
        Set<Map.Entry<Integer, String>> newSet = hashMap.entrySet();
        hashMap.clear();
        System.out.println(hashMap);
    }
}
