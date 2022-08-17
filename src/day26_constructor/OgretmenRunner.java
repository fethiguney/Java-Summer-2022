package day26_constructor;

public class OgretmenRunner {
    public static void main(String[] args) {


        Ogretmen ogretmen1=new Ogretmen();
        System.out.println("Ogretmen1 ozellikleri : "+ogretmen1);

        Ogretmen ogretmen2=new Ogretmen("Emre","Akdogan","1/1/2001","Matematik","Fizik");
        System.out.println("Ogretmen2 ozellikleri : "+ogretmen2);

        Ogretmen ogretmen3=new Ogretmen("Cavidan", "Kartal", "10/05/1980");
        System.out.println("Ogretmen3 ozellikleri :"+ogretmen3);




    }
}

