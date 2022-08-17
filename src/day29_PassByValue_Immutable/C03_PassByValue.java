package day29_PassByValue_Immutable;

import java.util.ArrayList;
import java.util.List;

public class C03_PassByValue {
    public static void main(String[] args) {

        /*
        Bir list olusturalim iki ayri method'dan birinde
        sadece elemanlari degistirelim digerinde yeni bir list
        atayip ayni sayida yeni eleman ekleyelim
        Ve her iki method call sonrasi kendi listemizi main method
        icerisinde kontrol edelim
         */

        List<String> list=new ArrayList<>();
        list.add("Ali");
        list.add("Veli");
        list.add("Can");

        System.out.println("İlk hali : "+list);//[Ali, Veli, Can]

        elemanlariDegistir(list);

        System.out.println("Birinci method sonrasi : "+list);//[Oguz, Murat, Fatih]

        listDegistir(list);

        System.out.println("İkinci method sonrasi : "+list);// [Oguz, Murat, Fatih]
    }

    public static void listDegistir(List<String> list) {
        list=new ArrayList<>();
        list.add("Nutella");
        list.add("Cay");
        list.add("Cokokrem");
        System.out.println("İkinci method icinde : "+list);//[Nutella, Cay, Cokokrem]
    }

    public static void elemanlariDegistir(List<String> list) {
        list.set(0, "Oguz");
        list.set(1, "Murat");
        list.set(2, "Fatih");
        System.out.println("Birinci method icinde : "+list);//[Oguz, Murat, Fatih]

    }
}
