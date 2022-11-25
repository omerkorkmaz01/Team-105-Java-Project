package ders11_stringManipulation;

public class C02_replace {
    public static void main(String[] args) {

        String str="Java Candir";

        System.out.println(str.replace('a','A')); // JAvA CAndir

        System.out.println(str.replace(' ', '_')); // Java_Candir

        System.out.println(str.replace("candir","cok guzeldir")); // Java Candir

        System.out.println(str.replace(" ","")); // JavaCandir

        // String'deki tum agalari silin
        System.out.println(str.replace("a",""));
        // Jv Cndir

        // Java yerine hava, candir yerine cok guzel yazdiralim

        System.out.println(str.replace("Java","Hava" )
                           .replace("Candir", "cok guzel"));

        System.out.println(str.replace("","_"));
        //_J_a_v_a_ _C_a_n_d_i_r_


        // sadece 1. a'yi A yapin
        System.out.println(str.replaceFirst("a", "a_deneme")); //JAva Candir




    }
}
