package day11_stringManipulations;

public class C01_IndexOf {
    public static void main(String[] args) {


        String str="Java ogrenmek cok guzel";

        System.out.println(str.indexOf("g"));//6
        System.out.println(str.indexOf("j"));//-1
        System.out.println(str.indexOf("mek"));//10

        //eger istedigimiz index sonrasını kontrol etmek
        //istersek ayni method'u iki parametreli kullanabiliriz

        int firstE=str.indexOf("e");
        int secondE=str.indexOf("e",firstE+1);
        int thirdE=str.indexOf("e",secondE+1);
        int fourthE=str.indexOf("e", thirdE+1);

        System.out.println("fourthE = " + fourthE);

        System.out.println("First E = "+firstE+", "+"SecondE = "+secondE+", "+"ThirdE = "+thirdE);



        System.out.println(str.indexOf("g",(6+1))); // yazilan index'den baslar

        // yukaridaki str'da 2. ve 3. e'nin indexlerini bulun
        // 2.ci e'yi bulabilmek icin 1.e'nin index'ine ihtiyacim var

        int ilke=str.indexOf("e");
        int ikincie= str.indexOf("e",ilke+1);

        // eger 2. e varsa 3.e'nin olup olmadigini
        // ve varsa index'ini yazdiralim

        if (ikincie==-1){
            System.out.println("verilen str'da 2.e yok");
        }else{
            int ucuncue=str.indexOf("e",ikincie+1);
            if (ucuncue==-1){
                System.out.println("verilen str'da 3. e yok");
            } else {
                System.out.println("verilen str'daki 3.e'nin index'i : " + ucuncue);
            }
        }

    }
}
