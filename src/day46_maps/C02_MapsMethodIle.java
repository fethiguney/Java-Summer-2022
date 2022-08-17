package day46_maps;

import java.util.List;
import java.util.Map;

public class C02_MapsMethodIle {
    public static void main(String[] args) {


        Map<Integer, String> ogrenciMap= ReusableMethdos.mapOlustur();

       //value'lari sira numarali yazdirin

        ReusableMethdos.tumValueSiraliYazdir(ogrenciMap);

        //isim ve soyisimlerin birlikte olacagi bir liste olusturun

        List<String> sinifIsimSoyisimList=ReusableMethdos.isimSoyisimListesiOlustur(ogrenciMap);

        System.out.println("isim ve soyisim listesi :"+ sinifIsimSoyisimList);

        // kac farkli brans varsa bransIsmi=branstakiOgrenciSayisi seklinde yazdirin




    }
}
