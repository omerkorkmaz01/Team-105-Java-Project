package ders45_Maps;

import ders44_Maps.MapDepo;

import java.util.List;
import java.util.Map;

public class C04_Maps {

    public static void main(String[] args) {

        // Ogrenci map'inde numarası verilen sayilarin arasinda(sinirlar dahil) olan ogrencilerin
        // Isim soyisim ve Bolumlerini list olarak bize donduren method olusturun

         /*
          [
          Ali-Can-10-H-MF,
          Veli-Cem-11-M-Soz,
          Ali-Cem-11-H-TM,
          Ayse-Can-10-H-MF,
          Ayse-Cem-11-M-TM,
          Fatma-Han-10-K-Soz
          ]
         */

        Map<Integer, String> ogrenciMap= MapDepo.ornekMapOlustur();

        ogrenciMap.put(107,"Tugay-Cil-12-K-MF");
        ogrenciMap.put(103,"Hikmet-Saglam-11-M-Soz");
        int basNo=102;
        int bitNo=107;
        List<String> isimListesi= MapDepo.numaraDegerineGoreListeOlustur(ogrenciMap,basNo,bitNo);

        System.out.println(isimListesi);
        // [Veli Cem Soz, Hikmet Saglam Soz, Ayse Can MF, Ayse Cem TM, Fatma Han Soz, Tugay Cil MF]
    }
}
