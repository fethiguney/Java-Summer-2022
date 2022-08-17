package day35_inheritancedaConstructorKullanimi;

public class EMuhasebe extends DPersonel {
    public EMuhasebe() {

        System.out.println("EMuhasebe parametresiz cons");
    }
    EMuhasebe (String isim) {

        System.out.println("Muhasebe parametleri cons");
    }
}
