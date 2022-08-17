package day12_stringManipulation;

public class C03_SubString {
    public static void main(String[] args) {

        String isim="Suleyman";
        String soyisim="Karanfil";
        String kartNo= "1234 6589 7458 9658";

        System.out.println(isim.substring(3));//eyman
        System.out.println(soyisim.substring(soyisim.length()-3));//fil

        //isim ve soyismin ilk harfi buyuk harf, geriye kalan *
        //kredi kartinin ilk dort harfi gorunsun geriye kalan *

        String isimIlharf=isim.substring(0,1).toUpperCase();


    }
}
