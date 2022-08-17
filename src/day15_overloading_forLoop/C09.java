package day15_overloading_forLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C09 {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String reversed = "";
        for (int i = sentence.length()-1; i >=0 ; i--) {
            reversed+=sentence.substring(i,i+1);
        }
        System.out.println(reversed);


    }
}