package ders15_Overloading_whileLoop;

public class C07_WhileLoop {
    public static void main(String[] args) {

        // kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
        // While Loop kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method olusturalim.

        int sayi=5;
        int us=3;
        ushesapla(sayi,us);


    }

    public static void ushesapla(int sayi, int us){

        int sonuc=1;

        while (us>0){
            sonuc*=sayi;

            us--;
        }

        System.out.println(sonuc);

    }

}
