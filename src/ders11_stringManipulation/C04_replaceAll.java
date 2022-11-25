package ders11_stringManipulation;

import java.sql.SQLOutput;

public class C04_replaceAll {
    public static void main(String[] args) {

        // kullanicinin girdigi metinde
        // harf disinda kalan tum karakterleri temizleyin bir kod yazin ,
        // NOT : space silinmemeli

        String input="9%H2av*(a  cok 1*guzel";

        input=input.replaceAll("\\d",""); //Javacokguzel
        input=input.replace(" ","5"); //Ja+va5cok5*guzel
        input=input.replaceAll("\\W","");
        input=input.replace("_","");
        input=input.replace("5"," "); // Java cok guzel
        input=input.replaceAll("\\s+"," ");

        System.out.println(input);
    }
}
