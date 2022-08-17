package day08_IfStatements;

import java.util.Scanner;

public class C06_ArtikYilSorusu {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir yil giriniz");
        int yil=scan.nextInt();

        if (yil%100==0) {
            if (yil%400==0) {
                System.out.println("400'e bolunen artik yil");
            } else {
                System.out.println("artik yil degil");
            }

        } else if (yil %100!=0) {
            if (yil%4==0) {
                System.out.println("4'e bolunen artik yil");
            } else {
                System.out.println("Artik yil degil");
            }

        } else {
            System.out.println("gecerli bir yil giriniz");
        }

        if (yil%4!=0) {
            System.out.println("Artik yil degil");
        } else if (yil%100!=0) {
            System.out.println("Artik yil");
        } else if (yil%400!=0) {
            System.out.println("Artik yil degil");
        } else {
            System.out.println("artik yil");
        }



    }
}
