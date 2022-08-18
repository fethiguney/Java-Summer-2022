package lambda_functional_programming01;

import java.util.ArrayList;
import java.util.List;

public class Fp1_tekrar {
    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);

        listElemanlariniYazdir(liste);
        System.out.println();
        ciftElemanlariYazdir(liste);
        System.out.println();
        tekElemanlarinKareleriniYazdir(liste);
        System.out.println();
        tekElemanlarinKupleriniYazdir(liste);


    }

    /*
    Listin elementlerini aralarinda bosluk birakarak yazdiran bir method olusturun
     */

    public static void listElemanlariniYazdir(List<Integer> liste) {
        liste.stream().forEach(t-> System.out.print(t+" "));
    }

    /*
    Listin cift elemanlarini aralarinda bosluk birakarak yazdiran bir method olusturun
     */
    public static void ciftElemanlariYazdir(List<Integer> liste ) {
        liste.stream().filter(t-> t%2==0).forEach(t-> System.out.print(t+" "));
    }

    /*
    Listin tek elemanlarinin karelerini aralarinda bosluk birakarak yazdiran bir method olusturun
     */
    public static void tekElemanlarinKareleriniYazdir(List<Integer> liste) {
        liste.stream().filter(t-> t%2!=0).map(t-> t*t).forEach(t-> System.out.print(t+" "));
    }

        /*
        Listin tek elemanlarini tekrarsiz olarak alin ve kuplerini yazdirin
         */
    public static void tekElemanlarinKupleriniYazdir(List<Integer> liste) {
        liste.stream().distinct().filter(t-> t%2!=0).map(t-> t*t*t).forEach(t-> System.out.print(t+" "));
    }

    /*
    Listin cif elamanlarini tekrarsiz olarak alin ve karelerinin toplamini bulun
     */

    public static void ciftElemanlarinKarleriToplaminiBul (List<Integer> liste) {
       int karelerToplami= liste.stream().distinct().filter(t-> t%2==0).map(t-> t*t).reduce(0,(t, u)-> t+u );
        System.out.println(karelerToplami);
    }
}
