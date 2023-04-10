package day03_scanner;

import java.util.Scanner;

public class FindingOddNumbers {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter first number and press enter : ");
        int number1=scan.nextInt();

        System.out.print("Please enter second number and press enter : ");
        int number2=scan.nextInt();

        System.out.println("Odd numbers between the numbers you entered : ");

        if (number1<number2) {
            for (int i = number1; i <= number2; i++) {
                if (i % 2 == 1) {
                    System.out.print( i + " ");
                }
            }
        } else {
            for (int i = number2; i <= number1; i++) {
                if (i % 2 == 1) {
                    System.out.print(i + " ");
                }
            }
        }


    }
}
