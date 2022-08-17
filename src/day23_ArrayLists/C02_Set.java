package day23_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_Set {
    public static void main(String[] args) {
        /*
        Elimizde urunlerin bulundugu bir liste var
        urun listesindeki istenen siradaki urunu
        istedigimiz yeni urunle degistirip eski urunu
        var olan eski urunler listesine ekleyelim
         */

        List<String> urunler=new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        List<String> eskiUrunler=new ArrayList<>();
        //Listedeki ikram in yerine biskrem koyalim
        //ikram i da eski urunler listesine ekleyelim

        String yeniUrun="Biskrem";
        String silinecekUrun="Ikram";

        int temp=urunler.indexOf(silinecekUrun);
        String silinenUrun=urunler.set(temp,yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("urunler listesi : "+urunler);
        System.out.println("eskiUrunler listesi : "+eskiUrunler);

         yeniUrun="Kahve";
         silinecekUrun="Cay";

        temp=urunler.indexOf(silinecekUrun);
        silinenUrun=urunler.set(temp,yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("urunler listesi : "+urunler);
        System.out.println("eskiUrunler listesi : "+eskiUrunler);

        yeniUrun="Findik";
        silinecekUrun="Cekirdek";

        temp=urunler.indexOf(silinecekUrun);
        silinenUrun=urunler.set(temp,yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("urunler listesi : "+urunler);
        System.out.println("eskiUrunler listesi : "+eskiUrunler);






    }
}
