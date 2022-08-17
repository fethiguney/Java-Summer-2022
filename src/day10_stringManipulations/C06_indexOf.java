package day10_stringManipulations;

public class C06_indexOf {
    public static void main(String[] args) {


        String str="Java ogrenmek cok guzel";

        //indexOf hem tek tırnak hem çift tırnak icine yazabiliriz

        System.out.println(str.indexOf("cok"));//5
        System.out.println(str.indexOf('w'));//-1

        if (str.indexOf("c")!= -1) {
            System.out.println("str icinde o harfi var");
        } else {
            System.out.println("str icinde o harfi yok");
        }


    }
}
