package lambda_functional_programming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp02 {
    /*
1)  t-> "Logic" , (t, u)-> "Logic"
    Bu yapıya "Lambda Expession"
2) Functional Programming kapsamında "Lambda Expession" kullanılabilir ama önerilmez.
   "Lambda Expession" yerine "Method Reference" tercih edilir.
3) "Method Reference" kullanımı "Class Name :: Method Name"

   Aynı zamanda kendi class'larınızı da kullanabilirsiniz.
   Örneğin  bir Animal class'ınız var ve bu class "eat()" methoduna sahip ==> "Animal :: eat"
*/

    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);

        listElemanlariniYazdirFunctional(liste);
        System.out.println();
        ciftElemanlariYazdir(liste);
        System.out.println();
        tekElemanlarinKareleriniYazdir(liste);
        System.out.println();
        tekrarsizTekElemanlarinKupleriniYazdir(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKareToplami(liste);
        tekrarsizCiftElemanlarinKareToplami2(liste);
        tekrarsizCiftElemanlarinKareToplami3(liste);
        tekrarsizCiftElemanlarinKuplerininCarpimi(liste);
        getMaxElement(liste);
        yedidenBuyukCiftMin(liste);
        tersSiralamaylaTekrarsizElemanlarinYariDegeri(liste);






    }

    //1) Ardışık list elemanlarını aynı satırda aralarında
// boşluk bırakarak yazdıran bir method oluşturun.(
// Functional ve method reference)

    public static void listElemanlariniYazdirFunctional(List<Integer> list) {

       list.stream().
       forEach(Utils ::ayniSatirdaBosluklaYazdir);

    }
    //2)Ardışık çift list elementlerini
    // aynı satırda aralarında
    // boşluk bırakarak yazdıran bir method oluşturun.
    // (Functional)
    public static void ciftElemanlariYazdir(List<Integer> list) {
        list.stream().
        filter(Utils :: ciftElemanlariSec).
        forEach(Utils ::ayniSatirdaBosluklaYazdir);
    }

    ////3) Ardışık tek list elemanlarının karelerini
    // aynı satırda aralarında boşluk bırakarak
    // yazdıran bir method oluşturun.(Functional)

    public static void tekElemanlarinKareleriniYazdir (List<Integer> list) {
        list.stream().
        filter(Utils ::tekElemanlariSec).
        map(Utils ::karesiniAl).
        forEach(Utils ::ayniSatirdaBosluklaYazdir);
    }

    //4) Ardışık tek list elemanlarının küplerini
    // tekrarsız olarak aynı satırda aralarında
    // boşluk bırakarak yazdıran bir method oluşturun.

    public static void tekrarsizTekElemanlarinKupleriniYazdir (List<Integer> list) {
        list.stream().
        distinct().
        filter(Utils ::tekElemanlariSec).
        map(Utils ::kupunuAl).
        forEach(Utils ::ayniSatirdaBosluklaYazdir);

    }

    //5) Tekrarsız çift elemanların karelerinin
    // toplamını hesaplayan bir method oluşturun.

    //1.yol
    public static void tekrarsizCiftElemanlarinKareToplami(List<Integer> list) {
       int toplam= list.stream().
        distinct().
        filter(Utils ::ciftElemanlariSec).
        map(Utils ::karesiniAl).
        reduce(0,Math::addExact);
        System.out.println(toplam);
    }

    //2.yol
    public static void tekrarsizCiftElemanlarinKareToplami2(List<Integer> list) {
        int toplam= list.stream().
                distinct().
                filter(Utils ::ciftElemanlariSec).
                map(Utils ::karesiniAl).
                reduce(Math::addExact).
                get();
        System.out.println(toplam);
    }

    //3.yol
    public static void tekrarsizCiftElemanlarinKareToplami3(List<Integer> list) {
        int toplam= list.stream().
                    distinct().
                    filter(Utils ::ciftElemanlariSec).
                    map(Utils ::karesiniAl).
                    reduce(0,Integer ::sum);
        System.out.println(toplam);
    }

    //6) Tekrarsız çift elemanların
    // küpünün çarpımını hesaplayan bir method oluşturun.

    public static void tekrarsizCiftElemanlarinKuplerininCarpimi(List<Integer> list) {
       Integer carpim= list.stream().
                       distinct().
                       filter(Utils::ciftElemanlariSec).
                       map(Utils::kupunuAl).
                       reduce(1,Math ::multiplyExact);
        System.out.println(carpim);
    }

    //7) List elemanları arasından en büyük değeri
    // bulan bir method oluşturun.

    public static void getMaxElement(List<Integer> list) {
       Integer max= list.stream().distinct().reduce(Math::max).get();
       System.out.println(max);

    }
//Ödev
    //8)List elemanları arasından en küçük değeri
    // bulan bir method oluşturun.(Method Reference)

//9) List elemanları arasından 7'den büyük,
// çift, en küçük değeri bulan bir method oluşturun.

    public static void yedidenBuyukCiftMin(List<Integer> list) {
        int min=list.stream().
                distinct().
                filter(t-> t>7).
                filter(Utils::ciftElemanlariSec).
                reduce(Math::min).
                get();
        System.out.println(min);
    }
//10) Ters sıralama ile tekrarsız ve
// 5'ten büyük elemanların yarı değerlerini
// (elamanın ikiye bölüm sonucunu)
// bulan bir method oluşturun.

    public static void tersSiralamaylaTekrarsizElemanlarinYariDegeri(List<Integer> list) {
       List<Double> yeniList= list.stream().
                               distinct().
                               filter(t-> t>5).
                               map(Utils ::yarisiniAl).
                               sorted(Comparator.reverseOrder()).
                               collect(Collectors.toList());
        System.out.println(yeniList);

    }

}
