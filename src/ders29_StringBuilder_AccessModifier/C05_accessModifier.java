package ders29_StringBuilder_AccessModifier;

public class C05_accessModifier {
    public static void main(String[] args) {

        C04_accessModifier obj= new C04_accessModifier();
        obj.isim="tugay";
        System.out.println(obj.isim); // tugay
        // obj.sayi=20;  private variable'lara baska class'dan ulasilamaz

        C04_accessModifier obj2= new C04_accessModifier();
        System.out.println(obj2.isim); // ali

    }
}
