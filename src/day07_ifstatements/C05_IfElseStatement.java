package day07_ifstatements;

import java.util.Scanner;

public class C05_IfElseStatement {
    public static void main(String[] args) {
       //kullanıcıdan bir karakter girmesini isteyin ve girilen karakterin har olup olmadigini yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
        char harf=scan.next().charAt(0);

        if ((harf>='a' && harf<='z') || (harf>='A' && harf <='Z')) {
            System.out.println("Girilen karakter bir harf");
        } else{
            System.out.println("Girilen karakter bir harf degil");
        }
    }
}
