package ders24_constructors;

public class ArabaRunner {

    public static void main(String[] args) {

        Araba arb1 = new Araba();

        arb1.marka = "Citroen";
        arb1.modeli = "C3";
        arb1.yakit = "Benzin";
        arb1.yil = 2020;
        arb1.fiyat = 20000;

        System.out.println(arb1);

        System.out.println(" ");

        Araba arb2=new Araba("Volvo","CX60");
        System.out.println(arb2);

        System.out.println(" ");

        Araba arb3= new Araba("Hyundai","İ10",10000);
        System.out.println(arb3);

        System.out.println(" ");

        Araba arb4= new Araba("Mercedes","G","Benzin",2022,1000000);
        System.out.println(arb4);

        System.out.println(" ");

    }
}
