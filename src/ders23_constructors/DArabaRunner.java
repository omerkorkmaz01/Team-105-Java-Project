package ders23_constructors;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class DArabaRunner {
    public static void main(String[] args) {

        //DAraba class'indan bir obje olusturalim
        DAraba arb1= new DAraba();
        System.out.println(" ");

        System.out.println(arb1.marka); // Marka belirtilmedi
        System.out.println(arb1.modeli); // Model belirtilmedi
        System.out.println(arb1.yakit); // null
        System.out.println(arb1.yıl); // 0
        System.out.println(arb1.fiyat); // 0

        arb1.marka="Tofas";
        arb1.modeli="Kartal";
        arb1.yakit="Benzin";
        arb1.fiyat=50000;
        arb1.maxHiz(arb1.yakit);
        arb1.yıl=1991;

        System.out.println(arb1.marka); // Tofas
        System.out.println(arb1.modeli); // Kartal
        System.out.println(arb1.yakit); // Benzin
        System.out.println(arb1.yıl); // 1991
        System.out.println(arb1.fiyat); // 50000
        System.out.println(arb1.maxHiz(arb1.yakit));

        DAraba arb2= new DAraba();
        System.out.println(" ");

        // arb2'nin özelliklerini yazdirmak istesek

        System.out.println("Marka : " + arb2.marka  +
                           "\nModel : " + arb2.modeli +
                           "\nYakit : " + arb2.yakit +
                           "\nYil : " + arb2.yıl+
                           "\nFiyat : " + arb2.fiyat);

        DAraba arb3= new DAraba();

        System.out.println(arb3);
        System.out.println(" ");
        System.out.println(arb1);

        System.out.println(" ");

        DAraba arb4= new DAraba();
        System.out.println(arb4);

    }
}
