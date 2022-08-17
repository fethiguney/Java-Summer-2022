package day44_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C04_LinkedList_ListDataTuru {
    public static void main(String[] args) {

        LinkedList<String> l1=new LinkedList<>();


        List<String> l2=new LinkedList<>();

        Queue<String> l3=new LinkedList<>();

        Deque<String> l4=new LinkedList<>();


        l2.add("Berk");
        l2.add("Done");
        l2.add("Enes");
        l2.add("Ayse");

        System.out.println(l2);//[Berk, Done, Enes, Ayse]
        System.out.println(l2.remove(3));//Ayse
        System.out.println(l2.remove("Kemal"));//False


        l1.add("Berk");
        l1.add("Ismail");

        System.out.println(l2.retainAll(l1));

        System.out.println(l2);

        System.out.println(l2.hashCode());

        l2.add("Fatih");
        System.out.println(l2.hashCode());


    }
}
