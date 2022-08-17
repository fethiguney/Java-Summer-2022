package day38_exceptions;

public class C01_Exceptions {

    public static void main(String[] args) {

        /*
          Bir sorunla karsilasmayi beklediginiz noktalarda
          if else ile sorunu yakalayip
          onunla ilgili cozum uretebilirsiniz

          ama sorunu her zaman if else ile cozemeyecegimizden
          Java try-catch block'lari olusturmustur.
         */

        int a = 100;
        int b = 50;

       int sayac=1;

        while (sayac<1000) {

            if (b==0) {
                System.out.println("payda sifir oldugundan bolme olmaz");
            } else {
                System.out.println(a/b);
            }

            b--;
            sayac++;
        }







    }
}
