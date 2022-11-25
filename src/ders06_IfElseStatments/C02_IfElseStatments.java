package ders06_IfElseStatments;

import java.util.Scanner;

public class C02_IfElseStatments {
    public static void main(String[] args) {

        //kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //ucgen eskenar ise "Eskenar ucgen" yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen ucgenin 3 kenarini giriniz");
        int kenar1= scan.nextInt();
        int kenar2= scan.nextInt();
        int kenar3= scan.nextInt();

        if (kenar1==kenar2  && kenar2==kenar3){
            System.out.println("Eskenar ucgen yazdirabiliriz");

        }
    }
}
