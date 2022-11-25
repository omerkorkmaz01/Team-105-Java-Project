package ders31_Inheritance;

public class CSuv extends BinekArac {

    public static void main(String[] args) {

        CSuv suv1 = new CSuv();
        System.out.println(suv1.marka); // Binek araclarin markasi vardir
        System.out.println(suv1.model); // Binek araclarin modeli olur
        System.out.println(suv1.motor); // Tum araclar motor kullanir
        System.out.println(suv1.plaka); // Tum araclarin plakasi olur
        System.out.println(suv1.yakit); // Araclar farkli yakitlar kullanir
        System.out.println(suv1.yil); // 1900
        suv1.hiz("Benzin"); // Binek araclarin hizi modele gore değisir
        suv1.teker(); // Binek araclarin 4 tekeri olur

        CSuv suv2 = new CSuv();
        suv2.marka = "Toyota";
        suv2.model = "Rav4";
        suv2.motor = "1.6";
        suv2.plaka = "01 AJ 805";
        suv2.yakit = "Benzin";
        suv2.yil = 2012;
        suv2.hiz(suv2.yakit);


    }

    public void hiz(String yakit) {

        if (yakit.equalsIgnoreCase("Benzin")) {
            System.out.println("Benzinli SUV'ler max 300 km hiz yapar");
        }else if (yakit.equalsIgnoreCase("Dizel")) {
            System.out.println("Dizel SUV'ler max 260 km hiz yapar");
        } else if (yakit.equalsIgnoreCase("Hibrit")) {
            System.out.println("Hibrit SUV'ler max 220 km hiz yapar");
        }else {
            System.out.println("Yakit belli degil, max hiz soyleyemem");
        }
    }
}

