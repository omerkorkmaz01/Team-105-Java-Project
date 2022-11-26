package ders45_Maps;

import ders44_Maps.MapDepo;

import java.sql.SQLOutput;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C02_Maps {
    public static void main(String[] args) {

        // ogrenciler map'inde subsei H olan ogrencilerin isim soyisim
        // ve siniflarini yazdiralim

        Map<Integer,String> ogrenciMap = MapDepo.ornekMapOlustur();
        // {101=Ali-Can-10-H-MF, 102=Veli-Cem-11-H-Soz,
        // 103=Ali-Cem-11-H-TM, 104=Ayse-Can-10-H-MF,
        // 105=Ayse-Cem-11-H-TM, 106=Fatma-Han-10-K-Soz}

        Set<Integer> ogrenciKeySet=ogrenciMap.keySet(); // Bir map'deki key'leri Set olarak dondurur
        // [101, 102, 103, 104, 105, 106]

        Collection<String > OgrenciValueCollection =ogrenciMap.values(); // Bir map'deki tum value'leri Collection olarak dondurur

        System.out.println(OgrenciValueCollection);
        // [Ali-Can-10-H-MF, Veli-Cem-11-H-Soz,
        // Ali-Cem-11-H-TM, Ayse-Can-10-H-MF,
        // Ayse-Cem-11-H-TM, Fatma-Han-10-K-Soz]

        // Normalde bilgiler arasına Java "," kullanir
        // bizde virgul kullanabiliriz
        // Ancak bu durumda value Collection'inin kac elemanli olduguna dikkat etmemiz gerekir
        // virgulle ayrilmis cok fazla element olabilir
        // Fakat Value'lerin bir butun olarak TEK BIR STRING oldugunu unutmamaliyiz

        // [Ali,Can,10,H,MF, Veli,Cem,11,H,Soz, Ali,Cem,11,H,TM, Ayse,Can,10,H,MF, Ayse,Cem,11,H,MF, Fatma,Han,10,K,Soz]

        System.out.println(OgrenciValueCollection.size()); // 6


    }
}
