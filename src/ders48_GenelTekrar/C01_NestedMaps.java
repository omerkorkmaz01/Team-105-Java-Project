package ders48_GenelTekrar;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.SplittableRandom;

public class C01_NestedMaps {

    public static void main(String[] args) {

        Map<String, Object> bookingDatesMap = new HashMap<>();
        bookingDatesMap.put("checkIn","2021-06-01");
        bookingDatesMap.put("checkOut","2021-06-10");

        Map<String,Object> requestBodyMap= new HashMap<>();
        requestBodyMap.put("firstname","Ahmet");
        requestBodyMap.put("lastname","Bulut");
        requestBodyMap.put("totalprice", 500);
        requestBodyMap.put("depositpaid", false);
        requestBodyMap.put("bookingdates",bookingDatesMap);
        requestBodyMap.put("additionalneeds","Wi-fi");

        System.out.println(requestBodyMap.get("bookingdates"));

        System.out.println(((Map) (requestBodyMap.get("bookingdates"))).get("checkIn"));
    }
}
