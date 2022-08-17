package day35_inheritancedaConstructorKullanimi;

public class GToyota {

    public GToyota() {
        System.out.println("Toyota parametresiz cons");
    }
    public GToyota(String isim) {
        // super(isim);  extends olmadigi icin super constructor call'u java kabul etmez

        System.out.println("Toyota parametleri cons");
    }

}
