package day17_nestedforloop;

public class C03_NestedForLoop {
    public static void main(String[] args) {

        /*
        verilen yuksek ve boy degerine gore yildizlardan
        olusan bir dikdortgen olusturalim
        yukseklik:3 boy:4
        ***
        ***
        ***
        ***
         */

        int yukseklik =4;
        int boy=8;

        for (int i = 1; i <=yukseklik ; i++) {
            for (int j = i; j <=boy ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }







    }
}
