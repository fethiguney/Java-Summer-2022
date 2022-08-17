package day15_overloading_forLoop;

public class C06_StringTerseCevirme {
    public static void main(String[] args) {

        //input olarak verilen String i terse cevirip yazdiran bir method olusturun

        String input="Java kos Java";
        System.out.println(input.substring(input.length()-1));

       terstenYazdir(input);


    }

    public static void terstenYazdir(String input) {
        String terstenInput=input.substring(input.length()-1);
        for (int i = input.length()-2; i >=0 ; i--) {
            terstenInput+=input.substring(i,i+1);
        }
        System.out.println("Input tersten yazilisi : "+terstenInput);

    }


}
