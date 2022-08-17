package day35_inheritancedaConstructorKullanimi;

public class AGrandParent {

    protected String isim="GrandPa ismi belirtilmedi";

    protected String grandPaKlupAdi="GranPa Klubu";

    /*
          Her class'da gorunmese bile bir constructor vardir
          Bu class'dan obje olusturmak istedigimizde
          default constructor devreye girecektir.

          Default constructor'i gozlemleyemeyecegimiz icin
          onun yerine kullanilabilecek parametresiz constructor olusturalim
         */
    public AGrandParent() {
        System.out.println("GrandPa constructor calisti");
    }



}
