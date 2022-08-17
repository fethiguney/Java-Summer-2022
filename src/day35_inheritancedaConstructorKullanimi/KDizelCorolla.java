package day35_inheritancedaConstructorKullanimi;

public class KDizelCorolla extends HCorolla{
    public KDizelCorolla() {
        System.out.println("DizelCorolla parametresiz cons");
    }
    public KDizelCorolla(String isim) {
       super(isim);
        System.out.println("DizelCorolla parametleri cons");
    }

    public static void main(String[] args) {

        KDizelCorolla obj1=new KDizelCorolla("Hasan");

        /* Output
        Toyota parametleri cons
        Corolla parametleri cons
        DizelCorolla parametleri cons

         */




    }
}
