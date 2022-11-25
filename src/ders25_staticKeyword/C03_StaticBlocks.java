package ders25_staticKeyword;

public class C03_StaticBlocks {

    static {
        System.out.println("1.static blok calisti");
    }

    static {
        System.out.println("2.static blok calisti ");
    }

    public static void main(String[] args) {
        System.out.println("1.main method calisti");

    }

    static {
        System.out.println("3.static blok calisti");
    }

}
