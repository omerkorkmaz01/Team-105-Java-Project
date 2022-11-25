package ders43_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C03_Set {
    public static void main(String[] args) {

        // verilen bir array'in tekrar dene elementlerini silip
        // her elementin sadece 1 kere kullanildigi hale getirin

        int [] arr= {6,4,3,2,3,5,6,4,3,2,4,6,3,2,1,2,4,5,5,1};

        Set<Integer> geciciSet= new HashSet<>();

        for (Integer each: arr
             ) {
            geciciSet.add(each);
        }

        int [] geciciArr= new int[geciciSet.size()]; // yeni ve bos bir arr var

        // Setdeki benzersin hale getirilen elemntleri geciciArr'ye tasiyalim

        int index=0;

        for (Integer each: geciciSet
             ) {
            geciciArr[index]=each;
            index++;
        }

        // tekrarsiz degerleri gecici array'e tasidik
        // simdi kendi array'imize bu gecici arr degerini atayalim

        arr=geciciArr;

        System.out.println(Arrays.toString(arr));
    }
}
