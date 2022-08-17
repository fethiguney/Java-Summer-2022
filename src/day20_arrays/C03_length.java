package day20_arrays;

import java.util.Arrays;

public class C03_length {
    public static void main(String[] args) {


        int sayilar[]={1,2,3};
        String harfler[]=new String[4];



        System.out.println("sayilar array'in uzunlugu : "+sayilar.length);//4
        //Array'in length uzunlugu n-1'dir

        System.out.println("harfler array'in uzunlugu : "+harfler.length);

        System.out.println(Arrays.toString(harfler));
        //harfler array'in son elementini yazdiralim

        System.out.println(harfler[harfler.length-1]);

        System.out.println(harfler[5]);//ArrayIndexOutOfBoundsException hatasi

    }
}
