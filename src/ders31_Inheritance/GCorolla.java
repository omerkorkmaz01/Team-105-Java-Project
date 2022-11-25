package ders31_Inheritance;

public class GCorolla extends FToyota{

    String model="Corolla";
    String uretimYeri="Turkiye";

    GCorolla(){
        super();
        System.out.println("Corolla cons. calisti");
    }

    public static void main(String[] args) {

        GCorolla corolla1 =  new GCorolla();
        System.out.println(corolla1.marka); // Toyota

        /*
        bir child class'tan obje olusturdugumuzda
        olusturulan obje sadece child class'a ait oz. degil
        tum parent class'larindaki oz. de tasir

        Bir objenin bir class'in oz. tasimasi icin
        o obje olusturulurken class'a ait constructor'in calismis olmasi gerekir
        yani child class'indaki obje olusturulurken
        tum parent class'larindaki constructor'lar da otomatik olarak calisir

        Java bu islem icin soyle bir mekaniz gelistirmisitir
        Bir class olusturdugumuzda biz constructor olusturmasak da
        Java'nin o class'a default constructor koydugu gibi
        extends keyword kullanan bir class'da olusturulan her bir constructor'un
        ilk satirina biz gormesek de super() constructor call koyar
         */
    }

}
