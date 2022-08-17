package day24_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C08_OrtakElemanlariBulma {
    public static void main(String[] args) {

        /*

        iki String array olusturunuz ve
        bu array’lerdeki ortak elemanlari For
        each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
        Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz
         */

        String [] arr1={"Veli", "Ali", "Hakan", "Ayse", "Can"};
        String [] arr2={"Ali", "Hasan", "Ayse", "Zehra", "Alperen", "Hakan"};

        List<String> ortakIsimler=new ArrayList<>();

        for (int i = 0; i < arr1.length ; i++) {
            for (int j = 0; j < arr2.length ; j++) {
                if (arr1 [i].equalsIgnoreCase(arr2[j])) {
                    ortakIsimler.add(arr2[j]);
                }
            }
        }

        if(ortakIsimler.isEmpty()) {
            System.out.println("Ortak eleman yok");
        } else {
            System.out.println("Ortak elemanlar : "+ortakIsimler);
        }








    }
}
