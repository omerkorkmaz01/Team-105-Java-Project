package ders29_StringBuilder_AccessModifier;

public class C03_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb= new StringBuilder("Java ne kadar guzel");
        System.out.println(sb.substring(4)); // ne kadar güzel
        System.out.println(sb); // Java ne kadar güzeldir

        // sb=sb.substring(0,4); esitligin solu StringBuilder, sagi is STring
        //                       Java non-primitive datalarda casting yapmaz
        // Ayni not Integer, Byte ve short gibi sayi barindirannon-primitive'ler icin de gecerlidir

        // sb guzel kelimesi iceriyor mu
        /*
        StrinBuilderdan olmayan , String classından bulunan method'lari kullanmak isterseniz
        once toString() ile String'e cevirip, sonra String manipulation yapilabilir
         */

        System.out.println(sb.toString().contains("guzel")); // true

        sb.setCharAt(5,'N');
        System.out.println(sb); // Java Ne kadar guzel


    }
}
