package day19_scope;

import static day19_scope.C01_InstanceVariables.staticMethod;

public class C02_StaticVariables {

    /*
    -Static olarak belirlen variable'lara tüm method'lardan ulasilabilir.
	Bir variable'in diger class üyeleri için ortak olmasini istiyorsak
	o zaman static yapariz.
	Eger olusturulan variable bir okul adi gibi tüm diger unsurlari
	etkiliyorsa bu variable static olarak olusturulur ve class'in her
	yerinden ulasilabilir.

    static variable in degerini gormek istiyorsak
    class in basindan baslayarak kullanildigi kodlari
    takip etmeliyiz
    */
    static int staticSayi = 10;
    String isim = "Mehmet";

    static int degersizStaticVar;
    int degersizInstanceVariable;
    /*
    Class level'daki variable'lara deger atamasak da Java kabul ediyor
     */

    public static void main(String[] args) {
       /*
       bir variable static olusturulduysa
       objeler icin degil class icin gecerlidir
        */
        System.out.println(staticSayi); // 10
        staticMethod();
        staticSayi = 12;
        System.out.println(staticSayi); // 12
        C02_StaticVariables obje1 = new C02_StaticVariables();
        obje1.staticOlmayanMethod();
        System.out.println(staticSayi); // 20
        /*
         instance bir variable'in degerini bulmak icin objenin olusturulmasindan itibaren
         istenen satira kadar kodu takip etmeliyiz

         Static variable'da ise class'in en basindan baslayarak
         istenen satira kadar kodu tekip edip
         static variable'in son degerini bulmamiz gerekir
         */



    }

    public static void staticMethod() {
    }

    void staticOlmayanMethod() {
    }

}