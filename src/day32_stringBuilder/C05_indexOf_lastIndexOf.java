package day32_stringBuilder;

public class C05_indexOf_lastIndexOf {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Pay attention please");
        System.out.println(sb);

        System.out.println(sb.indexOf("Pay"));

        System.out.println(sb.indexOf("e"));
        System.out.println(sb.indexOf("e", 7+1));

    }
}
