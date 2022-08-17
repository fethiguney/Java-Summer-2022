package day48_maps_TheEnd;

import day46_maps.ReusableMethdos;

import java.util.Map;

public class C02_MapMethodlari {
    public static void main(String[] args) {

        Map<Integer, String> sinifListMap=ReusableMethdos.mapOlustur();

        ReusableMethdos.entryYazdir(sinifListMap);

        sinifListMap.clear();

        sinifListMap=ReusableMethdos.mapOlustur();

        System.out.println(sinifListMap.getOrDefault(110, "Aradiginiz key yok"));


        sinifListMap.putIfAbsent(104, "Derya, Okyanuz, Developer");
        sinifListMap.putIfAbsent(108, "Aysun, Can, DevOps");
        ReusableMethdos.entryYazdir(sinifListMap);

        /*
  SinifListesiMap'e key olarak 106 yoksa , value "Mevlut, Han, Tester" ekleyin
  106 daha onceden varsa, "eski degeri degistirmek istediginizden emin misiniz ?"
  yazdirin
 */

        if (sinifListMap.putIfAbsent(104, "Derya, Okyanuz, Developer") == null) {
            System.out.println("Kayit basarili");
        } else {
            System.out.println("Eski degeri degistirmek istediginizden emin misiniz");
        }


    }
}
