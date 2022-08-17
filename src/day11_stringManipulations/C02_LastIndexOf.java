package day11_stringManipulations;

public class C02_LastIndexOf {
    public static void main(String[] args) {

        String cumle="Java cok kolay, Java cok guzel";
        String kelime="Java";

        //verilen kelimenin asagıdaki sartlardan
        //uygun olanı yazan bir program yaziniz

        //verilen kelime cumlede kullanılmamıs
        //verilen kelime cumlede sadece bir defa kullanılmıs
        //verilen kelime cumlede birden fazla kullanılmıs

        int kelimeIlkIndex=cumle.indexOf(kelime);
        int kelimeSonIndex=cumle.lastIndexOf(kelime);

        if (kelimeIlkIndex==-1) {
            System.out.println("cumlede kullanılmamis");
        } else if (kelimeIlkIndex==kelimeSonIndex) {
            System.out.println("bir defa kullanılmıs");
        } else {
            System.out.println("birden fazla kullanılmıs");
        }


    }
}
