package ders47_MapsMethodlari;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C04_Soru {

    public static void main(String[] args) {

        // verilen bir cumlede kullanilan karakterleri
        // ve kacar kere kullanildigini yazdirin

        String str="Javayi balonu patlatmadan bitirelim";
        // J=1, a=7, v=1, y=1.........

        String[] strArr= str.split("");
        // [J, a, v, a, y, i,  , b, a, l, o, n, u,  , p, a, t, l, a, t, m, a, d, a, n,  , b, i, t, i, r, e, l, i, m]

        Map<String ,Integer> kullanimMiktarlariMap= new TreeMap<>();

        for (int i = 0; i < strArr.length; i++) {

            // ele aldigim element map'de varsa kullanim miktarini 1 artir
            kullanimMiktarlariMap.computeIfPresent(strArr[i],(k,v) -> v+1);

            // ele aldigim element map'de yoksa kullanim miktari 1 olarak map'e ekleyecegim
            kullanimMiktarlariMap.putIfAbsent(strArr[i],1);

        }

        System.out.print(kullanimMiktarlariMap);

    }
}
