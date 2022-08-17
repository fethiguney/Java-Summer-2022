package day24_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_ArraydanListOlusturma {
    public static void main(String[] args) {

        /*
        icinde 200 tane 1000'den kucuk pozitif tamsayi olan
        bir list olusturun
        kullanicidan bir sayi isteyip
        listede var olup olmadigini kullaniciya yazalim
         */

      Random rnd=new Random();
      int sayi=0;
      List <Integer> sayilar=new ArrayList<>();
      while (sayilar.size()<200) {
          sayi= rnd.nextInt(1000);
         if (!sayilar.contains(sayi)) {
             sayilar.add(sayi);
         }
      }
      Scanner scan=new Scanner(System.in);
      boolean dogruMu=false;
      int tahminSayisi=1;
      while (!dogruMu) {
          System.out.println("1000'den kucuk bir sayi tahmininde bulunun");
          int tahmin=scan.nextInt();
              if (sayilar.contains(tahmin)) {
                  System.out.println("Tebrikler "+tahminSayisi+". tahminde bildiniz");
                  dogruMu=true;
              } else {
                  System.out.println("Uzgunum "+tahminSayisi+". tahminde bilemediniz");
                  tahminSayisi++;
              }

      }




    }
}
