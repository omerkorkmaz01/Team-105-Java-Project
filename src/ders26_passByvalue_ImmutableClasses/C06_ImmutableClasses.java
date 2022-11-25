package ders26_passByvalue_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C06_ImmutableClasses {
    public static void main(String[] args) {

        String str = "Java guzeldir";
        System.out.println(str.toUpperCase()); // JAVA GUZELDIR

        System.out.println(str); // Java guzeldir

        str.toLowerCase();
        System.out.println(str); // Java guzeldir


        // String ımmutable oldugu icin method ile yapilan degisikler Stringi kalci degistirmez

        List<String> harfler= new ArrayList<>();
        harfler.add("A");
        harfler.add("B");
        harfler.remove(0);

        System.out.println(harfler);

        // List ve Array mutable olduklari icin method ile yapılan degisiklikler kalici olur

    }
}
