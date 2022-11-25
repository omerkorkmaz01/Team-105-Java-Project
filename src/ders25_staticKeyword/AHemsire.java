package ders25_staticKeyword;

public class AHemsire {

    static String hastaneIsmı="Yildiz";
    static String hastaneAdresi="Cankaya Ankara";
    static String bashekimIsmi="Dr Mehmet Yilmaz";

    String personelIsım="Isim belirtilmedi";
    String personelAdresi="Adres belirtilmedi";

    @Override
    public String toString() {
        return "AHemsire{" +
                "personelIsım='" + personelIsım + '\'' +
                ", personelAdresi='" + personelAdresi + '\'' +
                ", personelTelefon='" + personelTelefon + '\'' +
                ", \nhastaneIsmi='" + hastaneIsmı + '\'' +
                ", hastaneAdresi='" + hastaneAdresi + '\'' +
                ", bashekimIsmi='" + bashekimIsmi + '\'' +
                '}';
    }
    String personelTelefon="Telefon belirtilmedi";

}

