package day14_MethodCreation;

public class C04_MethodCreationReturn {

    //verilen isim ve soyismi ilk harfi buyuk
    //geriye kalanları yildiz olacak sekilde
    //degistirip bize bu halini donduren bir
    //method olusturun
    //NOT=programin ilerleyen kisimlarinda isim
    //ve soy ismi bu sekilde kullanmak istiyoruz

    public static void main(String[] args) {
        String ad="Ahmet";
        String soyad="Yildiz";
        String gizliIsim=isimGizle(ad, soyad);
        //System.out.println(isim + " "+ soyisim); // Enes Bozkurt
        System.out.println(gizliIsim); // E*** B******
    }
    public static String isimGizle(String isim, String soyisim) {
        isim = isim.substring(0, 1).toUpperCase()
                + isim.substring(1).replaceAll("\\w", "*");
        soyisim = soyisim.substring(0, 1).toUpperCase()
                + soyisim.substring(1).replaceAll("\\w", "*");
        return isim + " " + soyisim;
    }
}
