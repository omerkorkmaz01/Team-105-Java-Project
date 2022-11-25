package ders38_AbstactClasses;

public abstract class CParentAbstractClass {

    /*
    Abstract bir class abstract method'lara sahip olabilir
    Bir class'i abstract yapmak icin class declariton'ina abstract keyword eklenmelidir

     */

    public abstract void mecburiMethod1();

    public abstract void mecburiMethod2();

    // soyut(abstract) method'larin body'si olmaz

    public String concreteMethod(){

        //bugune kadar kullandigimiz normal methodlara
        //soyut olmayan method demek yerine concrete method denir

        return "";
    }

    }

    /*
    Bir parent class'da child class'larin mutlaka override edecegi bir method olusturdugumuzdan
    method body'si gereksizlesir
    cunku hic calısmayacaktir

    1-abstract parent class'dan obje olusturulmayacagi icin objeler icin bu method kullanilamaz
    2-child class'lar da mecburen bu method'u override edeceklerinden
    bu method'larin body'si asla KULLANİLAMAYACAKTİR

    Java hic kullanilmayacak bu method body'leri yazmamamiza imkan tanimisitir

     */

    // Child class'larin mutlaka override etmesini istedigimiz method'lari
    // abstract olarak tanimlar ve body'siz olarak olusturulur
