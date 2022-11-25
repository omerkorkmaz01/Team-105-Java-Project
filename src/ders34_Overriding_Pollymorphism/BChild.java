package ders34_Overriding_Pollymorphism;

public class BChild extends APrarent{
    @Override
    public void method3() {
       // super.method3();
       // overriding varsa parent ve child
       // class'daki method'lardan sadece biri calisir
       // eger ikisini birden calistirmak isterseniz
       // super.overridingdenMethodIsmi yazilir

       /*
       overriding method @override notasyonu ile isaretlenmistir
       @Override kullanilmayan overriding isleminde
       parent class'daki overridden method silinirse
       hic bi sorun olmaz

       Ancak @Override kullanilan overriding isleminde,
       parent class'daki overriden method silinirse
       Java CTE verir, boylece overriden method'un
       silinmesi engellenir.

        */
    }

    public void method1(){
        System.out.println("Child class method1");
    }
    public void method2(int a){
        // overriding olabilmesi icin
        // hem method ismi hem de method singature ayni olmalidir
        System.out.println("Child class method2");
    }
    public void method2(String isim){
        System.out.println("Child class String parametreli method2");
    }
}
