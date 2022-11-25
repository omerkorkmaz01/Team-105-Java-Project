package ders14_methodOlusturma;

import java.util.Scanner;

public class C01_Carpim {

    //main method icerisinde kullanicidan iki sayi alin
    // bu iki sayiyi parametre olarak kabul edip, carpinlerini main method'a donduren bir method olusturun

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();
        carpimMethodu(sayi1,sayi2); //15.0

        double carpimSonucu = carpimMethodu(6,2); //12.0

        }



    public static double carpimMethodu(double sayi1, double sayi2) {
        System.out.println("carpim method'u calisti");
        return sayi1 * sayi2;


    }
}

