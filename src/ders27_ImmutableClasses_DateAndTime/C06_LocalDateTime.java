package ders27_ImmutableClasses_DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class C06_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime zaman= LocalDateTime.now();
        System.out.println(zaman); // 2022-10-29T19:30:04.668394400

        System.out.println(zaman.getDayOfYear());// 302
    }
}
