package ders46_Maps;

import ders44_Maps.MapDepo;

import java.util.Map;

public class C03_SoyisimleriBuyukHarfYap {

    public static void main(String[] args) {

        // ogrenci map'indeki soyisimleri buyuk harfe cevirip
        // map'i bize donduren bir method olusturun

        Map<Integer,String> ogrenciMap = MapDepo.ornekMapOlustur();

        ogrenciMap.put(109,"Adem-Demir-11-D-Soz");

        ogrenciMap=MapDepo.soyisimleriBuyukHarfYap(ogrenciMap);

        System.out.println(ogrenciMap);





















    }
}
