package day44_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C02_ListIterator {

    //Bir listedeki elementleri
    // iterator kullanarak sondan basa dogru yazdirin

    public static void main(String[] args) {

        List<Integer> liste =new ArrayList<>();
        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);

        System.out.println(liste);

        ListIterator list1=liste.listIterator();

        while (list1.hasNext()) {
            list1.next();
        }

        while (list1.hasPrevious()) {
            System.out.print(list1.previous()+" ");
        }





    }
}
