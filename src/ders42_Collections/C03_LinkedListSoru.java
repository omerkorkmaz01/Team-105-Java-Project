package ders42_Collections;

import javax.swing.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class C03_LinkedListSoru {

    static List<Double> notListesi= new LinkedList<>();

    public static void main(String[] args) {

        // Soru : Bir ogretmenden ogrencilerin notlarini girmesini isteyin,
        //        not grime islemi bittiginde Q’ya basmalidir.
        //        Not grime islemi bittikten sonra asagidaki sekilde output hazirlayin
        //      not ortalamasi : …..
        //      ogrenci sayisi : …..
        //      ortalama altindaki ogrenci sayisi : ….
        //      ortalamanin 10 puan alt ve ustunde olan ogrenci sayisi : ….

        System.out.println("Oncelikle ogrenci not listesini olusturalim");
        notListesiDegerEkle();

        double notToplami=0;
        double notOrtalamasi;
        int ortalamaAltindakiOgrenciSayisi=0;
        int ortalama10PuanAltUstOgrencisayisi=0;

        for (Double eachNot:notListesi
             ) {
            notToplami+=eachNot;

        }

        notOrtalamasi=notToplami/notListesi.size();

        for (Double eachNot:notListesi
             ) {

            if (eachNot<notOrtalamasi){
                ortalamaAltindakiOgrenciSayisi+=1;
            }
            if (eachNot>notOrtalamasi-10 && eachNot<=notOrtalamasi+10){
                ortalama10PuanAltUstOgrencisayisi += 1;
            }

        }

        System.out.println("Not ortalamasi : " + notOrtalamasi+
                "\nOgrenci sayisi : " + notListesi.size()+
                "\nOrtalama Altindaki Ogrenci Sayisi : " + ortalamaAltindakiOgrenciSayisi+
                "\nOrtalama 10 Puan Alt Ust Ogrenci Sayisi : " + ortalama10PuanAltUstOgrencisayisi);

    }
    public static void notListesiDegerEkle(){

        Scanner scan= new Scanner(System.in);
        double not;
        boolean loopDevam=true;

        while (loopDevam){

            try {
                System.out.println("Lutfen ogrenci notlarinş giriniz \nBitirmek icin Q'ya basiniz");
                not=scan.nextDouble();
                notListesi.add(not);
            } catch (Exception e) {
                String girilenDEger= scan.nextLine();

                if (girilenDEger.equalsIgnoreCase("Q")){
                    loopDevam=false;
                    break;
                }else {
                    System.out.println("Not icin sayisal degerler girmelisiniz");
                }
            }
        }
    }
}
