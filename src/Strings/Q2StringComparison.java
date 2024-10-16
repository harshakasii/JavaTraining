package Strings;

public class Q2StringComparison {
    public static void main(String[] args) {



        String a = "Harsha";
        String b = "Harsha";
        System.out.println(a==b);
        /*
        It will return true since a and b are stored in pool. both a and b
        references are pointing to same object.

        == operator for Objects acts as if both the reference pointing to same object
        then it will return true. otherwise false
         */




        String name1 = new String("Vamsi");
        String name2 = new String("Vamsi");
        System.out.println(name1==name2);
        /*
        Here we are explicitly creating two objects with "new" keyword
        now name1 and name2 are pointing to different object even if they have same values.
        And the objects are stored in heap
         */



        String x = new String("Sam");
        String y = "Sam";
        System.out.println(x==y);




        String i = "Harsha";
        String j = i;
        System.out.println(i==j);


    }
}
