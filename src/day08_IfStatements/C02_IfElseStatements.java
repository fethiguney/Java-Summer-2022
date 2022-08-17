package day08_IfStatements;

import java.util.Scanner;

public class C02_IfElseStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Notunuzu giriniz");
        int not = scan.nextInt();

        if (not < 0 || not > 100) {
            System.out.println("gecerli not giriniz");
        } else if (not < 50) {
            System.out.println("Notunuz = D");
        } else if (not < 60) {
            System.out.println("Notunuz = C");
        } else if (not < 80) {
            System.out.println("Notunuz = B");
        } else {
            System.out.println("Notunuz = A");
        }

    }
}
