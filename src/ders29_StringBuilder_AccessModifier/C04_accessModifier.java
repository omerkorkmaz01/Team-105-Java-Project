package ders29_StringBuilder_AccessModifier;

public class C04_accessModifier {


        String isim ="ali"; // acces modifier gorunmuyor, o zaman default acces modifier gecerlidir
        //                     bu class'dan ve ders29 package'i icerisindeki diger class'dan kullanilabilir

        // default int sayi = 10; default access modifier yazilmaz yazilamaz
        //                    yazmaya kalkısırsanız java CTE verir
    private static int sayi=10;

    public static void main(String[] args) {

        System.out.println(sayi); // 10
        sayi=20;

        System.out.println(sayi); // 20
}
}
