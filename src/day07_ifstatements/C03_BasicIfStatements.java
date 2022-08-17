package day07_ifstatements;

public class C03_BasicIfStatements {
    public static void main(String[] args) {
        int sayi = -20;
        if (sayi > 0) {
            System.out.println("sayi pozitif");
            System.out.println("pozitif kalsin");
        }
        if ((sayi & 2) == 02)
            System.out.println("sayi cift");
        System.out.println("cift kalsin");
        if (sayi % 5 == 0)
            System.out.println("sayi 5'in kati");
    }
}
