package day18_while_doWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

        /*
        While loop ta once kontrol edip sonra islem yaptigimiz icin
        islem bittikten sonra loop un kirilmasi için bir kez daha
        basa donmemiz gerekiyor
        bu durumda fazladan bir islem yapiliyor
         */
        int sayi=7;
        while (sayi<10) {
            System.out.print(sayi+" ");
        sayi++;
        }
        /*
        do-while loop ile calistigimizda bu dezavantaj ortadan
        kalkar
         */
        System.out.println("");
        sayi=7;

        do {
            System.out.print(sayi+" ");
            sayi++;
        } while (sayi<10);




    }
}
