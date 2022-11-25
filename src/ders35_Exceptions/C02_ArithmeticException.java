package ders35_Exceptions;

public class C02_ArithmeticException {
    public static void main(String[] args) {

        // Verilen iki tamsayiyi birbirne bolup
        // sonucun tamsayi kismini yazdirin

        int sayi1 = 20;
        int sayi2 = 10;

        try {

            // riskli oldugunu ongordugumuz kodlar

            System.out.println(sayi1 / sayi2);
            System.out.println("Bakalim bu satir calisacak mi ? ");

        } catch (ArithmeticException e) {

            // catch (ArithmeticException e) ongordugunuz risk {

            System.out.println("sayi sifira bolunemez");

            // catch(0' den sonraki{ } catch blogu denir
            // beklenen risk gercelesirse calisacak kodlar

        }

        /*
        bazi exception'lar if else ile handle edilebilir ancak
        tum exception'lar icin if else yeterli olmaz
         */

        }
    }
