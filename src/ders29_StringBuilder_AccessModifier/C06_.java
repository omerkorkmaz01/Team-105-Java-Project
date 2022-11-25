package ders29_StringBuilder_AccessModifier;

import java.util.ArrayList;
import java.util.List;

public class C06_ {
    /*
    buyuk projelerde datayi gorme(read) veeya datayi degistirme (write)
    yetkilerini birbirinden bagımsız olarak duzenlemek istenebilir

    acces modifier ile class uyelerine baska class'alrdan erisim sinirlandirilabilir
    ANCAK
    ulasabilen dataya hem okuma hem yazma yapılabilirken
    ulasilamayan data ne okunabilir ne de degitirilebeilir

    gercek hayatdaki ihityaclar dusunulduhunde
    Javaya yetki sinirlamaya uyarlamak istersek

    - Eger okuma ve yazma yetkisini birlikte vermek veya vermemek soz konusu ise
      access modifier kullanilir

    - Eger okuma ve yazma yetkileri birbirinden ayrilacaksa
      o zaman acces modifier yeterli olmaz
      Encapsulation(getter ve setter method'lari) kullanilmalidir
     */

    // get ve set daha onceki java objelerinde karşımaza çıkmıstı

    public static void main(String[] args) {
        List<Integer> sayilar= new ArrayList<>();

        sayilar.add(2);
        sayilar.add(3);
        sayilar.add(5);

        // sayilar.get(1)=10; get okumaya izin ver ama deger atamaya(yazmaya) izin yok

        // System.out.println(sayilar.set(1)); set varsa mutlaka deger atamalisin
    }
}