package ders26_passByvalue_ImmutableClasses;

public class C07_ImmutableString {

    public static void main(String[] args) {

        String str= "Java Candir";

        str=str.toUpperCase();
        System.out.println(str); // JAVA CANDIR

        str=str.toLowerCase();
        System.out.println(str); // java candir

        /*
        Immutable class'lardan olusturulan bir objenin degeri DEGISTIRILEMEZ
        Eger atama yaparsak java degerini degistirmez
        bunun yerine yeni bir obje olusturur
        ve bu yeni objeye yeni atadiginiz degeri atar

        eski obje bosa cikar garbage collector tarafindan silinmeyi bekler

         */

    }
}
