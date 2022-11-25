package ders07_NestedIfElseStatements;

public class C03_NestedIfElseStatements {
    public static void main(String[] args) {

        // SORU-1 Kullanicidan cinsiyetini ve yasini alin, kadin 60 yas ve uzeri
        // Erkek 65 yas ve uzeri emekli olabilir
        // Cinsiyet ve yasini dikkate alarak
        // "Emekli olabilirsin" veya "Emekli olmak icin.. yil daha calisman gerekir" yazdirin

        char cinsiyet = 'K' ;
        int yas = 56 ;

        //nested if-else seklinde kullanim icin once ana degiskeni secip
        //ona gore ona yapiyi olusturalim
        //cinsiyet ana degisken olsun

        if (cinsiyet == 'k' || cinsiyet == 'K') {
            //giriş yapilan deger bir kadina ait demektir
            if (yas < 15) {
                System.out.println("hatali yas girisi");
            } else if (yas < 60) {
                System.out.println("emekli olamazsin, daha" + (60 - yas) + "yil calismalisin");
            } else {
                System.out.println("emekli olabilirsin");
            }

        } else if (cinsiyet == 'e' || cinsiyet == 'E') {
            //giriş yapilan  deger bir erkege ait
            if (yas < 15) {
                System.out.println("hatali yas girisi");
            } else if (yas < 65) {
                System.out.println("emekli olamazsin, daha" + (65 - yas) + "yil calismalisin");
            } else {
                System.out.println("emekli olabilirsin");
            }

        } else {
            System.out.println("yanlis cinsiyet girisi");
        }


    }
}



