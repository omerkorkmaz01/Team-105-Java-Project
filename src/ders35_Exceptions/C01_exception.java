package ders35_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_exception {
    public static void main(String[] args) {

        // kullanicidan bir tam sayi alin ,
        // ve sayinin karesini yazdiran
        // kullanici ondalikli sayi girerse kullaniciya uyari yazisi yazdirip
        // tekrar sayi isteyin bir method olusturun

        sayiAlKaresiniYazdir();


    }

    public static void sayiAlKaresiniYazdir(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz ");


        int girilenSayi= 0;
        try {
            girilenSayi = scan.nextInt();
            /*
             eger ondalikli sayi girilirse 27. satir exception verecek
             ve catch bloguna kadar olan diger kodlar calismayack
             catch blogu hata yakalandıgında ne yapmasini istedgimmiz yerdir

             bu soruda istenen exception olustugunda yeniden deger istenmesi
             biz de exception olustugunda yeniden method'u calistirdik

             hata olmazsa catch blogu devreye girmez ve kod normal bir sekilde biter
             */
            System.out.print("Giridiginiz sayinin karesi : ");
            System.out.println(girilenSayi*girilenSayi);
        } catch (InputMismatchException e) {

            System.out.println("Sana tamsayi degeri gir dedik :) ");
            sayiAlKaresiniYazdir();


        }




    }

}

