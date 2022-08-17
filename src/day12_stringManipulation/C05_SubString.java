package day12_stringManipulation;

public class C05_SubString {
    public static void main(String[] args) {

       //4 harfli bir kelimeyi tersten yazdirin

        String input ="Veli";

        String tersInput=input.substring(3)+
                        input.substring(2,3)+
                        input.substring(1,2)+
                        input.substring(0,1);
        System.out.println(tersInput);


    }
}
