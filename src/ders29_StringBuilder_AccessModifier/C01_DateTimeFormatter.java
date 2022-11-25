package ders29_StringBuilder_AccessModifier;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class C01_DateTimeFormatter{

    public static void main(String[] args) {

        LocalDateTime zaman= LocalDateTime.now();
        System.out.println(zaman); // 2022-11-05T18:50:43.560545

        DateTimeFormatter dtf1= DateTimeFormatter.ofPattern("dd/MM/YYYY");
        System.out.println(zaman.format(dtf1));// 05/11/2022

        DateTimeFormatter dtf2= DateTimeFormatter.ofPattern("d:MMM:YY");
        System.out.println(zaman.format(dtf2)); // 5:Kas:22

        DateTimeFormatter dtf3= DateTimeFormatter.ofPattern("d.MMMM.YYYY.EEEE");
        System.out.println(zaman.format(dtf3));// 5.Kasım.2022.Cumartesi

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println(zaman.format(dtf4)); // 07:02 ÖS
    }
}
