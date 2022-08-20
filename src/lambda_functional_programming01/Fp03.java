package lambda_functional_programming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Fp03 {
    public static void main(String[] args) {

        List<String> l = new ArrayList<>();
        l.add("Ali");
        l.add("Ali");
        l.add("Mark");
        l.add("Amanda");
        l.add("Christopher");
        l.add("Jackson");
        l.add("Mariano");
        l.add("Alberto");
        l.add("Tucker");
        l.add("Benjamin");
        System.out.println(l);

        buyukHarfleYazdir(l);
        System.out.println();
        uzunlugaGoreYazdir(l);
        System.out.println();
        uzunlugaGoreTersYazdir(l);
        System.out.println();
        sonKaraktereGoreTekrarsizYazdir(l);
        System.out.println();
        uzunlukVeIlkHarfeGoreSiralaYazdir(l);
        System.out.println();
        //uzunlugu8ile10ArasiveOIleBitenleriSil(l);
        System.out.println("Uzunlugu 12'den az mi : "+uzunlugu12denAzMi(l));
        System.out.println("Hepsi X ile baslamiyor mu : "+xIleBaslamiyorMu(l));
        System.out.println("R ile biten var mi : "+rIleBitenVarMi(l));






    }

    //1) Tüm elemanları büyük harf ile
    // yazdıran bir method oluşturun.
    //1.yol
    public static void buyukHarfleYazdir(List<String> list) {
        list.stream().
        map(String :: toUpperCase).
        forEach(Utils ::ayniSatirdaBosluklaYazdir);
    }

    //2.yol

   /* public static void buyukHarfleYazdir2(List<String> list) {
        list.replaceAll(String ::toUpperCase);
        System.out.println(list);
    }*/

    //2) Elemanları uzunluklarına göre sıralayıp
    // yazdıran bir method oluşturun.

    public static void uzunlugaGoreYazdir(List<String> list) {
        list.stream().
        sorted(Comparator.comparing(String :: length)).
        forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //3) Elemanları uzunluklarına göre ters sıralayıp
    // yazdıran bir method oluşturun.

    public static void uzunlugaGoreTersYazdir(List<String> list) {
        list.stream().
        sorted(Comparator.comparing(String :: length).reversed()).
        forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //4) Elemanları son karakterlerine göre sıralayıp
    // tekrarsız yazdıran bir method oluşturun.
    public static void sonKaraktereGoreTekrarsizYazdir(List<String> list) {
      list.stream().
      distinct().
      sorted(Comparator.comparing(Utils::sonKarakteriAl)).
      forEach(Utils ::ayniSatirdaBosluklaYazdir);
    }

    //5) Elemanları önce uzunluklarına göre ve
    // sonra ilk karakterine göre sıralayıp yazdıran
    // bir method oluşturun

    public static void uzunlukVeIlkHarfeGoreSiralaYazdir(List<String> list) {
        list.
        stream().
        sorted(Comparator.comparing(String::length).
        thenComparing(Utils::ilkKarakteriAl)).
        forEach(Utils::ayniSatirdaBosluklaYazdir);

    }
    //6) Uzunluğu 5'ten büyük olan elemanları
    // silen bir method oluşturun.

    /*public static void bestenBuyukleriSil(List<String> list) {
        list.removeIf(t-> t.length()>5);
        System.out.println(list);
    }*/

    //7) ‘A’, ‘a’ ile başlayan yada
    // ‘N’, ‘n’ ile biten elemanları
    // silen bir method oluşturun.


   //1.yol
    /*public static void baslangiciAyaradSonuNOlaniSil(List<String> list) {
        list.
        removeIf(t-> t.charAt(0)=='A' ||
        t.charAt(0)=='a' ||
        t.charAt(t.length()-1)=='N' ||
        t.charAt(t.length()-1)=='n' );

        System.out.println(list);
    }*/

    //2.yol
    /*public static void baslangiciAyaradSonuNOlaniSil2 (List<String > list) {
        list.removeIf(t-> t.startsWith("A") ||
                    t.startsWith("a") ||
                    t.endsWith("N") ||
                    t.endsWith("n"));
        System.out.println(list);
    }*/

    //8) Uzunluğu 8 ile 10 arası olan yada
    // 'o' ile biten elemanları
    // silen bir method oluşturun.
    public static void uzunlugu8ile10ArasiveOIleBitenleriSil(List<String> list) {
        list.removeIf(t-> (t.length()>7 && t.length()<11) || t.endsWith("o"));
        System.out.println(list);
    }
//9) Tüm elemanların uzunluklarının 12'den az olup
// olmadığını kontrol eden bir method oluşturun.

    public static boolean uzunlugu12denAzMi(List<String> list) {
        return list.stream().allMatch(t-> t.length()<12);
    }
//10) Hiçbir elemanın 'X' ile başlamadığını
// kontrol eden bir method oluşturun.

    public static boolean xIleBaslamiyorMu(List<String> list) {
        return list.stream().noneMatch(t-> t.startsWith("X"));
    }

    //11) Herhangi bir elemanın 'r' ile bitip bitmediğini
    // kontrol eden bir method oluşturun.

    public static boolean rIleBitenVarMi(List<String> list) {
        return list.stream().anyMatch(t-> t.endsWith("r"));
    }

}
