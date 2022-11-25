package ders17_scope;

public class C04_ClassVariables {
    public static void main(String[] args) {

        // C03'deki hastane ismini yazdirmak istiyoruz

        System.out.println(C03_ObjectsVariables.hastaneismi); //Yildiz hastanesi

        System.out.println(C03_ObjectsVariables.hastaSayisi); //23453

        C03_ObjectsVariables.hastaSayisi++;
        C03_ObjectsVariables.hastaSayisi++;
        method1();

        System.out.println(C03_ObjectsVariables.hastaSayisi); //23456

        // kod takibi main method'dan baslar
        // main method'un sonuna gelindiginde hersey biter
        // tum degisimler resetlenir
        // variable degerleri bastaki hallerine doner

    }
    public static void method1(){
        C03_ObjectsVariables.hastaSayisi++;

    }
}
/*
Java Runtime programidir
calismaya basladiginda variable'lara atana degerleri ister
calistigi muddetce yapilan degisikleri kaydeder
ama calismasi bittiginde degisen degerler resetler
 */