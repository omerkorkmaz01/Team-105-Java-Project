package ders15_Overloading_whileLoop;

public class C08_WhileLoop {
    public static void main(String[] args) {

        // While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun

        int sayi=14531111;

        int birlerbasamagi=0;
        int rakamlarToplami=0;

        while(sayi!=0){

            birlerbasamagi=sayi%10;
            rakamlarToplami +=birlerbasamagi;
            sayi /=10;

        }

        System.out.println(rakamlarToplami);
    }
}
