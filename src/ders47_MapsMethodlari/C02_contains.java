package ders47_MapsMethodlari;

import ders44_Maps.MapDepo;

import java.util.Map;

public class C02_contains {

    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap= MapDepo.ornekMapOlustur();

        System.out.println(ogrenciMap);
        /*
        {101=Ali-Can-10-H-MF,
        102=Veli-Cem-11-H-Soz,
        103=Ali-Cem-11-H-TM,
        104=Ayse-Can-10-H-MF,
        105=Ayse-Cem-11-H-TM,
        106=Fatma-Han-10-K-Soz}
         */

        System.out.println(ogrenciMap.containsKey(105)); // true
        System.out.println(ogrenciMap.containsKey(111)); // false

        System.out.println(ogrenciMap.containsValue("10")); // false
        System.out.println(ogrenciMap.containsValue("Veli-Cem-11-H-Soz")); // true
        System.out.println(ogrenciMap.containsValue("Veli-Cem-11-H-Soy")); // false



        /*
        containsValue("arananDeger") value'lerin icerisinde bir bolumu aramaz
        value'su butun olarak aranandDeger olan var mi diye bakar
         */



    }
}
