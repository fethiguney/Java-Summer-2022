package day17_nestedforloop;

public class C01_NestedForLoop {
    public static void main(String[] args) {

        //verilen string deki kullanilan harfleri tekrarsiz olarak
        //yazdirip kelimede kullanilan farkli harf sayisini veren
        //bir method yaziniz

        String input="Java her zaman guzel";

        tekrarsizYap(input);






    }

    private static void tekrarsizYap(String input) {
        String benzersizInput="";
        String islenecekKelime=input.replaceAll("\\W", "");
        System.out.println(islenecekKelime.substring(0,1));
        benzersizInput+=islenecekKelime.substring(0,1);

        for (int i = 1; i <islenecekKelime.length() ; i++) {
            if(!benzersizInput.contains(islenecekKelime.substring(i, i+1))){
                System.out.print(", "+ islenecekKelime.substring(i,i+1));
                benzersizInput+=islenecekKelime.substring(i,i+1);
            }
        }
        System.out.println("");
        System.out.println("inpt: " + input);
        System.out.println("benzersiz input : " + benzersizInput);
        System.out.println("benzersiz kelime sayisi : "+ benzersizInput.length());
        }

    }

