package day44_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C03_ListIterator {
    /*
    iterator ile index kullanimina ornek) Bir listedeki ilk n elemani
    iterator kullanarak 5 artirin.
     Orn :  list : [2,13,56,23,45,14,40]
    artirilmasi istenen eleman sayisi : 3 output: [7,18,61,23,45,14,40]
     */

    public static void main(String[] args) {

        List<Integer> liste=new ArrayList<>();
        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);

        ListIterator<Integer> yeniListe=liste.listIterator();
        int n=5;
        int sayac=0;
        int indeks=3;
        while (yeniListe.hasNext()) {
            Integer sayi=yeniListe.next()+n;
            liste.set(sayac, sayi);
            sayac++;
            if (sayac==indeks) {
                break;
            }
        }
        System.out.println(liste);






    }

}


