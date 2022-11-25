package ders26_passByvalue_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList2 {

    public static void main(String[] args) {

        // Bir method olusturalim
        // method'da yeni bir liste olusturun
        // liste'ye sayilar listesin'deki degerlerin 5 fazlasini element olarak atayin
        // sonra sayilar listesini deger olarak yeni listi atayin ve
        // ve sayilar listini yazdirin

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);

        yeniListDegeriAta(sayilar);

        System.out.println("method call'dan sonra main methoda sayilar : " + sayilar);

    }

    public static void yeniListDegeriAta( List<Integer> sayilar){
        // Bir method olusturalim
        // method'da yeni bir liste olusturun
        List<Integer> yeniList= new ArrayList<>();
        // liste'ye sayilar listesin'deki degerlerin 5 fazlasini element olarak atayin
        for (int i = 0; i < sayilar.size(); i++) {
            yeniList.add(sayilar.get(i)+5);
        }
        // sonra sayilar listesini deger olarak yeni listi atayin ve
        sayilar=yeniList;
        // ve sayilar listini yazdirin

        System.out.println("method da sayilar listesinin son hali : " + sayilar);


    }

}
