package ders17_scope;

import java.util.Scanner;

public class C05_ObjectVariables {

    public static void main(String[] args) {

        // C03 cllas'indaki instance variable'larin nasil ulasabiliriz ?
        // instance variable'larin diger adi obje variable'laridir
        //instance variable'Lara obje uzerinden ulasabiliriz

        Scanner scan=new Scanner(System.in);

        C03_ObjectsVariables pers1= new C03_ObjectsVariables();

        System.out.println(pers1.persIsmi); // Isim girilmedi
        System.out.println(pers1.persYasi); // 0

        pers1.persIsmi="Suleyman";
        pers1.persYasi=35;
        pers1.persTelefonu="553345654";

        System.out.println(pers1.persIsmi); // Suleyman
        System.out.println(pers1.persYasi); // 35

        C03_ObjectsVariables pers2= new C03_ObjectsVariables();
        pers2.persIsmi="Latife";
        pers2.persYasi=32;
        pers2.persTelefonu="555 4322321";

        System.out.println(pers1.persIsmi); // Suleyman
        System.out.println(pers2.persIsmi); // Latife

        C03_ObjectsVariables pers3= new C03_ObjectsVariables();

        pers3.persIsmi="Heysem";
        pers3.persYasi=30;
        pers3.persTelefonu="312 2134567";

        System.out.println(pers1.persYasi); // 35
        System.out.println(pers2.persYasi); // 32
        System.out.println(pers3.persYasi); // 30

    }
}
