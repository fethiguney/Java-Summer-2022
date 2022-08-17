package day39_exceptions;

import java.util.Scanner;

public class C06 {
    public static void main(String[] args) {

        /*
        Kullanicidan carpma yapmak icin bir String isteyin
        kullanicinin girdigi String sadece sayilardan olusuyorsa
        sayiyi 2 ile carpip sonucu yazdirin
        Kullanici sayilardan olusmayan bir String girerse
        "Girdiniz String sayiya cevrilemez" yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir string olarak sayi giriniz");
        String input=scan.next();

        try {
            int s=Integer.parseInt(input);
            System.out.println("Girilen sayinin iki ile carpimi :"+(s*2));
        } catch (NumberFormatException e) {
            System.out.println("Girdiniz String sayiya cevrilemez");
        }




    }
}
