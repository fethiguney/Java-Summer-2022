package day07_ifstatements;

import java.util.Scanner;

public class C07_IfElseIfStatement {
    public static void main(String[] args) {
        /*
        kullanıcı negatif bir değer girerse uyaralim
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas=scan.nextInt();

        if(yas<0) {
            System.out.println("lutfen gecerli bir yas giriniz");
        }
        else if (yas<65) {
            System.out.println("emekli olamazsin "+ (65-yas) + " yil daha calismalisin");
        } else {
            System.out.println("emekli olabilirsin");
        }


    }
}
