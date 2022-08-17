package day06_concatination;

import java.util.Scanner;

public class C01_WrapperClasses {
    public static void main(String[] args) {
        String str= "Java ile hayat guzel";

        str.toUpperCase();

        boolean guzelMi=true;
        Boolean buGuzelMi=true;

        System.out.println(buGuzelMi.toString());

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        String ogrenciNo="123456";

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 5 basamakli bir sifre giriniz");
        String sifre=scan.nextLine();

        Integer sifreSayi=Integer.parseInt(sifre);

        System.out.println("girilen sifrenin 3 fazlası = "+ (sifre+3));
        System.out.println("Integer sifrenin 3 fazlası = "+ (sifreSayi+3));



    }
}
