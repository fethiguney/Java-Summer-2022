package day30_Immutable_date;

import java.time.LocalDate;
import java.time.Period;

public class C07_Period {
    public static void main(String[] args) {

        //iki tarih arasindaki sureyi bulma

        LocalDate tarih1=LocalDate.of(1986,4,25);
        LocalDate bugun=LocalDate.now();

        Period period=Period.between(bugun,tarih1);
        System.out.println(period);//36Y-2M-28D


    }
}
