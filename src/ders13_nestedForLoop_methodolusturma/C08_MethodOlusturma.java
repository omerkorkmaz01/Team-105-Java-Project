package ders13_nestedForLoop_methodolusturma;

import java.util.Scanner;

public class C08_MethodOlusturma {

    public static void main(String[] args) {

        /*
        kullanicidan 2 sayi alip, bunlarin toplamini yazdiran bir method olusturun
         */


        istetoplayazdir();

        istetoplayazdir();

    }

    public static void istetoplayazdir(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");

        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        System.out.println("girilen sayilarin toplami: " + (sayi1+sayi2));


    }
}
