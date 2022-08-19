package lambda_functional_programming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp01 {
    public static void main(String[] args) {

        /*
1) Lambda (Functional Programming) Java 8 ile kullanılmaya başlanmıştır.
2) Functional Programming'de "Ne yapılacak" (What to do) üzerine yoğunlaşılır.
   Structured Programming "Nasıl yapılacak" (How to do) üzerine yoğınlaşılır.
3) Functional Programming, Arrays ve Collections ile kullanılır.
4) "entrySet() methodu ile Map, Set'e dönüştürülerek Functional Programming'de kullanılabilir.

 */



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

        listElemanlariniYazdirStructured(liste);
        System.out.println();
        listElemanlariniYazdirFunctional(liste);
        System.out.println();
        ciftElemanlariYazdirStructured(liste);
        System.out.println();
        ciftElemanlariYazdirFunctional(liste);
        System.out.println();
        tekElemanlarinKareleriniYazdir(liste);
        System.out.println();
        tekrarsizTekElemanlarinKupleriniYazdir(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKareToplami(liste);
        tekrarsizCiftElemanlarinKupleriCarpimi(liste);
        getMaxElement1(liste);
        getMaxElement2(liste);
        getOverSevenMin(liste);
        getOverSevenMin2(liste);
        getOverSevenMin3(liste);
        getReverseOrderUniqueHalfOfElements(liste);

    }

    //1) Ardışık list elementlerini aynı satırda
    // aralarında boşluk bırakarak yazdıran
    // bir method oluşturun.(Structured)
    public static void listElemanlariniYazdirStructured(List<Integer> list) {
        for (int w:list) {
            System.out.print(w+" ");
        }
    }

    public static void listElemanlariniYazdirFunctional(List<Integer> list) {
        list.stream().forEach(t-> System.out.print(t+" "));
    }
    //2) çift list elementlerini aynı satırda aralarında
    // boşluk bırakarak yazdıran bir method oluşturun.(Structured)

    public static void  ciftElemanlariYazdirStructured(List<Integer> list){
        for (int w:list) {
            if (w%2==0) {
                System.out.print(w+" ");
            }
        }
    }

    public static void  ciftElemanlariYazdirFunctional(List<Integer> list) {
        list.stream().filter(t-> t%2==0).forEach(t-> System.out.print(t+" "));
    }

//3) Ardışık tek list elemanlarini karelerini aynı satırda aralarında
// boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void tekElemanlarinKareleriniYazdir(List<Integer> list) {
        list.stream().filter(t-> t%2!=0).map(t-> t*t).forEach(t-> System.out.print(t+" "));
    }
//4) Ardışık tek list elementlerinin küplerini tekrarsız
// olarak aynı satırda
// aralarında boşluk bırakarak yazdıran bir method oluşturun.
    public static void tekrarsizTekElemanlarinKupleriniYazdir(List<Integer> list) {
        list.stream().distinct().filter(t-> t%2!=0).map(t-> t*t*t).forEach(t-> System.out.print(t+" "));
    }

    //5) Tekrarsız çift elementlerin
    // karelerinin toplamını hesaplayan bir method oluşturun.
    public static void tekrarsizCiftElemanlarinKareToplami(List<Integer> list) {
        int toplam=list.stream().distinct().filter(t-> t%2==0).map(t-> t*t).reduce(0,(t,u)-> t+u);
        System.out.println(toplam);
    }
    // Tekrarsız çift elemanların küpünün çarpımını
    // hesaplayan bir method oluşturun.

    public static void tekrarsizCiftElemanlarinKupleriCarpimi(List<Integer> list) {
        Integer carpim=list.stream().distinct().filter(t-> t%2==0).map(t-> t*t*t).reduce(1,(t, u)-> t*u);
        System.out.println(carpim);
    }

    //List elemanları
    // arasından en büyük değeri bulan bir method oluşturun.
    //1.yol
    public static void getMaxElement1(List<Integer> list) {
       int max= list.stream().distinct().reduce(Integer.MIN_VALUE,(t,u) -> t>u ? t : u);
       System.out.println(max);

    }

    //2.yol
    public static void getMaxElement2(List<Integer> list) {
        int max=list.stream().distinct().sorted().reduce(Integer.MIN_VALUE,(t,u)->u);
        System.out.println("Maksimum deger : "+max);

    }

    //8)List elemanları arasından
    // en küçük değeri bulan bir method oluşturun.(2 Yol ile)

    //9) List elemanları arasından 7'den büyük, çift,
    // en küçük değeri bulan bir method oluşturun.
    //1.yol
    public static void getOverSevenMin(List<Integer> list){
       int min= list.stream().distinct().filter(t-> t%2==0).filter(t-> t>7).
        reduce(Integer.MAX_VALUE, (t,u)-> t<u ? t : u);
        System.out.println(min);
    }

    //2.yol
    public static void getOverSevenMin2 (List<Integer> list) {
       int min=list.stream().distinct().filter(t-> t%2==0).filter(t-> t>7).sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE, (t,u)-> u);
        System.out.println("Minimum deger : "+min);
    }

    //3.yol

    public static void getOverSevenMin3(List<Integer> list) {
        int min=list.stream().
                filter(t-> t%2==0).
                filter(t-> t>7).
                sorted().
                findFirst().
                get();
        System.out.println(min);

    }

    //10) Ters sıralama ile tekrarsız ve 5'ten büyük
    // elemanların yarı değerlerini
    // (elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.

    public static void getReverseOrderUniqueHalfOfElements(List<Integer> list) {
        List<Double> sonuc=list.stream().
        distinct().
        filter(t-> t>5).
        map(t-> t/2.0).
        sorted(Comparator.reverseOrder()).
        collect(Collectors.toList());
        System.out.println(sonuc);
    }
}
