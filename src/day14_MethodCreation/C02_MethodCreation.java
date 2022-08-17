package day14_MethodCreation;

public class C02_MethodCreation {
    public static void main(String[] args) {

        //verilen uc basamakli bir sayinin rakamları toplamini
        //yazdiran bir method olusturalim

        int input=423;
        rakamlariTopla(input);

        C01_MethodCreation.terstenYazdir("nuri");
    }

    public static void rakamlariTopla(int input) {
        int birlerBasamagı=0;
        int rakamlarToplami=0;
        int temp=input;

        birlerBasamagı=input%10;
        rakamlarToplami+=birlerBasamagı;
        input/=10;

        birlerBasamagı=input%10;
        rakamlarToplami+=birlerBasamagı;
        input/=10;

        birlerBasamagı=input%10;
        rakamlarToplami+=birlerBasamagı;
        input/=10;

        System.out.println("Girdiginiz "+temp+ " sayisinin rakamlar toplami :"+rakamlarToplami);


    }
}
