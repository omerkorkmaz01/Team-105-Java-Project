package ders18_Arrays;

public class C07_EnKisa_EnUzunKelime {
    public static void main(String[] args) {

        // Soru 6- Verilen String bir array’deki
        // en uzun ve en kisa kelimeleri yazdiran
        // bir method olusturun.

        String[] arr={"Hasan", "İlker", "Senturk","Omer Faruk"};
        enUzunEnKisaIsimleriYazdir(arr);

        }

        public static void enUzunEnKisaIsimleriYazdir(String[] arr){

        String enuzunKelime=arr[0];
        String enkisaKelime=arr[0];

            for (int i = 1; i < arr.length; i++) {

                if (arr[i].length()>enuzunKelime.length()){
                    enuzunKelime=arr[i];

                }

                if (arr[i].length()<enkisaKelime.length()){
                    enkisaKelime=arr[i];

                }
            }

            System.out.println("En uzun isim : "+ enuzunKelime);
            System.out.println("En kisa isim : "+ enkisaKelime);
        }
    }

