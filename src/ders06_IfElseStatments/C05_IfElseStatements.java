package ders06_IfElseStatments;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {

        //kullanicidan yasini isteyin, 65 yas veuzeri ise,
        //"Emekli olabilirsin" yazdirin,
        //yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        double yas= scan.nextDouble();

        if (yas>=65) {
            System.out.println("Yasiniz emeklilik icin yeterli");
        }else{
            System.out.println("emekli olmak icin " + (65-yas) + "sene daha calismalisin");

        }
        }
}
