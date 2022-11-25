package ders03_datacastingWrapperClass;

public class C05_WrapperClass {
    public static void main(String[] args) {

        int sayi =10;
        String str="Java cok guzel";

        /*
        primitive data turleri sadece deger barindirilar,
        hazir metod'lari yoktur

        java'ya yapilan talepler nsonucunda
        java primitive data turleri ile bazi hazir method'larin kullanabilmesi icin
        Wrapper class'lar olusturmustur

        Wrapper class'lar primitive data turlerindeki degerleri alirlar
        ancak method'lari da vardir
         */

        char krk= 'b';

        Character krkWrapper= 'c';

        System.out.println(Character.isLetter('5')); // false

        System.out.println(Character.isDigit('7')); // true

        String str1="123";
        String str2= "12";

        // str1 ve str2'nin degerlerinin matematiksel olarak toplayin

        System.out.println(str1 + str2); //12312

        System.out.println(Integer.parseInt(str1)+Integer.parseInt(str2)); // 135

        // Integr.parseInteger(str) icine yazilan str rakamlardan olusuyorsa str'i int'a ceviri
        // ancak bir karakteer bile rakam degilse hata verir

        System.out.println(Integer.MAX_VALUE); //2147483647,

        System.out.println(Short.MIN_VALUE); //-32768



    }
}
