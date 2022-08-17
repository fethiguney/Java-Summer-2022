package day14_MethodCreation;

import day13_MethodCreation.C04_MethodCreation;

import java.util.Scanner;

public class C05_MethodCreationReturn {
    public static void main(String[] args) {
        //Kullanicidan sehir ismini ve dogum tarihini alip
        //bunlari programda kullanacagımız formatta
        //bize donduren bir method olusturun
        //Sehir ismini programimizda buyuk harf olarak
        //tarihi ise 2022-06-30 seklinde kullanmak istiyoruz

        String sehir=sehirAl();
        String tarih=tarihAl();



    }

    public static String tarihAl() {
        String tarih="";
        Scanner scan= new Scanner(System.in);
        System.out.println("yil giriniz");
        int yil=scan.nextInt();
        if (yil>1900 || yil<2100) {
            tarih=yil+"-";
        } else {
            System.out.println("yil icin gecerli bir sayi yazin(1900-2100");
        }
        System.out.println("kacinci ay oldugunu tamsayi olarak yazin");
        int ay=scan.nextInt();
        if (ay<0 || ay>12) {
            System.out.println("ay no 1-12 arasi olmali");
        } else if (ay<10) {
            tarih=tarih+"0"+ay+"-";
        } else {
            tarih=tarih+ay+"-";
        }
        System.out.println("ayin kacinci gunu oldugunu tam sayi olarak girin");
        int gun=scan.nextInt();
        if (gun<0 || gun>31) {
            System.out.println("gun no olarak 1-31 arasi girilmelidir");
        } else if (gun<10) {
            tarih=tarih+"0"+gun;
        }else {
            tarih=tarih+"0"+gun;
        }

        return tarih;

    }

    public static String sehirAl() {
        Scanner scan = new Scanner(System.in);
        System.out.println("sehir ismi girin");
        String sehirAdi=scan.next().toUpperCase();

        return sehirAdi;

    }
}
