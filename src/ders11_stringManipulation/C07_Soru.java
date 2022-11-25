package ders11_stringManipulation;

public class C07_Soru {
    public static void main(String[] args) {

       // Soru 5 : Kullanicidan isim ve soyismini ayri ayri alin.
       // -ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
       // -soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk harflerle yazdirin.

    String isim="Mehmet";
    String soyisim="Harungil";
    String yeniIsimSoyisim;

    if (isim.length()>soyisim.length()) {
    // isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin

        yeniIsimSoyisim=isim.substring(0,1).toUpperCase()+
                               isim.substring(1).toUpperCase()+
                               " "+
                               soyisim.substring(0,1).toUpperCase()+
                               soyisim.substring(1).toLowerCase();

    }else {
        // ismi ilk harf buyuk digerleri kucuk, soyismi buyuk harflerle yazdirin.
        yeniIsimSoyisim = isim.substring(0, 1).toUpperCase() +
                isim.substring(1).toUpperCase() +
                " " +
                soyisim.toUpperCase();

    }
        System.out.println(yeniIsimSoyisim);


    }

    }

