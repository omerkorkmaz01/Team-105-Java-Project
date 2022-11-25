package ders33_InheritanceDataTypeKullanimi_Overriding;

public class FAvciKuslar extends EKuslar {

    public void hareket() {
        System.out.println("Avci kuslar ucarlar");
    }
    public void beslenme() {
        System.out.println("Avci kuslar et yerler");
    }
    public void pence() {
        System.out.println("Avci kuslar pencilidir");
    }
    public void gaga() {
        System.out.println("Avci kuslar sivri gagali");
    }

    public static void main(String[] args) {

        FAvciKuslar avci1 = new FAvciKuslar();

        /*
        bir obje olusuturulurken constructoe ve data turu ayni ise
        Hangi method2un gecerli oldugunu bulmak icin
        o class'a gider varsa kullaniriz yoksa
        sirasi ile parent'lara gider ilk buldugumuzu kullaniriz
         */

        avci1.beslenme(); // Avci kuslar
        avci1.gaga();     // Avci kuslar
        avci1.pence();    // Avci kuslar
        avci1.hareket();  // Avci kuslar
        avci1.cogalma();  // EKuslar
        avci1.kanat();    // EKuslar
        avci1.omur();     // DHayvanlar
        avci1.solunum();  // EKuslar

        /*
        bir obje olusturulurken data turu ile constructor farkli ise
        hangi method2un gecerli olacagini bulmak icin

        once data turunun oldugu class ve parent'larına bakarak
        o method'u buluruz
        bulamazsak CTE verir

        bulursak hemen calistirmayiz
        calistirmadan once o method override eedilmis mi diye kontrol ederiz
        override edilmisse override eden method'u calistiriz

         */

        EKuslar avci2 = new FAvciKuslar();

        avci2.beslenme(); // FAvci kuslar
        avci2.gaga();     // FAvci kuslar
        // avci2.pence(); => CTE verir
        avci2.hareket();  // FAvci kuslar
        avci2.cogalma();  // EKuslar
        avci2.kanat();    // EKuslar
        avci2.omur();     // DHayvanlar
        avci2.solunum();  // EKuslar

        DHayvanlar avci3=new FAvciKuslar();

        avci3.beslenme(); // FAvci kuslar
        // avci3.gaga();  => CTE verir
        // avci3.pence(); => CTE verir
        avci3.hareket();  // FAvci kuslar
        avci3.cogalma();  // EKuslar
        // avci3.kanat(); => CTE verir
        avci3.omur();     // DHayvanlar
        avci3.solunum();  // EKuslar

        EKuslar kus1=new EKuslar();

        kus1.cogalma();  // Kuslar
        kus1.gaga();     // Kuslar
        kus1.kanat();    // Kuslar
        kus1.hareket();  // DHayvanlar
        kus1.omur();     // DHayvanlar
        kus1.solunum();  // Kuslar
        kus1.beslenme(); // DHayvanlar

        /*
        method'larla belirlenen oellikler
        en guncel bilgiyi bulurken

        variable ile belirlenen ozellikler
        ilk buldugu degeri kullanir

        bunun icin method'lara dinamik ozellik
        variable'a statik ozellik denir
         */

        DHayvanlar kus2= new EKuslar();

        kus2.cogalma();  // Kuslar
        // kus2.gaga();  => CTE verir
        // kus2.kanat(); => CTE verir
        kus2.hareket();  // DHayvanlar
        kus2.solunum();  // Kuslar
        kus2.beslenme(); // DHayvanlar
        kus2.omur();     // DHayvanlar

    }
}