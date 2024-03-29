package day36_inheritanceDataTypeKullanimi;

public class CMemur extends BMuhasebe{

    protected int saatUcreti=12;
    protected int gunlukMesai=9;

    protected void maas(){
        System.out.println("Memurlar : "+(30*saatUcreti*gunlukMesai)+" maas alir");
    }
    protected void ozelSigorta(){
        System.out.println("Memurlar %60 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {

        CMemur mmr1=new CMemur();

        System.out.println(mmr1.gunlukMesai);//9
        System.out.println(mmr1.saatUcreti);//12
        mmr1.maas();//Memurlar : 3240 maas alir
        mmr1.ozelSigorta();//Memurlar %60 indirimli ozel sigorta yaptirabilir
        mmr1.sigorta();//Tum personelimize sigorta yapilir

        System.out.println(mmr1.isim);
        System.out.println(mmr1.soyisim);
        System.out.println(mmr1.departman);
           /*
        Her ne kadar Memur class'inin icinde olsak da
        olusturdugumuz obje Muhasebe class'indan
        cunku data turu ve constructor BMuhasebe
        String str="Murat";
        ArrayList<Integer> list=new ArrayList<>();
        Integer sayi=20;
        BMuhasebe class'i da obje olusturulabilen bir class'dir yanidata turudur
    */

        BMuhasebe mhsb1=new BMuhasebe();
        //OBJE OLUSTURDUGUMUZ HER CLASS BİR DATA TYPE'DİR
        //mhsb1 variable'nin data turu BMuhasebe'dir
;
        System.out.println(mhsb1.gunlukMesai);//8
        System.out.println(mhsb1.saatUcreti);//10
        mhsb1.maas();//Personel minimum : 2400 maas alir
        mhsb1.ozelSigorta();//Isteyen calisanlara %50 indirimli ozel sigorta yapilir
        mhsb1.sigorta();//Tum personelimize sigorta yapilir

        System.out.println(mhsb1.isim);
        System.out.println(mhsb1.soyisim);
        System.out.println(mhsb1.departman);







    }

}
