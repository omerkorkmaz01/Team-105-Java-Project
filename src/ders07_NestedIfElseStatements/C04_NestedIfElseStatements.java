package ders07_NestedIfElseStatements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C04_NestedIfElseStatements {
    public static void main(String[] args) {

        // SORU-1 Kullanicidan cinsiyetini ve yasini alin, kadin 60 yas ve uzeri
        // Erkek 65 yas ve uzeri emekli olabilir
        // Cinsiyet ve yasini dikkate alarak
        // "Emekli olabilirsin" veya "Emekli olmak icin.. yil daha calisman gerekir" yazdirin

        // ana degisken yas olsun

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        double yas= scan.nextInt();

        System.out.println("lutfen cinsiyeti giriniz E/K");
        char cinsiyet=scan.next().charAt(0);

        if (yas<15) {
            System.out.println("hatali yas girisi");
        }else if (yas<60) {
            //emekli olamaz, calismasi gereken sure cinsiyete bagli
            System.out.println("emekli olamazsin");
            if (cinsiyet=='K' || cinsiyet=='K') {
                System.out.println("daha" + (60 - yas) + "sene calismalisin");
            } else if (cinsiyet=='E' || cinsiyet=='e') {
                System.out.println("daha" + (65 - yas) + "sene calismalisin");
            }else{
                System.out.println("hatali cinsiyet girisi");

            }

        } else if (yas<65) {
            //kadin ise emekli olabilir,erkek calismasi lazim
            if (cinsiyet=='K' || cinsiyet=='k'){
                System.out.println("emekli olabilirisin");
            } else if (cinsiyet=='E' || cinsiyet=='e') {
                System.out.println("emekli olmak icin" + (65 - yas) + "yil daha calismalisin");
            }else {
                System.out.println("hatali cinsiyet girisi");
            }


        }else { //65'den buyukse
            System.out.println("emekli olabilirsin");




            
        }


    }

    }

