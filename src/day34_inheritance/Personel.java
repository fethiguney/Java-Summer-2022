package day34_inheritance;

public class Personel {
/*
      Eger parent class olacak sekilde tasarladiginiz bir class varsa
      veya ilerde bu class'i parent yapmak isteyenler olabilir diyorsaniz
      variable ve method'larin a
      access modifier'ini protected yapilmalidir
     */

    /*
    - Child Classlar parent classlar
    daki tüm özelliklere sahiptir

   - Child Classlar parent classlardaki
   bazı özellikleri kendine uyarlayabilir

  - Child classlar parent classlarda
   olmayan bazı extra özelliklere sahip olabilir.

    -Bir class'dan olusturulan objeler baglanti
     yapilan class'a gore FARKLI OZELLİKLER gosterebilir


     */

  protected int persNo;
  protected String isim="Isim belirtilmedi";
  protected String departman="Departman belirtilmedi";

    public void maas(){
        System.out.println("Tum personelin maasi vardir");
    }
    public void mesai() {
        System.out.println("Tum personel statusune gore mesai yapar");
    }


    public void fazlaMesaiUcreti() {
        System.out.println("personel fazla mesai ucretini statusune gore alir");
    }



}
