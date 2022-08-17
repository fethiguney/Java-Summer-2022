package day35_inheritancedaConstructorKullanimi;

public class HCorolla extends GToyota{
    public HCorolla() {
        System.out.println("Corolla parametresiz cons");
    }
    public HCorolla(String isim) {
        super(isim);
        System.out.println("Corolla parametleri cons");
    }
}
