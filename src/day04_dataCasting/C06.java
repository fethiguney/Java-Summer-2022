package day04_dataCasting;

public class C06 {
    public static void main(String[] args) {
       //odev-1
       byte sayi=120;
        System.out.println("sayi = " + sayi);
       short sayi1=sayi;
        System.out.println("sayi1 = " + sayi1);
       int sayi2=sayi1;
        System.out.println("sayi2 = " + sayi2);
       double sayi3=sayi2;
        System.out.println("sayi3 = " + sayi3);

       //odev-2
        int sayi4=40000;
        short sayi5= (short) sayi4;
        System.out.println("sayi5 = " + sayi5);
        byte sayi6=(byte) sayi5;
        System.out.println("sayi6 = " + sayi6);

        //odev-3
        float sayi7=12354f;
        System.out.println("sayi7 = " + sayi7);

        //odev-4
        double sayi8=255.36;
        int sayi9=(int) sayi8;
        System.out.println("sayi9 = " + sayi9);
        byte sayi10= (byte) sayi9;
        System.out.println("sayi10 = " + sayi10);

        //odev-5
        int sayi11=12354;
        int sayi12=235;
        System.out.println("sayi11/sayi12 = "+ sayi11/sayi12);

        //odev-6
        int sayi13=45699;
        double sayi14=75;
        System.out.println("sayi13/sayi14 = " + sayi13/sayi14);

        //odev-7
        byte sayi15=10;
        short sayi16=250;
        int sayi17=35265;
        long sayi18=458963;
        double sayi19=75.2;

        System.out.println("sayi15*sayi16 ="+sayi15*sayi16);
        System.out.println("sayi17/sayi16 =" +sayi17/sayi16);
        System.out.println("sayi16*sayi17 =" +sayi16*sayi17);
        System.out.println("sayi18/sayi19 ="+ sayi18/sayi19);
        System.out.println("sayi16*sayi19 ="+sayi16*sayi19);

        

    }
}
