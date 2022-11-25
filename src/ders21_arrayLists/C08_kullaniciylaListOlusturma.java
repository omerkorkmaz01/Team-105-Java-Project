package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C08_kullaniciylaListOlusturma {
    public static void main(String[] args) {

        // Soru 2- Kullanicidan istedigi kadar isim alip,
        // Q'ya bastiginda girdigi isimleri bize girdigi isimleri bize liste olarak dondurecek
        // bir method olusturun
        System.out.println(listeOlustur());
    }

    public static List<String> listeOlustur(){

        List<String> isimler = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        String girilenIism = "";

        while (!girilenIism.equalsIgnoreCase("q")) {

            System.out.println("Lutfen listeye eklemek icin isim giriniz" +
                    "\nBitirmek icin q'ya basiniz");
            girilenIism = scan.nextLine();

            if (!girilenIism.equalsIgnoreCase("q")) {
                 isimler.add(girilenIism);
        }
    }

    return isimler;

    }
}
