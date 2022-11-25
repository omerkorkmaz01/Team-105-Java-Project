package ders06_IfElseStatments;


import java.util.Scanner;

public class C01_IfStatments {
    public static void main(String[] args) {
        //kullanicidan bir harf alin, harf ile başlayan bir ay varsa yazdirin
        // kullanici o veya 0 yazdiğinda output Ocak olsun.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ay isminin ilk harfini girin");
        char ilkHarf = scan.next().charAt(0);


        if (ilkHarf == 'O' || ilkHarf == '0') {
            System.out.println("Ocak");
        }
        if (ilkHarf == 's' || ilkHarf == 'S') {
            System.out.println("Şubat");
        }
        if (ilkHarf == 'm' || ilkHarf == 'M') {
            System.out.println("Mart veya Mayis");
        }
        if (ilkHarf == 'o' || ilkHarf == '0') {
            System.out.println("Ocak");
        }
        if (ilkHarf == 'n' || ilkHarf == 'N') {
            System.out.println("Nisan");
        }
        if (ilkHarf == 'h' || ilkHarf == 'H') {
            System.out.println("Haziran");
        }
        if (ilkHarf == 't' || ilkHarf == 'T') {
            System.out.println("Temmuz");
        }
        if (ilkHarf == 'n' || ilkHarf == 'N') {
            System.out.println("Agustos veya Aralik");
        }
        if (ilkHarf == 'e' || ilkHarf == 'E') {
            System.out.println("Eylul veya Ekim");
        }
        if (ilkHarf == 'k' || ilkHarf == 'K') {
            System.out.println("Kasim");
        }
    }


}

