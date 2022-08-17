package day45_collections;

import com.sun.source.doctree.SeeTree;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {

        /*
        verilen bir arraydeki tekrar eden elementleri
        silip tekrarsiz halini arraye atayan bir kod yaziniz
         */

        int [] arr={4,5,3,6,8,5,1,89,0,4,2,45,7,9,1,2,5,7,6};

       Set<Integer> tekrarsizList=new HashSet<>();
        for (int each: arr) {
            tekrarsizList.add(each);
        }

        int indeks=0;
        int [] yeniArr=new int[tekrarsizList.size()];
        for (int each: tekrarsizList) {
            yeniArr [indeks]=each;
            indeks++;
        }

        arr=yeniArr;
        System.out.println(Arrays.toString(arr));


    }
}
