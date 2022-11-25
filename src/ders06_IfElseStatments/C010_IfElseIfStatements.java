package ders06_IfElseStatments;

public class C010_IfElseIfStatements {
    public static void main(String[] args) {

        //SORU-1 Kullanicidan cinsiyetini ve yasini alin, kadin 60 yas ve uzeri
        //Erkek 65 yas ve uzeri emekli olabilir
        //Cinsiyet ve yasini dikkate alarak
        //"Emekli olabilirsin" veya "Emekli olmak icin.. yil daha calisman gerekit" yazdirin

        char cinsiyet='K';
        int yas=60;

        if (cinsiyet=='E' && yas==65){
            System.out.println("emekli olabilirsin");
        }else if (cinsiyet=='E' && yas<65 && yas>15){
            System.out.println("emekli olmak icin daha" + (65-yas) + "sene calismalisin");
        }else if (cinsiyet=='K' && yas>=60){
            System.out.println("Emekli olabilirsin");
        }else if (cinsiyet=='K' && yas<60 && yas>15) {
            System.out.println("Emekli olmak icin daha" + (60-yas) + "sene calismalisin");
        }else{
            System.out.println("gecersiz giris");


        }



    }
}
