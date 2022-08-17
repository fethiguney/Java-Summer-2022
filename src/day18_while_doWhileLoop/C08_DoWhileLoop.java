package day18_while_doWhileLoop;

import java.util.Scanner;

public class C08_DoWhileLoop {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        boolean kontrol=false;
        String sifre="";

        do {
            System.out.println("Sifre giriniz");
            sifre=scan.nextLine();
            kontrol=sifreyiKontrolEt(sifre);

        } while (kontrol==false);

        System.out.println("Sifreniz kabul edilmistir");



    }

    public static boolean sifreyiKontrolEt(String sifre) {
        boolean uzunlukKontrol=false;
        boolean kucukHarfKontrol=false;
        boolean buyukHarfKontrol=false;
        boolean ozelKarakterKontrol=false;
        boolean sifreKontrolSonuc=false;

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
        return sifreKontrolSonuc;
    }


}
