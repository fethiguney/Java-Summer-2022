package day10_stringManipulations;

public class C05_length {
    public static void main(String[] args) {


        String str="Java ogren, isi kap";

        System.out.println(str.length()); //str'in karakter sayisi 19

        System.out.println(str.charAt(str.length()-1));
        //son karakter olan p yi yazdirir

        System.out.println(str.charAt(str.length()-3));
        //sondan ucuncu karakter k yi yazdirir

        String str2="";
        //str2 ye bir deger atanmıs mıdır EVET
        //bu değer nedir HİCLİK
        System.out.println(str2.length()); //0

       // String str3=null;
               //str3 e bir deger atanmış mıdır HAYIR
        //null bu deger atamamayi isaret eder
       // System.out.println(str3.length()); yazdirirsak
        //NullPointerException hatası verir


    }
}
