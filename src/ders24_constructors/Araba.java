package ders24_constructors;

public class Araba {

    String marka = "Marka belirtilmedi";
    String modeli = "Model belirtilmedi";
    String yakit;
    int yil;
    int fiyat;

    public Araba (String mrk,String mdl){
        marka=mrk;
        modeli=mdl;
    }

    public Araba(String marka, String modeli, String yakit, int yil, int fiyat) {
        this.marka = marka;
        this.modeli = modeli;
        this.yil = yil;
        this.yakit = yakit;
        this.fiyat = fiyat;
    }

    public Araba(String marka, String modeli, int fiyat) {
        this.marka = marka;
        this.modeli = modeli;
        this.fiyat = fiyat;
    }

    public Araba(){

    }
    @Override
    public String toString() {
        return "Araba Ozellikleri " +
                "\nMarka : " + marka +
                "\nmodeli : " + modeli +
                "\nyakit : " + yakit +
                "\nyil : " + yil +
                "\nfiyat : " + fiyat;

    }
}
