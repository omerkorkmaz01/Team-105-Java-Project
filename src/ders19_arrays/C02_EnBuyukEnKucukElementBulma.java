package ders19_arrays;

import java.util.Arrays;

public class C02_EnBuyukEnKucukElementBulma {
    public static void main(String[] args) {

        // Verilen bir int array'De en kucuk en buyuk sayilari
        // yazdiran bir method olusturun

        int[] arr={3,8,1,5,2,9};
        enBuyukenKucukElementYazdir(arr);

    }

    public static void enBuyukenKucukElementYazdir(int[] arr){

        Arrays.sort(arr);

        System.out.println("En buyuk element : " + arr[arr.length-1]);
        System.out.println("En kucuk element : " + arr[0]);


    }

}
