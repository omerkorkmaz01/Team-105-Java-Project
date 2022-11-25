package ders29_StringBuilder_AccessModifier;

import javax.crypto.spec.PSource;

public class C02_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder("Java candir");
        System.out.println(sb1.reverse());
        //ridnac avaJ
        System.out.println("Tersini yazdirdiktan sonra :  " + sb1);
        //Tersini yazdirdiktan sonra :  ridnac avaJ
        System.out.println(sb1.insert(0, "."));
        //.ridnac avaJ
        System.out.println(sb1);
        //.ridnac avaJ
        System.out.println(sb1.reverse());
        //Java candir.

        StringBuilder sb2= new StringBuilder("Java Candir");
        String str="Java Candir.";
        System.out.println(sb1==sb2);
        // false icerik ayni olsa bile false verir
        System.out.println(sb1==sb1);
        // true sadece kendisi ile karsilastirilirsa true verir

        // System.out.println(sb1==str); farkli iki data turu ile karsılastirilamaz

        System.out.println(sb1.equals(sb2)); // false
        System.out.println(sb1.equals(sb1)); // true
        System.out.println(sb1.equals(str)); // false CTE vermez fakat sonuc her zaman false'dru

        System.out.println(sb1.compareTo(sb2)); // 0
        StringBuilder sb3= new StringBuilder("Java Candir");
        System.out.println(sb1.compareTo(sb3)); // 2

        /*
        Compareto sadece tamamen ayni mi yoksa farkli mi sorusunun cevabini verir
        tamamen aynii ise ==>0 doner
        farklilik varsa ==> ilk farkli harfi buldugunda harflerin arasinda kac harf oldugunu verir
         */

    }
}
