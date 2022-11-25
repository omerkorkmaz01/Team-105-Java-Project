package ders27_ImmutableClasses_DateAndTime;

import java.time.LocalTime;
import java.util.Locale;

public class C05_LocalTime {

    public static void main(String[] args) {

        LocalTime saat=LocalTime.now(); // 19:21:20.320522200,19:22:01.409790600
        System.out.println(saat);

        LocalTime saat2=LocalTime.of(16,10,20);
        System.out.println(saat.compareTo(saat2)); // 1

        System.out.println(saat2.withNano(45565)); // 16:10:20.000045565
    }
}
