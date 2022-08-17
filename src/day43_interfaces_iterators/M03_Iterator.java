package day43_interfaces_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03_Iterator {
    public static void main(String[] args) {

        List<Integer> liste=new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);

        //liste'deki tum elementleri INDEX kullanmadan 3 artirin

        for (int each: liste) {
            each+=3;
            System.out.print(each+" ");
        }
        System.out.println("");
        System.out.println(liste);
        /* Java index yapisi olmaya collection'lardaki
         elementlere ulasmak veya degistirmek icin
         Iterator interface'ini olusturmustur.

        Iterator interface oldugundan ondan obje uretmemiz mumkun degilr
        bunun yerine bize iterator döndüren  liste.iterator() method'unu kullaniyoruz
         */

        Iterator it1= liste.iterator();

        System.out.println(it1.next());
        System.out.println(it1.next());
        System.out.println(it1.next());


        // Iterator'da geri donus yok, adim adim sona ulastiktan sonra
        // basa gelmek isterseniz yeniden bir iterator olusturmaniz gerekir
        Iterator it2= liste.iterator();
        it2.next();
        it2.remove();
        it2.next();
        it2.remove();
        it2.next();
        it2.remove();
        System.out.println(liste); // iterator ile elementleri gezip, remove yapinca
        // liste kalici olarak degisti

        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println("yeni liste :"+liste);

        Iterator it3= liste.iterator();
        while (it3.hasNext()) {
            it3.next();
            it3.remove();
        }
        System.out.println("loop sonrasi :"+liste);

        /*
         Goruldugu gibi Iterator kullanarak yapabildigim
         1- tum collection elementlerini yazdirmak
         2- tum collection elementlerini silmek
         Bu da bize yetmez
         */

    }
}
