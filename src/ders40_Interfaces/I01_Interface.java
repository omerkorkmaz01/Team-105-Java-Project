package ders40_Interfaces;

public interface I01_Interface {

    // Interface'ler ozel yapi olduklarindan
    // yazilsa da yazilmasa da, tum variable'lar
    // public, static ve final'dir

    String MESAJ="Hello Interface";
    static int SAYİ=20;
    public static boolean GUZEL_MI=true;
    public static final int SAYI2=30;


    // ayni sekilde
    // tum methodlar public ve abstract'dır
    void method1();
    abstract int method2();
    public abstract String method3();
}
