package day21_arrays;

import java.util.Arrays;

public class C10_split {
    public static void main(String[] args) {

        String str="Java, ne kadar guzel.";

        String [] kelimeler=str.split(" ");
        System.out.println(Arrays.toString(kelimeler));//[Java,, ne, kadar, guzel.]

        String [] kelimelerNe=str.split("ne");
        System.out.println(Arrays.toString(kelimelerNe));//[Java, ,  kadar guzel.]

        String [] karakterler=str.split("");
        System.out.println(Arrays.toString(karakterler));
        //[J, a, v, a, ,,  , n, e,  , k, a, d, a, r,  , g, u, z, e, l, .]
    }
}
