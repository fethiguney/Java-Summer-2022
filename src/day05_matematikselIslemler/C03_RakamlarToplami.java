package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplami {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen dort basamakli pozitif bir tam sayi giriniz");
        int sayi= scan.nextInt(); //5267

        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int ilkGirilenSayi=sayi;

        birlerBasamagi=sayi%10; //7
        rakamlarToplami +=birlerBasamagi; //7
        sayi/=10; //sayi -->526

        birlerBasamagi=sayi%10;//6
        rakamlarToplami +=birlerBasamagi; //13
        sayi/=10; //sayi -->52

        birlerBasamagi=sayi%10; //2
        rakamlarToplami +=birlerBasamagi; //15
        sayi/=10; // sayi-->5

        birlerBasamagi=sayi%10; //5
        rakamlarToplami +=birlerBasamagi; //20
        sayi/=10; //0

        System.out.println(ilkGirilenSayi+" sayinin rakamlar toplami = " +rakamlarToplami);



    }
}
