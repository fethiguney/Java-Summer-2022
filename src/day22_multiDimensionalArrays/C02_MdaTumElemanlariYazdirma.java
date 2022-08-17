package day22_multiDimensionalArrays;

public class C02_MdaTumElemanlariYazdirma {
    public static void main(String[] args) {
        //verilen bir multiDimensionalArray in
        //tum elemanlarini yazdiran bir method olusturun


        int [] [] sayilar= {{1,5,6,9},{2,5},{3,1,6}};


        elementleriYazdir(sayilar);



    }

    public static void elementleriYazdir(int[][] sayilar) {
        for (int i = 0; i < sayilar.length ; i++) {
            for (int j = 0; j <sayilar [i].length ; j++) {
                System.out.print(sayilar[i] [j]+" ");
            }
        }
    }
}

