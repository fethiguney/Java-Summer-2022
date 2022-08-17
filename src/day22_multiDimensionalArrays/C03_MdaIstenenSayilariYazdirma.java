package day22_multiDimensionalArrays;

public class C03_MdaIstenenSayilariYazdirma {
    public static void main(String[] args) {
        /*
        verilen iki katli bir multi-dimensional arrayda
        outer indeksi ve inner indeksi ayni olan sayilarin
        toplamini bulun
         int [] [] sayilar= {{1,5,6,9},{2,5},{3,1,6}};
         [0][0]+ [1][1]+[2][2]..
         */
        int [] [] sayilar= {{1,5,6,9},{2,5},{3,1,6}};

        int toplam=0;
        for (int i = 0; i < sayilar.length ; i++) {
            for (int j = 0; j <sayilar [i].length ; j++) {
                   if (i==j ) {
                        toplam+=sayilar [i] [j];
                   }
            }
        }
        System.out.println(toplam);


        // Array icinde en buyuk sayiyi bulalim

        int maxSayi = sayilar[0] [0];
        for (int i = 0; i < sayilar.length ; i++) {
            for (int j = 0; j <sayilar [i].length ; j++) {
                if (sayilar [i] [j] >maxSayi) {
                    maxSayi=  sayilar [i] [j];
                }
            }
        }
        System.out.println(maxSayi);




    }
}
