package ders40_Interfaces;

public class I02_ConcreteChildClassOfInterface implements I01_Interface {

    // Bir class'i interfce'in child'i yapmak icin iplements keyword kullanilir

    public static void main(String[] args) {

        System.out.println(MESAJ); // Hello Interface
        // sayi=40; yazili olmasa ınterface
        // icerisinde oldugundan final'dir atama yapilamaz.

        System.out.println(Integer.MAX_VALUE);
        // normalde variable isimleri, kucuk harfle baslar ve camel case kullanilir
        // ancak java da kabul olarak
        // static ve final olarak isaretlenen variable isimleri tamamen buyuk harfle yazilir

        System.out.println(Math.PI);
    }

    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }
}
