package day48_maps_TheEnd;

import java.util.HashMap;

public class C4 {
    public static void main(String[] args) {

        System.out.println(findNumberOfCharacters("Helllooo Wooorllddd"));


    }

    public static HashMap<String, Integer> findNumberOfCharacters (String str) {
        HashMap<String, Integer> charactersMap=new HashMap<>();
        String [] arr=str.replaceAll("\\W", "").toLowerCase().split("");
        for (String w: arr) {
            if (!charactersMap.containsKey(w)) {
                charactersMap.put(w, 1);
            }  else {
                charactersMap.put(w, charactersMap.get(w)+1);
            }
        }
        return charactersMap;
    }
}
