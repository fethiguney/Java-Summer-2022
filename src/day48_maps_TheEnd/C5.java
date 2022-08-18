package day48_maps_TheEnd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C5 {
    public static void main(String[] args) {


        Map<Integer, String> map1=new HashMap<>();
        map1.put(101, "Ali, Can, JDev");
        map1.put(102, "Enes, Cem, Tester");
        map1.put(103, "Taha, Emre, JDev");

        System.out.println(javaBilenler(map1, "JDev"));

    }

    public static List<String> javaBilenler(Map<Integer, String> map1, String str) {
        List<String> javacılar=new ArrayList<>();
        for (String each: map1.values()) {
            String [] arr=each.split(", ");
            if (arr[2].equalsIgnoreCase(str)) {
                javacılar.add(arr [0]+" "+arr [1]);
            }
        }
        return javacılar;
    }
}
