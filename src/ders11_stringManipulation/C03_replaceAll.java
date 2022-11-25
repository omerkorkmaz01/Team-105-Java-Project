package ders11_stringManipulation;

public class C03_replaceAll {
    public static void main(String[] args) {

        String str="J1ava2 G9uzel5dir8";

        // str'daki sayilari silip metni Java Guzeldir haline donusturelim

        System.out.println(str.replaceAll("1","")
                          .replaceAll("2","")
                          .replaceAll("9","")
                          .replaceAll("5","")
                          .replaceAll("8","") );

        // str.replaceAll() sadece bir harf veya char sequence'i degil
        // genelleme ile soyleyebilecegimizi ortak ozellikteki tum karakterleri degistirir

        System.out.println(str.replaceAll("\\d","")); //Java Guzeldir

        System.out.println(str.replaceAll("\\D","")); //

        String s1="ilk urun fiyati : 1250 tl";
        String s2="ikinci urun fiyati : 1500 tl";
        // iki urun fiyatini toplayin

        s1=s1.replaceAll("\\D",""); //"1250"
        s2=s2.replaceAll("\\D",""); //"1500"

        System.out.println(s1+s2); //12501500
        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2)); //2750

        System.out.println(str.replaceAll("a","x"));



    }
}
