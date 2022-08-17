package day07_ifstatements;

import java.util.Scanner;

public class C04_BasicIfStatement {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("gun ismi giriniz");
        String gun=scan.next().toLowerCase();

        if (gun.equals("pazar")|| gun.equals("cumartesi")) {
            System.out.println("Girilen gun HAFTASONU");
        }
        if (gun.equals("pazartesi") || gun.equals("sali")
                || gun.equals("carsamba") || gun.equals("persembe")
                || gun.equals("cuma")) {
            System.out.println("Girilen gun HAFTAICI");
        } if (!(gun.equals("pazartesi") || gun.equals("sali")
                || gun.equals("carsamba") || gun.equals("persembe")
                || gun.equals("cuma") ||gun.equals("pazar")
                || gun.equals("cumartesi"))) {
            System.out.println("gecerli bir gun giriniz");
        }


    }
}
