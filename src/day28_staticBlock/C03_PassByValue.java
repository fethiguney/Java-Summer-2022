package day28_staticBlock;

public class C03_PassByValue {
    public static void main(String[] args) {
         /*
          %25 indirimli fiyati hesaplayip bize donduren bir method olusturun
         */

        double satisFiyatı=100;
        double indirimOrani=25;


        double indirimliFiyat=indirimliFiyatHesapla(satisFiyatı, indirimOrani);


    }

    public static double indirimliFiyatHesapla(double satisFiyatı, double indirimOrani) {
        double indirimliFiyat=satisFiyatı*(1-indirimOrani/100);

        return indirimliFiyat;
    }
}
