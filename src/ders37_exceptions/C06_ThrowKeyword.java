package ders37_exceptions;

import java.util.Scanner;

public class C06_ThrowKeyword {
    public static void main(String[] args) {

        // kullanicidsan yasini isteyin
        // eger 0 veya negatif bir sayi girerse
        // uayri olarak IllegalArgumentException uyarisi verin
        // ancak kodumuz normal calismya devam etsin


        Scanner scan=new Scanner(System.in);
        System.out.println("LUtfen yasinizi giriniz");
        int yas=scan.nextInt();

        try {
            if (yas<=0){
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
           e.printStackTrace();
            System.out.println("Yas 0 veya negatif olamaz");
        }
    }
}
