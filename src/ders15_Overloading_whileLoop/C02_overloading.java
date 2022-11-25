package ders15_Overloading_whileLoop;

public class C02_overloading {

    public static void main(String[] args) {

        // bir class'da ayni isim ve ayni singature sahip iki method sahip olmaz

    /*
    meethod overloading olan class'larda Java hangi method'un calisacagina
    su sekil kara verir

    1- once method ismine bakar
    2-argument ve parametre uyumuna bakar
    3- argument ve parametre uyumuna bakar
    4- minumum casting
     */

        carpim(3,5); // method call sirasinda method parantezine yazilanlara arguement denir
        carpim(3.4,2); // double - Integer iki sayinin carpimi: 6.8

    }
    public static void carpim(int sayi1, int sayi2) { // carpim int int

        System.out.println("iki integer sayinin carpimi: " + sayi1 * sayi2);

    }

    public static void carpim(int sayi3, int sayi4, int sayi5) { // carpim int int int

        System.out.println("uc integer sayinin carpimi: " + sayi3 * sayi4 * sayi5);

    }

    public static void carpim(double sayi1, int sayi2) { // carpim double int

        System.out.println("double - Integer iki sayinin carpimi: " + sayi1 * sayi2);

    }

    public static void carpim(int sayi1, double sayi2) { // carpim int double

        System.out.println("Integer - double iki sayinin carpimi: " + sayi1 * sayi2);

    }

    public static void carpim(double sayi1, double sayi2) { // carpim doubledouble

        System.out.println("iki double sayinin carpimi: " + sayi1 * sayi2);

    }
}