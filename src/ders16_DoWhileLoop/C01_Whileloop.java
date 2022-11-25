package ders16_DoWhileLoop;

public class C01_Whileloop {
    public static void main(String[] args) {

        // 10 11 12 sayilarini toplayan bir while loop olusturalim

        int sayi=10;
        int toplam=0;

        while(sayi<=12){

            toplam+=sayi;

            sayi++;
        }


        // while loop'da once kontrol sonra islem yapilir


        /*
        while loop'da 2 problem olusabilir
        1- once degeri kontrol edip, sonra islem yaptigimizda
        body'de  bir kere daha kontrol etmemiz gerekebilir
        2- yapilan islem sayisindan 1 fazla whille bitis sarti kontrol edilir
        3- while loop oncesine degerleri kontrol edecegimiz bir variable olusturuyorsak
           ona yapacagimiz atamyi dikkatli yapmamiz gerekir
           yanlis deger atamasi yapmak, while loop'un calismamasina neden olabilir
         */


    }
}
