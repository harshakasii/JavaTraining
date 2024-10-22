package stringBuilder;

public class Q2StringBuilderFunctions {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("HaSsha");

        System.out.println(sb.length());


        System.out.println(sb.charAt(2));


        sb.setCharAt(2, 'r');
        System.out.println(sb);


        System.out.println(sb.substring(1,3));
        System.out.println(sb.substring(4));


        System.out.println(sb.append(" Kasi"));


        sb.insert(6, " Kasi");
        System.out.println(sb);


        System.out.println(sb.delete(11,16));


        System.out.println(sb.replace(7,11, "Vardhan"));


        System.out.println(sb.indexOf("a"));
        System.out.println(sb.lastIndexOf("a"));

        System.out.println(sb.reverse());
    }
}
