package ders39_AbstractClass;

public abstract class BHonda extends Araba{

    // abstract bir class'ii parent edindigimizde
    // iki alternatifimiz olur
    // 1-Parent'imiz olan abstract method'lari override etmek
    // 2-Proje yapimiz gerektiyorsa bu class'i da abstract yapmak

    public void marka(){
        System.out.println("marka : Honda");
    }

    public abstract void yakit();

    public abstract void guvenlik();

    public void ozelTeknoloji(){
        System.out.println("Tum honda arabalar vtec teknolojisi kullanir");
    }


}
