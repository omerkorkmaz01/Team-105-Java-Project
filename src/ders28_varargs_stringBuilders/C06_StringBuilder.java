package ders28_varargs_stringBuilders;

public class C06_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb= new StringBuilder("Java Guzeldir");

        System.out.println(sb.indexOf("a")); // 1

        sb.indexOf("a",2); // 3
    }
}
