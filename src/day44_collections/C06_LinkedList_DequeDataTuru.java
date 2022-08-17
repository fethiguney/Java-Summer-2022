package day44_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C06_LinkedList_DequeDataTuru {
    public static void main(String[] args) {

        Deque<String> l4=new LinkedList<>();
        l4.add("Cavidan");
        l4.add("Mesut");
        l4.add("Selim");
        l4.add("Tevfik");
        l4.add("Selim");

        l4.removeLastOccurrence("Selim");
        System.out.println(l4);//[Cavidan, Mesut, Selim, Tevfik]

        l4.pop();
// Deque iki tarafli queue demektir,
// dolayisiyla her method'un first ve last'i var



    }
}
