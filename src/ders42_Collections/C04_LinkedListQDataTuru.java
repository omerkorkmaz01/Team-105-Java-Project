package ders42_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedListQDataTuru {
    public static void main(String[] args) {

        Queue<String> q1= new LinkedList<>();

        q1.add("H");
        q1.add("Y"); // [H, Y]
        q1.offer("K"); // [H, Y, K]

        // kapasite sinirlmasi yapmadiginiz surece add() ile ayni islemi yapar

        System.out.println(q1.remove()); // H
        // Queue eklemeyi sona yapip, kullanmayi bastan yaptigi icin
        // parametre girmedigimizde bastaki elemani remove eder ve bize dondurur

        System.out.println(q1.remove("K")); // true

        // q1.remove(); // bos queue kaldi []

        // q1.remove(); // queue bos oldugundan NoSuchElementException

        System.out.println(q1.poll()); // null, Y
        // q1.poll(9 remove ile ayni islemi yapar yani bastaki elementi siler ve bize dondurur
        // aralarindaki fark bos queue'da calistirildiklarinda
        // remove exception firlatirken, poll exception firlatmaz

        q1.add("H");
        q1.add("Y"); // [H, Y]

        System.out.println("peek : " + q1.peek());// H
        // silmeden queue'nun basindaki elementi bize getiriyor
        // eger queue bossa null getiriyor

        System.out.println("Element : " + q1.element()); // Element : H


        q1.clear(); // queue'yu bosalttik

        System.out.println("peek : " + q1.peek());// null

        // System.out.println("Element : " + q1.element()); // NoSuchElementException

    }
}
