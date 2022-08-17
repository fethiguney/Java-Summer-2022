package day36_inheritanceDataTypeKullanimi;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DIsci extends BMuhasebe {
    protected int saatUcreti=11;
    protected int gunlukMesai=7;

    protected void maasIsci(){
        System.out.println("Isciler : "+(30*saatUcreti*gunlukMesai)+" maas alir");
    }
    protected void ozelSigortaIsci(){
        System.out.println("Isiler %70 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {

        BMuhasebe isc1=new DIsci(); //BMuhasebe class'ina gidecek

        /*
          Bir obje olusturulurken
          Data turu ve constructor ayni class'dan ise
          direk o class'a gidiyorduk

          Eger data turu ve cons. farkli ise
          Obje constructor'in oldugu class'in objesidir
          ancak, bizden istenen
          Isci class'indaki spesifik ozellikler degil
          Bir iscinin muhasebe classindaki
          tum calisanlarla beraber sahip oldugu
          genel ozellikleri yazdirir

         */

        System.out.println(isc1.gunlukMesai);//8
        System.out.println(isc1.saatUcreti);//10
        isc1.maas();//M
        isc1.ozelSigorta();//
        isc1.sigorta();//

        System.out.println(isc1.isim);
        System.out.println(isc1.soyisim);
        System.out.println(isc1.departman);

        APersonel isc2=new DIsci(); //APersonel classina gidecek
       // System.out.println(isc2.gunlukMesai);
        //  System.out.println(isc2.saatUcreti);
        isc2.maas();//M
        //  isc2.ozelSigorta();//
        isc2.sigorta();//
        /*
         Eger Data turu olan class'da aradigimiz ozellik yoksa
         varsa onun parent'ina gidebilir
         ama child'a donus olmaz
         Aradigi ozelligi bulamazsa CTE verir
         */

        System.out.println(isc2.isim);
        System.out.println(isc2.soyisim);
        System.out.println(isc2.departman);

        List<String> list1 = new LinkedList<>();
        Deque<String> list2= new LinkedList<>();
        Queue<String> list3= new LinkedList<>();

        /*
        Hepsi LinkedList olsa da
        list1 List gibi davranir
        list2 Deque gibi davranir
        List3 Queue gibi davranir
         */


    }

}
