package day44_collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class C05_LinkedList_QueueDataTuru {
    public static void main(String[] args) {


        Queue<String> l3=new LinkedList<>();

        l3.add("Adem");
        l3.add("Zeynep");
        l3.add("HPolat");
        l3.add("Kadir");

        System.out.println(l3);//[Adem, Zeynep, HPolat, Kadir]

        System.out.println(l3.remove());//Adem

        System.out.println(l3);//[Zeynep, HPolat, Kadir]

        System.out.println(l3.remove("HPolat"));//true

        System.out.println(l3);//[Zeynep, Kadir]

        System.out.println(l3.element());//Zeynep

        System.out.println(l3.peek());//Zeynep


        Queue <String> l4=new LinkedList<>();

        System.out.println(l4.peek());//null

        l3.offer("Ahmet");
        System.out.println(l3);

        System.out.println(l3.poll());
        System.out.println(l3);

    }
}
