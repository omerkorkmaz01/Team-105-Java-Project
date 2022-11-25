package ders30_encapsulation;

public class EChild extends DParent{

    /*
    Java'daki inheritance'in en buyuk farkı :
    -İnsanlaarda parent child ednebilir ama child parent'ini secemez
    -Javada ise tam tersidir
    *Siz bir class olusturduguuzda daha once olusturulmus class'lardan
    tum ozelliklerini inherit etmek istediginiz class'i Parent EDİNİRSİNİZ

    Bir class baska bir class'i inherit etmek istediginde
    extends keyword ile bunu deklare eder

     */

    public static void main(String[] args) {

        EChild child1= new EChild();

        child1.yas=30;
        child1.isim="Mahmut";
        child1.isEnough=false;



    }
}
