package day30_Immutable_date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class C03_Date {
    public static void main(String[] args) {


        LocalDate tarih= LocalDate.now();

        System.out.println(tarih);

        System.out.println(tarih.getDayOfWeek());
        System.out.println(tarih.getMonth());

        LocalDate tarih2= LocalDate.of(2001,5,15);
        System.out.println(tarih2);

        LocalDate tarih3=LocalDate.of(1990, Month.JANUARY, 10 );
        System.out.println(tarih3);

        /*
        iki farkli dogum gunu girildiginde hangisinde doganin
        daha buyuk oldugunu bulunuz
        tarih2 ve tarih3 icin yapalim
         */

        if (tarih2.isAfter(tarih3)) {
            System.out.println(tarih3 +" tarihinde dogan daha buyuk");
        } else if (tarih2.isBefore(tarih3)) {
            System.out.println(tarih2 +" tarihinde dogan daha buyuk");
        } else {
            System.out.println("iki tarih birbiriyle ayni");
        }
    }

}

