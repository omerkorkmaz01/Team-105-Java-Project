package ders23_constructors;

import java.sql.SQLOutput;

public class HArabaRunner {
    public static void main(String[] args) {

        HAraba arb1 = new HAraba();
        arb1.marka = "Toyota";
        arb1.modeli = "Corolla";
        arb1.yakit = "Dizel";
        arb1.yıl = 2010;
        arb1.fiyat = 12000;

        System.out.println(arb1);

        HAraba arb2= new HAraba("Honda","Civic","Benzin",2011,11000);
        System.out.println(" ");
        System.out.println(arb2);
        System.out.println(" ");

        HAraba arb3=new HAraba("Opel","Corsa","Dizel",2013,10000);
        System.out.println(arb3);
        System.out.println(" ");

        HAraba arb4=new HAraba("Tesla","X",2020);
        System.out.println(arb4);

    }
}