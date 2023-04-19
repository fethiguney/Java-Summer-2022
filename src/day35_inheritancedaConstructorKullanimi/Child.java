package day35_inheritancedaConstructorKullanimi;

public class Child extends BParent {

    String isim="Child isim belirtilmedi";
    protected String childKlupAdi="Child Klubu";

    public Child() {

        System.out.println("Child construtor calisti");

    }




    public static void main(String[] args) {


        //AGrandParent gp1=new AGrandParent();
        // bu objeyi olusturmak icin Granpa Cons. calisir,
        // Parent veya Child cons calismaz

        Child child1=new Child();
      child1.grandPaKlupAdi="Child1";
      child1.parentKlubAdi="Child2";


        /* Output
        GrandPa constructor calisti
         Parent constructor calisti
        Child construtor calisti
         */
        // child1 objesi icin Child cons calisir
        /*
          Java'da bir class'i kullanabilmek icin
          o class'dan obje olusturur, dolayisiyla
          o class'in constructor'ini kullanirdik

          Java inheritance'da parent class'lardaki
          ozellikleri kullanabilmek icin
          o class'larin constructor'larini
          otomatik calistiran bir yapi kurmustur.

          Ornegin biz child class'inda
          Child class'indan bir obje olusturmak istedigimizde
          Child cons. ini kullaniriz

          Java Child(){} gordugunde
          once parent'in constuctor'ini calistirmam lazim der
          buradan Parent cons'a gider
          Parent class'inda Parent(){} gorunce
          once bunun parent'inin yani Granparent cons.
          calismasi gerekir der
          Boylece extends keyword olmayan class'a kadar gider
          ve oradan baslayarak tum constructorlari
          asagi dogru calistirir
         */



    }
}
