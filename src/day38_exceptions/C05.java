package day38_exceptions;

import java.util.Arrays;
import java.util.Scanner;

public class C05 {
    public static void main(String[] args) {

        String [] urunler = {"Nutella", "Cokokrem", "Sut", "Cay", "Findik"};
        Scanner scan = new Scanner(System.in);
        int siraNo = 0;
        boolean siraDogruMu=false;
        while (!siraDogruMu) {
            System.out.println("Urunlerimiz : "+ Arrays.toString(urunler)+"\n" +
                               "almak istedigniz urunun sira numarasi giriniz");
            try {
                siraNo=scan.nextInt();
                System.out.println(urunler[siraNo-1]+" urunu sepetinize eklendi");
                siraDogruMu=true;
            } catch (Exception e) {
                System.out.println("1 ile "+urunler.length+" arasi bir sayi giriniz");
                scan.nextLine();
            }
        }




    }
}
