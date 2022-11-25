package a_deneme;

public class deneme03 {
    public static void main(String[] args) {

        //Soru : Do while döngüsü kullanarak ekrana 10 defa ‘do while dongusu’ yazdıran kod yazınız.

        String str="do while dongusu";
        int flag=0;

        do {

            System.out.println(str);
            flag--;
            System.out.println(flag);
        }while(flag<10);


        }
    }

