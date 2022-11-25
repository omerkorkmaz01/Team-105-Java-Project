package ders16_DoWhileLoop;

public class C02_DoWhileLoop {

    public static void main(String[] args) {

        // 10 11 12 sayilarini toplayan bir while loop olusturalim

        int sayi=10;
        int toplam=0;

        do {

            toplam=toplam+sayi;

            sayi++;

        }while(sayi<=12);

        /*
        Do while loop'un 2 avantaji vardir
        1- Loop body'si en az 1 kere calisir
           (while loop'da baslangic degeri uygun degilse, loop body'si hic calismayabilir)

        2- While bitis kontrolu loop kadar calisir
           ( while loop'da bir kere fazla calisirdi)
        */


    }
}

