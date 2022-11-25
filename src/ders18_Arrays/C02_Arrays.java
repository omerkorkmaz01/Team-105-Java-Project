package ders18_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        String [] arr={"Ali", "Ulus", "Nesrin"};

        // bu array'in tum elementlerin aralarinda bir bosluk birakarak yazdiralim

        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i] + " ");

        }

        //bu array'i array olarak yazdiralim

        System.out.println(arr); // [Ljava.lang.String;@378bf509
        // aray bir obje / non-primitive data oldugundan java referansini yazdirir
        // array'İ array olarak yazdirmak isterseniz arrays class'indan yardim almalisiniz

        System.out.println(Arrays.toString(arr)); // [Ali, Ulus, Nesrin]

    }
}
