package day18_while_doWhileLoop;

import java.util.Scanner;

public class C04_doWhileLoop {
    public static void main(String[] args) {

        /*
        Kullanicidan tam sayilar alin
        kullanici cift sayi girdiği müddetce
        sayilari yazdirin
        tek sayi girdiginde islemi bitirin
         */

        //1.yontem while ile
        /*
        Loop larda kullanacagimiz variable lari
        loop tan once olusturmaliyiz. While loop ta
        looptan once olusturdugumuz bu variable a
        atayacagimiz degeri iyi dusunmemiz gerekiyor
        Yanlis bir deger atarsak loop hic devreye girmez
        burda ilk atadigimiz degere DİKKAT ETMELİYİZ
         */

        Scanner scan = new Scanner(System.in);
        int sayi = 0;

        while (sayi % 2 == 0) {
            System.out.println("lutfen bir sayi giriniz");
            sayi = scan.nextInt();
            if (sayi % 2 == 0) {
                System.out.println("Girilen sayi cift : " + sayi);
            } else {
                System.out.println("Girilen sayi tek, benden bu kadar");
            }
        }
        //2.yontem do-WhileLoop
        //do while loop ta onceden olusturulan variable a
        //hangi deger atandiginin hicbir onemi yok kodumuz
        //her durumda calisir
        /*
        do while'in dezavantajı
        ilk calistirma kontrol yapilmadan oldugu icin
        loop'un body sinde yanlis bir islem yapilmamasina
        dikkat etmek gerekir
        ilk degerin yanlis bir sonuc olusturmadigina DİKKAT
        ETMELİYİZ
         */

        do {
            System.out.println("lutfen bir sayi giriniz");
            sayi = scan.nextInt();
            if (sayi % 2 == 0) {
                System.out.println("Girilen sayi cift : " + sayi);
            } else {
                System.out.println("Girilen sayi tek, benden bu kadar");

            }
        } while (sayi % 2 == 0) ;



    }
}
