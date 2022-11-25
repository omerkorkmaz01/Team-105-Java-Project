package ders37_exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_CheckedExceptions {
    public static void main(String[] args) {

        String dosyaYolu="src/ders36_CheckedExceptions/Deneme.txt";
        int k=0;
        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
            while ((k=fis.read())!=-1){
                System.out.print((char)k);
            }

        } catch (FileNotFoundException e) {

            System.out.println("Dosya yolu yanlis veya dosya arizali");
        } catch (IOException e){

            System.out.println("Dosya okuma veya yazma ile ilgili bir sorun var");

        }

        /*
        Bir kod calısırken birden fazla exception olusma ihitimali varsa
        bu kodu calisir hale getirmek icin 4 ihtimal vardir

        1-herbir exception ic ice try-catch bloklari kullanmak
        2-bir tane try blogu birden fazla catch blogu olusturmak
        3-method sinagture'na tum exeception ihtimallerini yazmak (exceptiıons handle edilmis olmaz)
        4-eger muhtemel exception'larin tumunu kapsayan, daha genis
        kapsamlı bir exception varsa onu kullanmak

         */

        /*
        ikinci ve ucuncu ihtimallerde olusması muhtemel exception'lar arasinda
        parent-child iliskisi olup olmadigi kontrol edilmemlidir
        aralarinda parent-child iliskisi yoksa
        exception'lar istedigimiz sirada yazabiliriz

        Ancak parent-child iliskisi varsa
        once child, sonra parent yazilmalidir
        aksi takdirde parent daha kapsamli oldugundan tum exception'lari yakalar
        ve asagıdaki child exception islevsiz kalir
        java bu durumu kontrol etmez, CTE verir

         */
    }
}
