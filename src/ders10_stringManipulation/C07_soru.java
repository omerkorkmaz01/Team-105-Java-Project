package ders10_stringManipulation;

public class C07_soru {
    public static void main(String[] args) {

        /*
        kullanicidan bir cumle ve bir metin alin
        cumlede metnin durumuna gore
        1- cumle metni icermiyor
        2- cumle meetni sadece 1 kere iceriyor
        3- cumle metni birden faz iceriyor
        seceneklerden uygun olani yazdirin
         */

        String cumle= "Java cok guzeldir cok";
        String metin="cok";

        if (!cumle.contains(metin)) {
            System.out.println("cumle metni icermiyor");
        }else{
            int ilkIndex= cumle.indexOf(metin);//5

            int ikinciİndex=cumle.indexOf(metin,ilkIndex+1);// ya -1 yada bir index

            if (ikinciİndex==-1) {
                System.out.println("cumle meetni sadece 1 kere iceriyor");
            }else{
                System.out.println(" cumle metni birden faz iceriyor");

            }

        }


    }
}
