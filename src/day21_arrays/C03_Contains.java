package day21_arrays;

import java.util.Scanner;

public class C03_Contains {
    public static void main(String[] args) {

   //Kullanicidan aldigimiz bir ismin verilen Array'da  olup olmadigini kontrol edip,
  // bize true veya false sonucu donen bir method olusturun

    String [] isimler={"Basak", "Nurullah", "Fatih", "Adem", "Enes"};
        Scanner scan=new Scanner(System.in);
        System.out.println("Aradiginiz ismi girin");
        String arananIsim=scan.nextLine();

            boolean sonuc=contains(isimler, arananIsim);
            if(sonuc) {
                System.out.println("Aranan isim var");
            } else {
                System.out.println("Aranan isim yok");
            }

    }

    public static boolean contains(String[] isimler, String arananIsim) {
        boolean varMi=false;
        for (int i = 0; i <isimler.length ; i++) {
            if (isimler[i].equalsIgnoreCase(arananIsim)) {
                varMi=true;
            }
        }
        return varMi;
    }


}
