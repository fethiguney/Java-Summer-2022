package day26_constructor;

public class Araba {

    public String marka="Marka belirtilmedi";
    public String model="Model belirtilmedi";
    public int yil;
    public int fiyat;

    String yakit="Yakit turu belirtilmedi";
    /*
       biz herhangi bir constructor olusturdugumuzda
       Java default constructor'i siler
       eger biz projemizde bir sorun yasanmasini istemiyorsak
       mutlaka default constructor yerine
       parametresiz bir constructor olusturmaliyiz
        */
    public Araba () {

    }

    public Araba(String markaR, String modelR, int yilR, int fiyatR, String yakitR) {
        marka=markaR;
        model=modelR;
        yil=yilR;
        fiyat=fiyatR;
        yakit=yakitR;
    }

    public Araba(String markaK, String modelK, int yilK, int fiyatK, String yakitK, String vitesK) {


        marka=markaK;
        model=modelK;
        yil=yilK;
        fiyat=fiyatK;
        yakit=yakitK;

    }


    public void benzinliArac(){
        System.out.println("Bu arac benzinli motora sahiptir");
    }

    public void maxHiz(int hiz){
        System.out.println("Bu araba max " + hiz + " km hiz yapar" );
    }
}
