package ders23_constructors;

public class DAraba {

    // bir proje olusturulurken tum classlarda main method olmasina gerek yoktur
    // cogu class obje olusturularak kullanilmak uzere hazirlanmiş depolardır
    // biz de bu class'i araba objeleri icin bir depo olarak dizayn edelim

    // her class olusturuldugunda java o class'dan obje olusturulabilmesi icin
    // default bir constructor olusturur
    // bu default constructor gorunmez
    // default constructor parametresizdir ve bize standart bir obje olusturur

    String marka="Marka belirtilmedi";
    String modeli="Model belirtilmedi";
    String yakit;
    int yıl;
    int fiyat;

    @Override
    public String toString() {
        return "Araba Ozellikleri " +
                "\nMarka : " + marka +
                "\nmodeli : " + modeli +
                "\nyakit : " + yakit +
                "\nyıl : " + yıl +
                "\nfiyat : " + fiyat;

    }

    public int maxHiz(String yakit){
        int maxHiz=120;

        if (yakit.equalsIgnoreCase("dizel")) {
            maxHiz = 200;
        }else if (yakit.equalsIgnoreCase("benzin")) {
            maxHiz = 230;
        }else if (yakit.equalsIgnoreCase("elektrikli")){
            maxHiz=180;
        }
        return maxHiz;
    }

}
