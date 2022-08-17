package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("isminizi giriniz");
        String isim= scan.next();
        System.out.println("soyisminizi giriniz");
        String soyIsim= scan.next();
        System.out.println("yasinizi giriniz");
        String yas= scan.next();

        System.out.println("girilen bilgiler ="+isim+" "+soyIsim+" "+yas);
    }
}
