package day21_arrays;

public class C02_EnUzunveEnKisaKelime {
    public static void main(String[] args) {
//Verilen String bir array’de en uzun ve en kisa
// String’leri yazdiran bir method olusturun

        String[] isimler = {"Erdal", "Onur", "Mehmet", "Hayrullah", "Mihrican"};

        enUzunVeEnKisayiYazdir(isimler);


    }

    public static void enUzunVeEnKisayiYazdir(String[] isimler) {
        String enKisaIsim=isimler [0];
        String enUzunIsim=isimler [0];

        for (int i = 1; i < isimler.length ; i++) {
            if (isimler [i].length()<enKisaIsim.length()) {
                enKisaIsim=isimler [i];
            }
        }
        for (int i = 1; i < isimler.length ; i++) {
            if (isimler [i].length()>enUzunIsim.length()) {
                enUzunIsim=isimler [i];
            }
        }
        System.out.println("Array icindeki en kisa isim : "+enKisaIsim);
        System.out.println("Array icindeki en uzun isim : "+enUzunIsim);

    }


}
