package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C09_Fibonacci {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan pozitif bir tamsayi alip
        // O tamsayiyi kucuk Fibonacci sayilarini bir liste olarak
        //  yazdirin
        // 0 1 1 2 3 5 8 13 21 34 55 89 144

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int girilensayi = scan.nextInt();

        if (girilensayi < 0) {

            System.out.println("fibonacci serisi icin 0'den buyuk tamsayi girmelisiniz");
        } else if (girilensayi == 0) {
            System.out.println("0'dan kucuk fibonacci sayisi yoktur");
        } else if (girilensayi == 1) {
            System.out.println("1'den kucuk tek fibonacci sayisi vardir: 0");
        } else {
            fibonacciSayilariniyazdir(girilensayi);
        }
        {
        }
    }
    private static void fibonacciSayilariniyazdir(int girilensayi) {
  // buraya geldiyse girilen sayi 1'den buyuktur

        List<Integer> fibonacciListesi = new ArrayList<>();
        fibonacciListesi.add(0);
        fibonacciListesi.add(1);
        fibonacciListesi.add(1);

        int yeniFibonacciSayisi=0;
        int index=3; // İlk 3 eleman 0 1 1 oldugu icin 3.index'e geldik

        while (yeniFibonacciSayisi<girilensayi){

            yeniFibonacciSayisi=fibonacciListesi.get(index-2) + fibonacciListesi.get(index -1);

            if (yeniFibonacciSayisi<girilensayi){
                fibonacciListesi.add(yeniFibonacciSayisi);

            }
            index++;
        }
            System.out.println(fibonacciListesi);
    }
}

