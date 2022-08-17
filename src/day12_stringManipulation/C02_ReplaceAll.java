package day12_stringManipulation;

public class C02_ReplaceAll {
    public static void main(String[] args) {

        String str="1Bu2gu3n Ja*va- cok g3uz/el";

        //str'ı Bugun Java cok guzel haline getirin

        str=str.replace(" ", "xxx");
        str=str.replaceAll("\\W", "");
        str=str.replaceAll("\\d", "" );
        str=str.replace("xxx", " ");
        System.out.println(str);

    }
}
