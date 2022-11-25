package ders06_IfElseStatments;

public class C06_IfElseStatements {
    public static void main(String[] args) {

        /*
        if else statement'da { } kullanmazsak
        hem if body'si hem else body'si icin satir kabul eder

        sonraki satirlar if-else ile ilişkilendirilmez
        her durumda calisir
         */

        int not=49;

        if (not>=50) {
            System.out.println("sinifi gectin");
            System.out.println("Yazin kafan rahat");

        } else {
            System.out.println("Bu dersten kaldin");
            System.out.println("Yaz okuluna bekleriz :) ");
        }
    }
}
