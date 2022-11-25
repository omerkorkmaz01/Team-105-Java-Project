package ders25_staticKeyword;

public class AHemsireRunner {

    public static void main(String[] args) {

        System.out.println(" ");

        AHemsire h1= new AHemsire();
        h1.personelIsım="Ayse";
        h1.personelAdresi="Ulus";
        h1.personelTelefon="3123425465";
        System.out.println(h1);

        System.out.println(" ");

        AHemsire h2=new AHemsire();
        System.out.println(h2);
        System.out.println(" ");
        h2.personelIsım="Hatice";
        h2.personelAdresi="Sincan";
        h2.personelTelefon="3124323232";
        h2.bashekimIsmi="Yasar Kemal";


        System.out.println("h1 : " + h1);

        System.out.println(" ");

        System.out.println("h2 : " + h2);

        System.out.println(" ");

        AHemsire h3=new AHemsire();
        System.out.println("h3 : " + h3);
        h3.hastaneIsmı="Java Hastanesi";

        System.out.println(h2.hastaneIsmı); //


    }
}
