package day11_stringManipulations;

public class C06_EndsWith {
    public static void main(String[] args) {


        //   Soru 1) Kullanicidan email adresini girmesini isteyin,
        //   mail @gmail.com icermiyorsa  "lutfen gmail adresi giriniz",
        //   @gmail.com ile bitiyorsa  "Email adresiniz kaydedildi " ,
        //   @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin




        String email="fethiguneyy@gmail.com";

        if (!email.contains("@gmail")) {
            System.out.println("gmail adresinizi giriniz");
        } else if (email.endsWith("@gmail.com")) {
            System.out.println("email adresiniz kaydedildi");
        } else {
            System.out.println("lutfen yazimi kontrol edin");
        }
    }
}
