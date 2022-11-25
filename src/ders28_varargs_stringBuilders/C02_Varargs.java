package ders28_varargs_stringBuilders;

public class C02_Varargs {
    public static void main(String[] args) {

        topla(5, 6); // 11
        topla(5, 3, 8); // 16
        topla(2, 4, 6, 8); // 20
        topla(1); //1
        topla(); //0
        topla(4, 5, 6, 7, 5, 3, 2, 1, 2, 34, 45, 56, 6, 6); // 182

        /*
        bir method'da parametre sayisini sinirlandirmak istemezsek
        standart bir variable yerine varargs kullaniriz

        vararg data turunun yanina ... konularak deklare edilir
        int... ==> sayisi belirli olmayan int parametreler olan bir array'dir
         */
    }

    // parametre sayisi degistikce bizden yeni method olusturmamizi ister

    private static void topla(int... sayilar) {

        int toplamSonucu = 0;

        for (int each : sayilar
        ) {
            toplamSonucu += each;
        }
        System.out.println("Girilen sayilarin toplami : " + toplamSonucu);
    }
}

