package day33_encapsulation;

public class ArabaRunner {
    public static void main(String[] args) {

        Araba arb=new Araba();
        arb.marka="Toyota";
        // arb1 objesi uzerinden marka variable'ina
        // ulasabildim, degistirebildim(set) ve yazdirabildim(get)

        System.out.println(arb.marka);
        // access modifier kullanarak marka variable'ina ulasimi
        // tamamen serbest yapabilir veya tamamen engelleyebilirim
        // private yaptigimiz model'e ise hic ulasamayiz
        // yani access modifier ya hep ya hic diyor

        // model' i degistirelim ama goremeyelim
        // yakiti'da gorelim ama degistiremeyelim

        // set ve get yetkilerini ozel olarak tanimlamak isterseniz
        // 1.adim - ozel yetki tanimlayacaginiz variable'lari private yapin
        //          private bir dataya baska class'lardan ulasmak mumkun olmadigindan
        // 2.adim - set yetkisi icin setter, get yetkisi icin getter methodlari olusturalim


        arb.setModel("Corolla");
        // model'i yazdirma imkanimiz yok, cunku getter method'u yok
        System.out.println(arb.getYakit());
        // Elektrikli bilgisini yazdirabildik
        // yakiti degistiremeyiz cunku setter method'u yok

    }
}
