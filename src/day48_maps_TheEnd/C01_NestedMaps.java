package day48_maps_TheEnd;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01_NestedMaps {
    public static void main(String[] args) {

    /*
     sinifMap.put(102, "Enes, Cem, Tester");
     sinifMap.put(103, "Taha, Emre, JDev");
     sinifMap.put(104, "Derya, Deniz, DevOps");
     */

        Map<String, String> ogr101=new HashMap<>();
        ogr101.put("isim", "Enes");
        ogr101.put("soyisim", "Cem");
        ogr101.put("brans", "Tester");

        Map<String, String> ogr102=new HashMap<>();
        ogr102.put("isim", "Taha");
        ogr102.put("soyisim", "Emre");
        ogr102.put("brans", "JDev");


        Map<String, String> ogr103=new HashMap<>();
        ogr103.put("isim", "Derya");
        ogr103.put("soyisim", "Deniz");
        ogr103.put("brans", "DevOps");

        Map<Integer, Map<String, String>> ogrenciNestedMap=new HashMap<>();
        ogrenciNestedMap.put(101, ogr101);
        ogrenciNestedMap.put(102, ogr102);
        ogrenciNestedMap.put(103, ogr103);

        Set<Map.Entry<Integer, Map<String, String>>> ogrenciEntrySeti = ogrenciNestedMap.entrySet();
        for (Map.Entry each: ogrenciEntrySeti) {
            System.out.println(each);
        }

        //102 nolu kisinin ismini yazdiralim
        System.out.println(ogrenciNestedMap.get(102).get("isim"));


    }
}
