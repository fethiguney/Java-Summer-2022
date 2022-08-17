package day18_while_doWhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {

        //Kullanicidan bir sayi alın ve
        //sayinin rakamlari toplamini bulun

        int input=565432;

       int rakamlarToplami=0;
       int basamakDegerleri=0;
       int temp=input;

       while (temp>0) {
           basamakDegerleri=temp%10;
           rakamlarToplami+=basamakDegerleri;
           temp/=10;
       }
        System.out.println("Girilen "+input+" sayisinin rakamlar toplami : "+rakamlarToplami);

        for (int i = temp; i >0 ; i/=10) {
            rakamlarToplami+=i%10;
            }
        System.out.println(input+" sayisinin rakamlar toplami : "+ rakamlarToplami);




    }
}
