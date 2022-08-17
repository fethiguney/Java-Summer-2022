package day25_constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_Constructor {
    public static void main(String[] args) {


        /*
        Bilmemiz gerekenler
        1-Bir obje olusturabilmek icin constructor'a ihtiyacimiz var

        2-Biz constructor'a ihtiyacimiz olan parametleri yazmazsak
        java bize standart constructor'ı uretir. Istedigimiz spesifik
        ozellikler var ise bunlari parametlerin icine yazmaliyiz

        3-Class icinde gorunurde bir constructor yok ise de
        java ihtiyac halinde kullanmamiz icin default constructor hazirlamistir
        ihtiyac halinde bu otomatik calisir

        4-Default constructor, parametresizdir
          goremezsek bile ihtiyac oldugunda calisir

        5-  Class icerisinde parametreli veya parametresiz
          herhangi bir constructor olusturursak
          java default constructor'i siler


         */

        C01         obj1        =   new         C01()    ;
        // class adi  objenin adi     keyword    constructor

        Scanner scan = new Scanner(System.in);
        Random rnd= new Random();
        List<String> list= new ArrayList<>();
        // List<String> list2=new List<>();

        /*
        Javada bir obje olusturabilmek icin
        mutlaka constructor kullanmalisiniz
         */

        System.out.println(obj1.sayi); // 0
        obj1.deneme(); // C01 den deneme method calisir
    }





}

