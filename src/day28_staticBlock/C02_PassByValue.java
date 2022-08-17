package day28_staticBlock;

public class C02_PassByValue {
    public static void main(String[] args) {

        double satisfiyati=100;

        System.out.println(indirimliFiyat(satisfiyati));//90
        System.out.println(satisfiyati);//100
        // iki farkli method'da satisFiyati isminde variable olabilir
        // Java buna itiraz etmez cunku, scope'lari farklidir.


    }
    public static double indirimliFiyat(double orjinalFiyat) {
        // methodumuz %10 indirim yapip
        // yeni fiyati main methid'a dondursun
        double satisfiyati=orjinalFiyat*0.9;
        return satisfiyati;

    }

}
