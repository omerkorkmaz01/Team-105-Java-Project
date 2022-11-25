package ders30_encapsulation;

public class AencapsuleClass {

    private String hastaneIsmı= "Yildiz Hastanesi";
    // hastane ismi gorulebilsin ama degistirelimesin
    // getter methodu lazım


    public String getHemsireIsmi() {
        return hemsireIsmi;
    }

    public void setHemsireIsmi(String hemsireIsmi) {
        this.hemsireIsmi = hemsireIsmi;
    }

    public String getHemsireAdresi() {
        return hemsireAdresi;
    }

    public void setHemsireAdresi(String hemsireAdresi) {
        this.hemsireAdresi = hemsireAdresi;
    }

    private int hastaUcreti;
    // hasta ucretleri de grirs yapabilsin ama
    // ucreti sigortadan alinacagi iicin
    // personel hasta ucretlerini goremesin
    // setter methodu lazım

    String hemsireIsmi;
    String hemsireAdresi;
    // bu instance variable'lara herkes ulasabilsin
    // bu durumda public yapmak aklan gelen ilk cozum olacaktır
    // bu variable'lari publıc yapmak yerine
    // private yapıp getter ve setter yapmak ayni islevi gorur
    public void setHastaUcreti(int hastaUcreti) {
        this.hastaUcreti = hastaUcreti;
    }

    public String getHastaneIsmı() {
        return hastaneIsmı;
    }
}
