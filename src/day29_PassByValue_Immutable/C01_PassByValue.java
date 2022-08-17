package day29_PassByValue_Immutable;

import java.util.Arrays;
import java.util.Random;

public class C01_PassByValue {
    public static void main(String[] args) {

        // 4 elamanli bir array olusturalim sonra
        //ayri bir method'da bu array'in ikinci ve dorduncu
        //elemanlarini 100'den kucuk rastgele sayi ile degistirelim
        //ve yeni halini yazdiralim

        int [] arr={5,7,8,10};

        elemanDegistir(arr);

        System.out.println("main method'un icinde diger method calistiktan sonra : " + Arrays.toString(arr));
        // [5, 97, 8, 33]


    }

    public static void elemanDegistir(int[] arr) {

        Random rnd=new Random();
        arr[1]=rnd.nextInt(100);
        arr[3]=rnd.nextInt(100);
        System.out.println(Arrays.toString(arr));

    }
}
