package day15_overloading_forLoop;

public class C08_Faktoriyel {
    public static void main(String[] args) {

        /*
        input olarak verilen bir tamsayi icin faktoriyel hesaplayıp yazdiran
        bir method olusturun verilen sayi 0, negatif veya 20'den buyuk olursa girilen
        sayinin faktoriyel i hesaplanamaz uyarısı yazdirin
         */

        int input=5;

        faktoriyelHesap(input);

    }

    private static void faktoriyelHesap(int input) {
        int faktoriyelSonuc=1;

        if (input <0 || input >20) {
            System.out.println("girilen sayinin faktoriyeli hesaplanamaz");
        } else if (input==0) {
            System.out.println("0 sayisinin faktoriyeli 1'dir");
        } else {
            for (int i = input; i >=1 ; i--) {
                faktoriyelSonuc*=i;
            }
            System.out.println("Verilen sayinin faktoriyeli : "+faktoriyelSonuc);
        }
    }


}
