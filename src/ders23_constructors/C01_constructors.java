package ders23_constructors;

import java.util.Scanner;

public class C01_constructors {
    public static void main(String[] args) {

        // scanner class'indaki method ve variable'lari(ozellikleri) kullanmak icin scan objesi olusturuz
        Scanner          scan =       new                              Scanner(System.in);
        // class adi     obje ismi    obje olusturmak icin keyword     Scanner Constructor'i

        scan.nextInt();

        String str= new String("Java Candir");
        String str2= "Java ne guzel";

        str.toLowerCase();
    }

    public static void C01_constructors(){
        // method isimleri kucuk harf ile baslar
        // class ismi ile ayni isimde olmamasi tercih edilir
        // return typ'i var, metho'dur, constructor'dır
    }

}
