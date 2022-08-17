package day21_arrays;

import java.util.Arrays;

public class C09_binarySearch {
    public static void main(String[] args) {
        /*
         binarySearch method'u siralanmis array'de aradigimiz elementin index'ini dondurur

         Ya aradigimiz element array'de yoksa ?
         (String'de indexOf() bize olmayan elementler icin -1 donduruyordu)

        Aradigimiz element array'de yoksa Java hem olmadigini,
        hem de olsaydi nerede olacagini bize dondurur

        olmadigini ifade icin - kullanir
        olsaydi nerede olacagini belirtmek icin index degil siralama kullanir

         */

    int [] sayilar={3,5,1,4,7,0};

    Arrays.sort(sayilar);
    System.out.println(Arrays.toString(sayilar));//[0, 1, 3, 4, 5, 7]

        System.out.println(Arrays.binarySearch(sayilar, 5));//4
        System.out.println(Arrays.binarySearch(sayilar, 10));//-7




    }
}
