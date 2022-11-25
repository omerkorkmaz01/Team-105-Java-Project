package ders36_CheckedExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOExceptions {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis = new FileInputStream("src/ders36_CheckedExceptions/Deneme.txt");

        FileInputStream fos = new FileInputStream("src/ders36_CheckedExceptions/Deneme.txt");

        // Java ile bilgisarayimizdwaki bir dosyaya ulasmak isterse
        // FİleInputStream class'indan obje olusturup
        // o obje araciligiyla dosyayi kullanabiliriz

        // fis olusturuken ulasmak istedigimiz dosyanin
        // dosya yolunu parametre olarak girmeliyiz

        /*
        CheckedException olusturma ihtimalli olan kodlari yazdirdigimiz
        java compile time orada bir hata ihtimalli oldugunu gorur
        ve kodun altini kirmizi olarak cizer

        bu durumda kirmizi cizgiyi kaldırmak icin 2 yontem vardir
        1-exception'i try catch blogu ile handle etmek
        2-javaya sorun ihtimalinin farkında oldugumuzu ama kodumuza guvendigimizi
        ve calismaya devam etmesini istdedigimizi soylemek
        bunun icin method singature'na method deklarasyonu ile curly braces arasina
        throws keyword ve beklenen exception turu yazilabilir
         */

    }
}
