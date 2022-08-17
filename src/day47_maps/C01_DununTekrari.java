package day47_maps;

import day46_maps.ReusableMethdos;

import java.util.Map;

public class C01_DununTekrari {


    public static void main(String[] args) {


        Map<Integer, String> sinifListMap= ReusableMethdos.mapOlustur();


        //ogrenci listesini isim soy isim olarak siralayin
        ReusableMethdos.tumValueSiraliYazdir(sinifListMap);


        // kac farkli brans varsa bransIsmi=branstakiOgrenciSayisi seklinde yazdirin

        ReusableMethdos.bransOgrenciSayisiYazdir(sinifListMap);


    }



}
