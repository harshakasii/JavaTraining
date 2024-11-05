package streamApi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q1StreamApi {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(23,45,45,34,90);
        Stream<Integer> stream1 = l.stream();

        Set<Integer> a = l.stream().filter(i->i%2 != 0).map(i-> i*2).collect(Collectors.toSet());
        a.forEach(System.out::println);


        System.out.println("===============================================================");

        l.stream().filter(i->i%2 == 0).forEach(System.out::println);

        System.out.println("===============================================================");

        l.stream().sorted().forEach(System.out::println);

        System.out.println("================================================================");

        l.stream().sorted(Comparator.reverseOrder()).skip(2).forEach(System.out::println);

        System.out.println("================================================================");

        

        Stream<String> stream3 = Stream.of("Harsha", "Vamsi", "Sam");

        Stream<Integer> stream4 = Stream.iterate(0, n-> n+1);
        //stream4.forEach(System.out::println);

        Map<String, Integer> aa = new HashMap<>();
        aa.put("Harsha", 102);
        aa.put("Vamsi", 103);
        aa.put("Sam", 23);
        Stream<Map.Entry<String, Integer>> stream5 = aa.entrySet().stream().filter(i->i.getValue()==103);
        stream5.forEach(System.out::println);


    }
}
