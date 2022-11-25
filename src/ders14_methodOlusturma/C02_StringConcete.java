package ders14_methodOlusturma;

public class C02_StringConcete {
    // verilen iki stringi parametre olarak kabul edip,
    // bu iki stringi aralarinda bir bosluk olarak bize tek bir String olarak
    // main method'a donduren bir metho olusturun

    public static void main(String[] args) {


    String str1 ="Java";
    String str2 ="Candir";

        System.out.println (birlestirMethodu(str1,str2));
        System.out.println(birlestirMethodu("Bu da","oldu"));
        System.out.println(birlestirMethodu("Anladiniz" ,"mi"));


}


public static String birlestirMethodu(String str1, String str2) {

    return str1+" "+str2;
    }

    }
