package ders34_Overriding_Pollymorphism;

public class DChild extends CParent {

    // overrding kurallari
    // 1-access modifier method signature dahil olmadıgından
    //   overridden ve overrding access modifier'lar farkli olabilir
    //  child parent'i sinirlandiramaz
    //  yani overriding method'un access modifier'i
    //  ayni veya daha genis kapsamli olmalidir
    //  private -- default -- protected -- public

    protected void method1() {

    }

    // 2-private ve static method'lar override edilemez
    // ayni isimde method olusturulunca Java CTE vermez
    // ancak override isareti cikmaz ve
    // override rotasyonu kullanilmak istenirse CTE olur
    // yani Java bunlari farkli class'lardaki farkli method'lar olarak kabul etmez

    public static void method2() {

    }

    private void method3() {

    }

    // 3-Return type method signature dahil olmadigindan
    //   farkli secilebilir ancak
    //   return type void veya primitive ise ayni olmak zorundadir
    //   eger return type'lar non-primitive ise
    //   child class'daki return type, parent class'daki return type'i
    //   ile ayni veya child'i olmalidir

    public void method4() {

    }

    public String method5() {

        return  "";
    }

}
