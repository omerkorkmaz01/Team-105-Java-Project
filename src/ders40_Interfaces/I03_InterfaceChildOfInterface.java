package ders40_Interfaces;

public interface I03_InterfaceChildOfInterface extends I01_Interface{

    // Eger bir ınterfaces'i baska bir ınterface'in child'i yapmak isterseniz
    // Extends keyword kullanilir

    // Bir interface concrete class'i INHERIT EDEMEZ

    void method1();
    // ınterface bir child parent interface'deki
    // abstract methodu override edebilir ama
    // ikisinin de body'si olmadigindan
    // bu islemin bir anlami yoktur

    int method4();
    boolean method5();

}
