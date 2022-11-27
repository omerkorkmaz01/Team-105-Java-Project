package ders44_Maps;

import java.util.*;

public class MapDepo {

    // ogrenci map olusturup bize donduren bir method olusturun

    public static Map<Integer, String> ornekMapOlustur(){

    Map<Integer, String> ogrenciMap= new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-10-H-MF");
        ogrenciMap.put(102,"Veli-Cem-11-H-Soz");
        ogrenciMap.put(103,"Ali-Cem-11-H-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Ayse-Cem-11-H-TM");
        ogrenciMap.put(106,"Fatma-Han-10-K-Soz");

        return ogrenciMap;
    }
    public static String isimSoyisimDondur(Map<Integer, String> ogrenciMap, int ogrenciKey) {


        String ogrenciValue= ogrenciMap.get(ogrenciKey); // "Ayse-Cem-11-H-TM"

        String[] valueArr=ogrenciValue.split("-"); // [Ayse, Cem, 11, H, TM]

        String isimSoyisim=valueArr[0]+" "+valueArr[1]; // Ayse Cem

        return isimSoyisim;

    }

    public static Map<Integer, String> ogrenciyeYeniSubeAta(Map<Integer, String> ogrenciMap, int ogrenciKey,String yeniSube) {
        // ogrenci key map'de var mı?

        if (ogrenciMap.containsKey(ogrenciKey)) {
            // istenen Key varsa, update edip yeni map'i dondurecegiz
            String istenenKeyinValuesu= ogrenciMap.get(ogrenciKey); // Ayse-Can-10-H-MF
            String [] istenenKeyValueArr= istenenKeyinValuesu.split("-"); // [Ayse, Can, 10, H, Mf]
            // yeni sube degeri atayalim
            istenenKeyValueArr[3]=yeniSube; // [Ayse, Can, 10, K, Mf]

            String istenenKeyinYeniValuesu= istenenKeyValueArr[0]+"-"+
                                            istenenKeyValueArr[1]+"-"+
                                            istenenKeyValueArr[2]+"-"+
                                            istenenKeyValueArr[3]+"-"+
                                            istenenKeyValueArr[4];
            ogrenciMap.put(ogrenciKey,istenenKeyinYeniValuesu);
        }
        return ogrenciMap;
    }
    public static void subeOgrenciBilgileriniYazdir(Map<Integer, String> ogrenciMap, String subeAdi) {

        Collection<String> valueCollection = ogrenciMap.values();
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
        System.out.println("Isim      Soyisim     Sinif");
        System.out.println("===========================");
        for (String eachValue:valueCollection
        ) {
            // value'yu parcalarina ayir
            String[] valueArr=eachValue.split("-"); // [Ayse, Can, 10, H, MF]

            // sube ismini kontrol et, istenen sube ise isim,soyisim,sinif yazdir
            if (valueArr[3].equals(subeAdi)){

                System.out.println(valueArr[0] + " " + valueArr[1] + " " + valueArr[2]);
            }
        }
    }
    public static List<String> numaraDegerineGoreListeOlustur(Map<Integer, String> ogrenciMap, int basNo, int bitNo) {

        // hem Key, hem de value lazim oldugundan keySet'i olusturduk
        // sonra o key uzerinden value'yu map'den aldik
        Set<Integer> ogrenciKeySeti= ogrenciMap.keySet();

        // dondurecegimiz listeyi olusturalim
        List<String> isimListesi= new ArrayList<>();

        // key degerlerini tek tek elden gecirip
        // istenen aralikta olanlari bulalim

        String value;
        String[] valueArr;
        String istenenIsim;
        for (Integer eachKey:ogrenciKeySeti
             ) {
            if (basNo<=eachKey && eachKey<=bitNo){
                // buraya verilen sinir degerlerine uyan
                // eachKey'ler gelecek

                // sinira uygun key'in value'sunu alalim
                value=ogrenciMap.get(eachKey); // Ayse-Can-10-H-MF,
                // value'u parcalara ayiralim
                valueArr=value.split("-"); // [Ayse, Can, 10, H, MF]
                // value array'inden listeye eklenecek bilgileri alalim
                istenenIsim=valueArr[0] + " " + valueArr[1] + " " + valueArr[4];
                //istenen ismi olusturduk bunu listeye ekleyelim
                isimListesi.add(istenenIsim);

            }
        }

        return isimListesi;

    }

    public static void numaraIsimSoyisimYazdir(Map<Integer, String> ogrenciMap) {

        Set<Integer> keySeti=ogrenciMap.keySet();
        String value;
        String[] valueArr;

        for (Integer eachKey: keySeti
             ) {
            value=ogrenciMap.get(eachKey);
            valueArr= value.split("-"); // [Ayse-Can-10-H-MF]

            System.out.println(eachKey+ " " + valueArr[0] + " " + valueArr[1]);



        }
    }

    public static Set<String> siraliOgrenciListesi(Map<Integer, String> ogrenciMap) {

        Set<String > siraliOgrenciSeti= new TreeSet<>();

        // tum elementlerin key ve value'lerine birlikte ihtiyac oldugundan
        // Entry kullanmaliyiz

        Set<Map.Entry<Integer,String>> ogrenciEntrySeti=ogrenciMap.entrySet();
        
        // her bir entry'i elden gecirip
        // bilgileri istedigimiz formatta alalim

        String istenenBilgi;
        String value;
        String[] valueArr;

        for (Map.Entry<Integer,String> eachEntry: ogrenciEntrySeti
             ) {
            // 101=Ali-Can-10-H-MF
            // bolum, sinif, sube, isim, soyisim ve numaralarini yazdirin
            value=eachEntry.getValue();
            valueArr=value.split("-"); // [Ayse, Can, 10, H, MF]

            istenenBilgi=valueArr[4] + ", " +
                    valueArr[2] + ", " +
                    valueArr[3] + "  " +
                    valueArr[0] + "  " +
                    valueArr[1] + ", " +
                    eachEntry.getKey();

            siraliOgrenciSeti.add(istenenBilgi);
            // map'de herhangi bir degisiklik istenmediginden
            // arrayi yeniden birlestirip, entry.setValue() yapmamiza gerek yok




        }

        return siraliOgrenciSeti;




    }

    public static Map<Integer, String> soyisimleriBuyukHarfYap(Map<Integer, String> ogrenciMap) {

        // soyisimleri buyutmek icin once Entry set alalim
        // entrySet'deki herbir entry'deki value'yu alalim
        // value'yu split yapip array'e cevirelim
        // array'de istedigimiz degisikligi yapalim
        // array'deki yeni bilgileri birlestirip eachEntry.setvalue(yeniValue)

        String istenenBilgi;
        String value;
        String[] valueArr;
        // soyisimleri buyutmek icin once Entry set alalim
        Set< Map.Entry<Integer,String>> ogrenciEntrySeti=ogrenciMap.entrySet();
        // entrySet'deki herbir entry'deki value'yu alalim
        for (Map.Entry<Integer,String> eachEntry: ogrenciEntrySeti
             ) {
            value=eachEntry.getValue();
            // value'yu split yapip array'e cevirelim
            valueArr=value.split("-");
            // array'de istedigimiz degisikligi yapalim
            valueArr[1]=valueArr[1].toUpperCase();
            // array'deki yeni bilgileri birlestirip eachEntry.setvalue(yeniValue)
            eachEntry.setValue(valueArr[0]+"-"+
                               valueArr[1]+"-"+
                               valueArr[2]+"-"+
                               valueArr[3]+"-"+
                               valueArr[4]);
        }

        return ogrenciMap;
    }
}
