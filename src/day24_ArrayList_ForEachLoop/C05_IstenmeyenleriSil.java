package day24_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_IstenmeyenleriSil {
    public static void main(String[] args) {

        // Soru 4) Verilen bir array’de istenmeyen harf iceren kelimeleri silip,
        // kalan elementleri yeni bir array yapin

        String[] sehirler ={"Istanbul", "Ankara","Mersin","Konya","Kastamonu"};
        String istenmeyenHarf="r";

        List<String> kalanlar=new ArrayList<>();
        for (int i = 0; i < sehirler.length ; i++) {
            if(!sehirler[i].contains(istenmeyenHarf)){
                kalanlar.add(sehirler[i]);
            }
        }
        String [] kalanSehirler=new String[kalanlar.size()];
        for (int i = 0; i < kalanSehirler.length ; i++) {
            kalanSehirler[i]= kalanlar.get(i);
        }
        sehirler=kalanSehirler;
        System.out.println(Arrays.toString(sehirler));


    }
}
