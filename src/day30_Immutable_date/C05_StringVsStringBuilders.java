package day30_Immutable_date;

import java.time.LocalTime;

public class C05_StringVsStringBuilders {
    public static void main(String[] args) {

        /*
        String mi yoksa String Builders daha hizlidir
        bunun icin bir String olusturup, 1000 kere sonuna nokta ekleyelim
        oncesinde ve sonrasinda zamani alip aradaki farki bulalim
        Ayni islemi String Builder ile de yapalim
         */

        LocalTime baslangic=LocalTime.now();
        String str="Ahhh Java";
        for (int i = 0; i <10000 ; i++) {
            str+=".";
        }
        LocalTime bitis=LocalTime.now();
        System.out.println(baslangic);
        System.out.println(bitis);

        System.out.println("Arada gecen zaman :"+(bitis.getNano()-baslangic.getNano()));


        baslangic=LocalTime.now();
        StringBuilder sb=new StringBuilder("Ahhh Java");
        for (int i = 0; i <10000 ; i++) {
            sb.append(".");
        }
        bitis=LocalTime.now();
        System.out.println("Arada gecen zaman :"+(bitis.getNano()-baslangic.getNano()));


    }
}
