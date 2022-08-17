package day16_for_loop;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {

        //Kullanicidan iki sayi isteyin. Girilen sayilar ve
        // aralarindaki tum tamsayilari toplayip,
        // sonucu yazdiran bir method yaziniz

        Scanner scan=new Scanner(System.in);
        System.out.println("Baslangic ve bitis sayilari girin");
        int bas=scan.nextInt();
        int bit=scan.nextInt();

        aralardakileriTopla(bas, bit);




    }

    public static void aralardakileriTopla(int bas, int bit) {
        int toplam=0;
        if (bas<=bit){
            for (int i = bas; i <=bit ; i++) {
                toplam +=i;

            }
        }else{
            for (int i = bit; i <=bas ; i++) {
                toplam +=i;
            }
        }
        System.out.println("Sayilarin toplami : "+toplam);
    }


}





