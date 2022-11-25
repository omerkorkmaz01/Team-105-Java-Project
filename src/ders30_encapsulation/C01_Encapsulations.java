package ders30_encapsulation;

public class C01_Encapsulations {

    public static void main(String[] args) {

        AencapsuleClass pers1= new AencapsuleClass();

        // pers1.hastaneIsmı = "Java Hastanesi"; private oldugu icin gorulmez

        // pers1.hastaUcreti=10000; private oldugu icin kullanılmaz

        // pers1.hemsireAdresi="Ankara"; private oldugundan ulasılamaz

        // pers1.hemsireIsmi="Yildiz Yildiz";

        System.out.println(pers1.getHastaneIsmı()); // Yildiz Hastanesi

        pers1.setHastaUcreti(500);

        // getter ve setter methodları
        // bazende erisimi sinirlandirmak icin degil
        // kullanicilarin islevi anlamasi icin kullanilir

        System.out.println(pers1.getHemsireAdresi());
        pers1.setHemsireAdresi("Istanbul");
        System.out.println(pers1.getHemsireIsmi());
    }
}
