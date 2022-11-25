package ders19_arrays;

import ders18_Arrays.C03_ArrayElementlerniArtirma;
import ders18_Arrays.C04_ArrayElementleriToplama;
import ders18_Arrays.C05_ArraydeElemanArama;
import ders18_Arrays.C06_KullanaciyaArrayOlusturma;

import java.util.Arrays;

public class C03_MethodlariKullanma {
    public static void main(String[] args) {

        // verilen bir int array'in elementlerini 3 artirin

        int[] arr={2,3,4};
        arr= C03_ArrayElementlerniArtirma.elementleri2Artirint(arr);
        System.out.println(Arrays.toString(arr));

        // arr array'inin elementlerini toplayip sonucu yazdirin

        System.out.println(C04_ArrayElementleriToplama.pozitifelementleritopla(arr)); // 15

        // arr array'inde 10 element olarak var mi?
        C05_ArraydeElemanArama.elemanAra(arr,10); // Aranan sayi array'de yok

        // kullanicidan deger alarak bir array olusturun
        int[] yeniArr= C06_KullanaciyaArrayOlusturma.arrayOlustur();
        System.out.println(Arrays.toString(yeniArr));
    }
}
