package ders37_exceptions;

public class C02_ClassCastException {
    public static void main(String[] args) {

        short sayi1= 23;
        int   sayi2= sayi1;

        Short sayi3=24;
        // Integer sayi4=sayi3; Integer ve Short parent-child iliskisni olmadıgından
        // birbirine atama yapamazsınız

        // aralarinda parent-child iliskisi olan class'lardan olusan objeler icin
        // auto-widening veya excilipt- narrowing mumkundur

        Object obj=sayi3;
        System.out.println("Shortdan objeye cast edince : " +obj);

        Integer sayi5= (Integer) obj;

        System.out.println("Short datayi obje uzerinde Integer'a cevirme : " +sayi5);
        //ClassCastException

    }
}
