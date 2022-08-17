package day18_while_doWhileLoop;

import java.util.Scanner;

public class C07_DoWhileLoop {
    public static void main(String[] args) {


        /*
        Kullanicidan bir sifre girmesini isteyin.
        Girilen sifreyi asagidaki sartlara gore kontrol edin ve
        sifredeki hatalari yazdirin.
        Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve
        gecerli sifre girildiginde "sifreniz Kabul edilmistir" yazdirin.
        -Sifre kucuk harf icermelidir
        -Sifre buyuk harf icermelidir
        -Sifre ozel karekter icermelidir
        -sifre enaz 8 karekter olmalidir.
       */

        Scanner scan=new Scanner(System.in);
        String sifre="";

        boolean uzunlukKontrol, kucukHarfKontrol, buyukHarfKontrol, ozelKarakterKontrol,sifreKontrolSonuc;

        do {
             uzunlukKontrol=false;
             kucukHarfKontrol=false;
             buyukHarfKontrol=false;
             ozelKarakterKontrol=false;
             sifreKontrolSonuc=false;
            System.out.println("sifre giriniz :");
            sifre=scan.nextLine();
            if(sifre.length()>=8) {
                uzunlukKontrol=true;
            }

            for (int i = 0; i <sifre.length() ; i++) {
                if(sifre.charAt(i)>='a' && sifre.charAt(i)<='z') {
                    kucukHarfKontrol=true;
                }
                if (sifre.charAt(i)>='A' && sifre.charAt(i)<='Z') {
                    buyukHarfKontrol=true;
                }
                if(sifre.charAt(i) > 32 && sifre.charAt(i) < 48 ||
                   sifre.charAt(i) > 57 && sifre.charAt(i) < 65 ||
                   sifre.charAt(i) >91 && sifre.charAt(i) <97 || sifre.charAt(i) >122) {
                   ozelKarakterKontrol=true;
                }
            }
            if(kucukHarfKontrol==false) {
                System.out.println("Sifreniz kucuk harf icermelidir");
            }
            if(buyukHarfKontrol==false) {
                System.out.println("Sifreniz buyuk harf icermelidir");
            }
            if(ozelKarakterKontrol==false) {
                System.out.println("Sifreniz ozel karakter icermelidir");
            }
            if(uzunlukKontrol==false) {
                System.out.println("Sifreniz en az sekiz karakter olmalidir");
            }

            sifreKontrolSonuc=buyukHarfKontrol &&
                    kucukHarfKontrol &&
                    ozelKarakterKontrol&&
                    uzunlukKontrol;

        } while (sifreKontrolSonuc==false);
        System.out.println("Sifreniz kabul edilmistir");









    }
}
