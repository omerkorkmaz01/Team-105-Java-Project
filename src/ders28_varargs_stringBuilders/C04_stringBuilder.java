package ders28_varargs_stringBuilders;

public class C04_stringBuilder {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder(7);

        // bu kod yazildiginda java 7 karakter alabilecek bir sb olusturur

        System.out.println(sb.capacity()); // 7
        System.out.println(sb.length()); // 0

        sb.append("Java");

        System.out.println(sb); // Java
        System.out.println(sb.capacity()); // 7
        System.out.println(sb.length()); // 4

        sb.append(" guzeldir."); //

        System.out.println(sb); // Java guzeldir.
        System.out.println(sb.capacity()); // 7 *2 + 2 = 16
        System.out.println(sb.length()); // 14

        sb.append(" ona ne suphe");

        System.out.println(sb); // Java guzeldir. ona ne suphe
        System.out.println(sb.capacity()); // 34
        System.out.println(sb.length()); // 24

        // kapasite ve lenghti esitlemek istersek

        sb.trimToSize();
        System.out.println(sb.capacity()); // 27
        System.out.println(sb.length()); // 27


    }
}
