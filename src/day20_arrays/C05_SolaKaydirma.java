package day20_arrays;

import java.util.Arrays;

public class C05_SolaKaydirma {

    public static void main(String[] args) {

        //verilen 3 elamanli bir Array'in tüm elemanlarini
        //bir soldaki konuma tasiyacak bir program yap

        int sayilar []={1,2,3};

       int temp =sayilar [0];


        for (int i = 0; i < sayilar.length-1 ; i++) {
            sayilar[i]=sayilar[i+1];
        }
        sayilar[sayilar.length-1]=temp;
        System.out.println(Arrays.toString(sayilar));

        //yukarida degistirdigimiz array i
        //ilk durumuna getirmek icin saga kaydiralim

        temp=sayilar [sayilar.length-1];
        for (int i = sayilar.length-1; i >0 ; i--) {
            sayilar[i]=sayilar[i-1];
        }
        sayilar [0]=temp;
        System.out.println(Arrays.toString(sayilar));

    }
}
