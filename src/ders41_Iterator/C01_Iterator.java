package ders41_Iterator;

import java.util.ArrayList;
import java.util.List;

public class C01_Iterator {

    public static void main(String[] args) {

        // Java collections icerisindeki bazi class'lar index desteklemez
        // Bu durumda index kullanmadan collection icerisindeki yum elementlere ulasabilmek
        // ve onlari update edebilmek icin farkli ihtiyaclarimiz var

        // List<> index yapisini destekledigi icin, boyle bir ihtiyac duymaz
        // ancak bugunluk index kullanmadan list'e elementlerine ulasmaya
        // ve onlari update etmeye calisalim

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);
        
        // index kullanmadan listin tum elemtlerini yazdirin

        for (Integer each:sayilar
             ) {
            System.out.print(each+ " "); // 10 20 30 40
        }

        System.out.println(" ");

        // index kullanmadan list'in elementlerini 1'er artirin
        // index kullanmadan 25'den buyuk sayilari list'den silin

        for (Integer each:sayilar
             ) {
            System.out.print(each+1 + " "); //11 21 31 41
        }
        System.out.println(" ");
        System.out.println(sayilar); //[10, 20, 30, 40]

        for (Integer each:sayilar
             ) {
            each+=1;
            System.out.print(each + " "); //11 21 31 41
        }

        System.out.println(" ");
        System.out.println(sayilar); //[10, 20, 30, 40]

        // index kullanmadan list'in elemanlarini kalici olarak degistirmek mumkun olmadi
        // java bunu  icin Iterator interface'i olusturmustur

    }
}
