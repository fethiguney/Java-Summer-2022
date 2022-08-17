package day21_arrays;

import java.util.Arrays;

public class C05_ArrayElementEkleme {
    public static void main(String[] args) {

       //Verilen bir array’e yeni bir element ekleyen method olusturun

        String [] sinifListesi={"Ali Can", "Ahmet", "Mustafa"};

        String eklenecekIsim="Murat";

        String [] liste=arrayElementEkleme(sinifListesi, eklenecekIsim);
        System.out.println(Arrays.toString(liste));



    }

    public static String[] arrayElementEkleme(String[] sinifListesi, String eklenecekIsim) {
        String [] yeniListe =new String[sinifListesi.length+1];
        for (int i = 0; i < sinifListesi.length ; i++) {
            yeniListe [i]=sinifListesi [i];
        }
        yeniListe [yeniListe.length-1]=eklenecekIsim;

        return yeniListe;
    }


}
