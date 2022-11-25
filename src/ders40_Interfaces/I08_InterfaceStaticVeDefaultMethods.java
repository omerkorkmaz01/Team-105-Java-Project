package ders40_Interfaces;

public interface I08_InterfaceStaticVeDefaultMethods {

    /*
    Java 8 ile developer'larin talebi uzerine yeni bir istisnai duurm javaya eklenmistir

    bir interface'i yillar icerisinde yuzlerce class inherit etmis olabilir
    sonradan ınterface eklenen abstract bir method tum eski child'lar atarafindan
    inherit edilmelidir, aksi takdirde tum eski child class'lar CTE verecektir

    Java 8 ile birlikte Java, interface'ler default veya static ile isaretlenmek
    sarti ile body'si olan method eklenmesine izin vermistir,
    Bu sayede interface'E sonradan eklenen method body'li oldugu icin
    override edilmek zorunda degildir

    Interface icerisinde body'si olan method olusturmak icin kullanilan
    default ve static keywordleri arasinda tek bir fark vardir

    default kullanilan methodlar obje olusturularak cagrılabilirken
    static olarak isaretlenen method'lar driek kullanilabilir

     */

    void method1();
    void method2();

    //interface'deki tum methodlar public ve abstractir
    //biz interface'deki bir method deklarasyonuna default yazarsak
    //bu access modifier degildir

    //

    public default void method3(){
        System.out.println("Interface icindeki body'li default method");
    }

    public static void method4(){
        System.out.println("Interface icindeki body'li static method");
    }
}
