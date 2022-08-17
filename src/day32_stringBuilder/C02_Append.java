package day32_stringBuilder;

public class C02_Append {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Java daha ne yapsin");
            sb.append("?");

        System.out.println(sb);

        // append istedigimiz String'i en sona ekler

        // araya ekleme yapmak istedigimizde append degil insert kullanmaliyiz

        sb.insert(4, " her seyi dusunmus,");
        System.out.println(sb);

        sb.insert(22,"valla valla", 5, 11);
        System.out.println(sb);



    }
}
