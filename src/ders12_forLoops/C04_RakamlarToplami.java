package ders12_forLoops;

public class C04_RakamlarToplami {
    public static void main(String[] args) {

        //kullanicinin verdigi sayinin rakamlar toplamini bulun

        int sayi=9999999;
        String sayiStr=""+sayi;

        int birlerBasamagi= 0;
        int rakamlarToplami=0;

        for (int i = 1; i <=sayiStr.length() ; i++) {

            birlerBasamagi=sayi%10;
            rakamlarToplami=rakamlarToplami+birlerBasamagi;
            sayi=sayi/10;
        }

        System.out.println(rakamlarToplami);

    }
}
