package ders20_multiDimensionalArrays;

import ders18_Arrays.C06_KullanaciyaArrayOlusturma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C09_ArrayList {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        C06_KullanaciyaArrayOlusturma obj1= new C06_KullanaciyaArrayOlusturma();

        List <Integer> sayilar = new ArrayList<>();

        // 1- List primitve data kabul etmez
        // 2- List bir interface oldugu icin direk obje olusturulamaz
        //    Onun yerine sag tarafa ArrayList<>() yazariz

        sayilar.add(4);
        sayilar.add(5);

        System.out.println(sayilar); // [4,5]



    }
}
