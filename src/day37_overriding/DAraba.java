package day37_overriding;

public class DAraba {

      /*
         Parent class'dan override edilmesini istemediginiz method'lari
         private, static veya final yapabilirsiniz
         */

    private void yakit(){
        System.out.println("Tum arabalar yakit kullanir");
    }
    void marka() {
        System.out.println("Tum arabalarin markasi vardir");
    }
    void motor() {
        System.out.println("Tum arabalarin motoru vardir");
    }
}
