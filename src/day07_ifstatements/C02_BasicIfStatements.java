package day07_ifstatements;

public class C02_BasicIfStatements {
    public static void main(String[] args) {
        int sayi=10;
        if(sayi>0){
            System.out.println("sayi pozitif");
        } if ((sayi&2)==02) {
            System.out.println("sayi cift");
        } if( sayi%5==0) {
            System.out.println("sayi 5'in kati");
        }
    }
}
