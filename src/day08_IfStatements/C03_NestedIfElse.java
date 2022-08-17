package day08_IfStatements;

import java.util.Scanner;

public class C03_NestedIfElse {
    public static void main(String[] args) {

        /* emeklilik kontrolu yapan bir program yaziniz
cinsiyet olarak E (ERKEK) veya K (KADIN) degiskenlerini kabul etsin
farkli bir harf veya sembol girilirse hata mesajı versin

emeklilik icin kadinlarda yas siniri 60
erkeklerde 65 olsun
negatif yas veya 80'den buyuk yas girilirse hata mesaji versin
 */
        Scanner scan= new Scanner(System.in);
        System.out.println("Cinsiyetiniz icin harf giriniz \n Kadin icin K \n Erkek icin E");
        char cinsiyet=scan.next().toUpperCase().charAt(0);
        System.out.println("lutfen yasinizi giriniz");
        int yas= scan.nextInt();

        if (cinsiyet=='E') {
            if (yas<0 || yas>80) {
                System.out.println("gecerli yas giriniz");
            } else if (yas<65) {
                System.out.println("emekli olamazsin");
            } else {
                System.out.println("emekli olabilirsin");
            }

        } else if (cinsiyet=='K'){
            if (yas<0 || yas>80) {
                System.out.println("gecerli yas giriniz");
            } else if (yas<60) {
                System.out.println("emekli olamazsin");
            } else {
                System.out.println("emekli olabilirsin");
            }

        } else {
            System.out.println("gecerli bir tercih giriniz");
        }


    }
}
