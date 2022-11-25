package ders27_ImmutableClasses_DateAndTime;

import java.time.LocalDate;
import java.time.Period;

public class C07_PeriodOf {
    public static void main(String[] args) {

        // dogumunuzdan bugune ne kadar zaman gecti

        LocalDate bugun=LocalDate.now();
        LocalDate dogumGunu=LocalDate.of(2004,05,30);

        Period gecenSure=Period.between(dogumGunu,bugun);

        System.out.println(gecenSure); // P=18Y-4M-29D

        System.out.println(gecenSure.getDays()); // 29
        System.out.println(gecenSure.getMonths()); // 4
        System.out.println(gecenSure.getYears()); // 18
    }
}
