package day17_nestedforloop;

public class C04_NestedForLoop {
    public static void main(String[] args) {
        /*
        verilen input a gore yildizlardan olusan bir ucgen olusturun
        ornek input =4 ise
        *
        * *
        * * *
        * * * *
         */

        //Kare seklinde yazdiracaksak yukseklik outer loop, eni inner loop a gore
        //belirleriz
        //Ucgen seklinde yazdiracaksak yukseklik dıs dongüye gore belirlenir, iç döngü dış döngünün
        // döngüye girdiği i sayısı kadar tekrar eder

        int input=4;

        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }









    }
}
