package ders26_passByvalue_ImmutableClasses;

public class C01_PassByValue {
    public static void main(String[] args) {

        double fiyat = 100;

        System.out.println(indirimUygula(fiyat)); // 90
        System.out.println(indirimUygula(fiyat)); // 90
        System.out.println(indirimUygula(fiyat)); // 90

        System.out.println(fiyat); // 100

        fiyat=indirimUygula(fiyat);

        System.out.println("indirim uygulanmis yeni fiyat : " + fiyat); // 90
    }
    /*
    Kodlarimizin anlasilir olmasi icin main method'dan diger method'lara
    parametre olarak gonderdigimiz variable'lar icin ayni isimli variable
    olusturmayi TERCİH EDERİZ

    Java method'lar arasinda gecis yaparken variable'i degil
    variable'nin value'sunu pes eder

    Bu Java'nın Pass By Value'yu tercih etmesinden kaynaklaniyor

     Eger method'un icerisinde yaptiginiz degisikligin main method icinde gecerli olmasini
     isterseniz main method icerisinde
     fiyat=indirimUygula(fiyat);

     atamasini yapabiliriz.
     */
    private static double indirimUygula(double fiyat) {
        // %10 indirim yapsim

        fiyat=fiyat*0.9; // fiyataa atama yaptik kalici olarak 90 oldu

        return fiyat;

    }
}

