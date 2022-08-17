package day24_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_UniqueArrayOlusturma {
    public static void main(String[] args) {
        // Soru 2) Verilen bir array’deki elementleri tek bir defa barindiran
        // yeni bir array olarak donduren bir method olusturun


        int[] arr ={2,3,5,6,3,5,4,1,9,6,3,5,5};

        int [] uniqueArr=uniqueArrayOlustur(arr);
        System.out.println(Arrays.toString(uniqueArr));





    }

    public static int[] uniqueArrayOlustur(int[] arr) {
        Arrays.sort(arr);
        List<Integer> uniqueList=new ArrayList<>();
        for (int i = 0; i <arr.length-1 ; i++) {
            if(!uniqueList.contains(arr[i])) {
                uniqueList.add(arr[i]);
            }
        }
        if(!uniqueList.contains(arr[arr.length-1])) {
            uniqueList.add(arr[arr.length-1]);
        }
        int [] uniqueArr=new int[uniqueList.size()];
        for (int i = 0; i <uniqueArr.length ; i++) {
            uniqueArr[i]=uniqueList.get(i);
        }
        return uniqueArr;
    }


}
