package day15_overloading_forLoop;

public class C05_ForLoop {
    public static void main(String[] args) {

        //1'den 5'e kadar olan tam sayilari toplayalim

        int toplam = 0;
        for (int i = 1; i <=5 ; i++) {
            toplam+=i;
        }
        System.out.println("1'den 5'e kadar olan sayilarin toplami : "+ toplam);

        //10 ile 20 arasındaki sayilari toplayin
        toplam = 0;
        for (int i = 10; i <=20 ; i++) {
            toplam+=i;
        }
        System.out.println("10'dan 20'ye kadar olan sayilarin toplami : "+ toplam);

        //30 dahil 50 dahil aradaki çift sayilari toplayin
        toplam = 0;
        for (int i = 30; i <=50 ; i++) {
            if (i%2==0) {
                toplam+=i;
            }
        }
        System.out.println("30-50 arasi çift sayilarin toplami : " + toplam);


        // 1500 ile 1600 (sinirlar dahil) arasinda 7 ile bolunebilen sayilari toplayin
        toplam=0;
        for (int i = 1500; i <=1600 ; i++) {
                if (i%7==0) {
                    toplam+=i;
                }
        }
        System.out.println("1500-1600 arasi yedi ile bolunebilen sayilarin toplam : " + toplam);



    }
}
