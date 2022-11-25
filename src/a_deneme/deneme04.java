package a_deneme;

public class deneme04 {
    public static void main(String[] args) {

        //Soru 1- ’k’ harfinden ‘t’ harfine kadar harfleri yazdirin

        char bas='k';
        String toplam="";

        do {
            toplam+=","+bas;
            bas++;

        }while (bas<='t');
        System.out.println(toplam);

        }
    }

