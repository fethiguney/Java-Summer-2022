package day47_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C02_TekrarSayisiBulma {
    public static void main(String[] args) {

        //verilen bir String deki kullanilan harfleri
        //ve kullanilan harflerin tekrar sayisini
        //H = 20 seklinde yazdirin

        String str= "Heeeeellllooooo Woooorrrrllllllddddd";

        String [] harflerArr=str.replaceAll("\\W", "").split("");

        Map<String, Integer> harfKullanimSayilariMap=new HashMap<>();


        Integer harfKullanimAdedi;
        for (String each: harflerArr) {
            if (!harfKullanimSayilariMap.containsKey(each)) {
                harfKullanimSayilariMap.put(each, 1);
            } else {
                harfKullanimAdedi=harfKullanimSayilariMap.get(each);
                harfKullanimSayilariMap.put(each, ++harfKullanimAdedi);
            }
        }
        System.out.println(harfKullanimSayilariMap);








    }
}
