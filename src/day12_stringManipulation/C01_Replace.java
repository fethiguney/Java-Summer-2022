package day12_stringManipulation;

public class C01_Replace {
    public static void main(String[] args) {

        String str=" Bu gun ha va cok guz el";
        System.out.println(str.replace(" ", ""));

        System.out.println(str.replace("h", "J").replace(" ", ""));

        System.out.println(str.replace("guz el", "harika"));
        //Cumleyi replace kullanarak Bugün Java çok guzel yapalim

        str=str.replace("Bu gun", "Bugun")
                .replace("ha va","Java" )
                .replace("guz el", "guzel");

        System.out.println(str);
    }
}
