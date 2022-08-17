package day03_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("yarıcap uzunlugunu giriniz");
        double yarıcap=scan.nextDouble();

        System.out.println("cemberin cevresi= "+2*3.14*yarıcap);
        System.out.println("cemberin alanı= "+3.14*yarıcap*yarıcap);
    }
}
