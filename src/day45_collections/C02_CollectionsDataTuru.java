package day45_collections;

import java.util.ArrayList;
import java.util.List;

public class C02_CollectionsDataTuru {
    public static void main(String[] args) {

        List<Integer> liste=new ArrayList<>();
        liste.add(5);
        //liste.add(5);
        //liste.add('c');
        //liste.add(true);

        /*
          Collections <dataTuru> nu Object secmeniz durumunda
          Collection'a farkli data turlerinden objeler koymaniza izin verir
          Bu depolama acisindan bize esneklik saglar
          Ancak islem yaparken tum objeleri Object olarak tanimladigimizdan
          cok fazla casting yapmamiz gerekebilir
         */


        List list=new ArrayList<>();
        list.add(5);
        list.add('c');
        list.add(true);
        list.add("Ali");
        System.out.println(list);//[5, c, true, Ali]

        list.set(0, (Integer)list.get(0)+5);
        System.out.println(list);//[10, c, true, Ali]

        list.set(3, list.get(3)+" Can");

        list.set(2, !(Boolean)list.get(2));


    }
}
