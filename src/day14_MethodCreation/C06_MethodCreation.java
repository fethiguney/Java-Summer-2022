package day14_MethodCreation;

import static day14_MethodCreation.C04_MethodCreationReturn.isimGizle;
import static day14_MethodCreation.C05_MethodCreationReturn.sehirAl;

public class C06_MethodCreation {
    public static void main(String[] args) {

       // System.out.println(C05_MethodCreationReturn.sehirAl());


      ///String sehir=sehirAl();

        String isim="Ahmet";
        String soyisim="Yildiz";
        String gizliIsim=isimGizle(isim,soyisim);

        System.out.println(gizliIsim);




    }
}
