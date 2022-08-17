package day21_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C06_ArrayeElemanEklem {
    public static void main(String[] args) {
        //C05 deki method u kullanarak array e
        //eleman ekleyelim


        String [] takimListesi={"Suleyman", "Osman"};
        String eklenecekIsim="Talha";

        String yeniTakimListesi [] = C05_ArrayElementEkleme.arrayElementEkleme(takimListesi, eklenecekIsim);
        System.out.println(Arrays.toString(yeniTakimListesi));

    }
}
