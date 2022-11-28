package ders47_MapsMethodlari;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C06_TreeMap {

    public static void main(String[] args) {

        TreeMap<String, Integer> mp1= new TreeMap<>();

        mp1.put("A",5);
        mp1.put("H",3);
        mp1.put("C",7);
        mp1.put("T",3);
        mp1.put("F",8);

        System.out.println(mp1); // {A=5, C=7, F=8, H=3, T=3}

        System.out.println(mp1.higherKey("D")); // F girilen degerden buyuk olan key
        System.out.println(mp1.higherKey("H")); // T
        System.out.println(mp1.higherKey("U")); // null
        System.out.println(mp1.higherEntry("M")); // T=3

        System.out.println(mp1.lowerEntry("G")); // F
        System.out.println(mp1.lowerKey("F")); // C

        System.out.println(mp1.floorKey("D")); // C girilen degere esit veya kucuk olan key
        System.out.println(mp1.floorKey("H")); // H
        System.out.println(mp1.floorEntry("L")); // H=3
        System.out.println(mp1.floorEntry("T")); // T=3

        System.out.println(mp1.ceilingKey("F")); // F girilen degere esit veya buyuk olani verir
        System.out.println(mp1.ceilingKey("B")); // C
        System.out.println(mp1.ceilingEntry("H")); // H=3
        System.out.println(mp1.ceilingEntry("K"));

        System.out.println(mp1.headMap("F"));// {A=5, C=7} girilen deger haric basa kadar olan kismi
        System.out.println(mp1.headMap("K"));// {A=5, C=7, F=8, H=3}
        System.out.println(mp1.headMap("F",true)); // {A=5, C=7, F=8}
        // true dersek girilen deger dahil basa kadar
        System.out.println(mp1.headMap("N",true)); // {A=5, C=7, F=8, H=3}

        System.out.println(mp1.tailMap("F")); // {F=8, H=3, T=3}
        System.out.println(mp1.tailMap("D")); // {F=8, H=3, T=3}
        System.out.println(mp1.tailMap("F", false)); // {H=3, T=3}
        // false dersek girilen deger dahil degil sona kadar

        System.out.println(mp1.descendingMap()); // {T=3, H=3, F=8, C=7, A=5}
        System.out.println(mp1.descendingKeySet()); // [T, H, F, C, A]

        System.out.println(mp1.firstKey()); // A
        System.out.println(mp1.firstEntry()); // A=5

        System.out.println(mp1.lastKey()); // T
        System.out.println(mp1.lastEntry()); // T=3

        System.out.println(mp1.pollFirstEntry()); // A=5 ilk degeri silip bize getiriyor
        System.out.println(mp1); // {C=7, F=8, H=3, T=3}
        System.out.println(mp1.pollLastEntry()); // T=3
        System.out.println(mp1); // {C=7, F=8, H=3}

        System.out.println(mp1.subMap("B","G")); // {C=7, F=8}
        System.out.println(mp1.subMap("C","H")); // {C=7, F=8} baslangic inclusive bitis exclusive
        System.out.println(mp1.subMap("C", false,"H",true)); // {F=8, H=3}
    }
}
