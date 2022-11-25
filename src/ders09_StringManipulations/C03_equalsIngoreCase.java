package ders09_StringManipulations;

public class C03_equalsIngoreCase {
    public static void main(String[] args) {

        String str1="ALİ";
        String str2="ali";
        String str3="ALI";

        System.out.println(str1.equals(str2));//false
        System.out.println(str1.equals(str3));//false

        System.out.println(str1.equalsIgnoreCase(str2)); //true
        System.out.println(str1.equalsIgnoreCase(str3)); //true

        System.out.println(str1.equalsIgnoreCase("Ali ")); // false

        /*
        equalsIsIngoreCase ayni metnin buyuk kucuk harf kullanilarak olusturulan
        farkli yazimlarini birbirine esit olarak kabul eder

        yani equalsIsIngoreCase icin ali, ALI, ALi, ALI, aLI, alI birbirine esittir

        ama kelimede farklilik varsa bunlari tolere etmez

        a li ile ali birbirine esit degildir
        ali ile ALI. birbirine esit degildir
         */

    }
}
