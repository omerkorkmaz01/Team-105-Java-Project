package ders45_Maps;

import ders44_Maps.MapDepo;

import java.util.Map;

public class C03_Maps {

    public static void main(String[] args) {

        // ogrenciler map'inde subsei H olan ogrencilerin isim soyisim
        // ve siniflarini yazdiralim

        Map<Integer, String> ogrenciMap = MapDepo.ornekMapOlustur();
         /*
         {101=Ali-Can-10-H-MF, 102=Veli-Cem-11-H-Soz,
         103=Ali-Cem-11-H-TM, 104=Ayse-Can-10-H-MF,
         105=Ayse-Cem-11-H-TM, 106=Fatma-Han-10-K-Soz}
          */

        ogrenciMap.put(107,"Hasan-Yan-12-H-MF");
        ogrenciMap.put(101,"Adem-Fan-12-T-Soz");
        String subeAdi="H";
        MapDepo.subeOgrenciBilgileriniYazdir(ogrenciMap,subeAdi);
    }
}
