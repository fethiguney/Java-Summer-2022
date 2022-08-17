package day15_overloading_forLoop;

public class C01_ReturnMethod {
    public static void main(String[] args) {
        //verilen iki sayiyi carpip
        //sonucu bize donduren bir method yapalim


        int sayi1=10;
        int sayi2=15;

        int carpmaSonuc=carpmaIslemi(sayi1, sayi2);
        System.out.println(carpmaSonuc);


    }

    public static int carpmaIslemi(int sayi1, int sayi2) {
        int carpmasonucu=sayi1*sayi2;
        return carpmasonucu;
    }


}
