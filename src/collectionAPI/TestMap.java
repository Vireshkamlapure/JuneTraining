package collectionAPI;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class TestMap {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put(10,"a");
        hashMap.put(1900,"b");
        hashMap.put(110,"c");
        hashMap.put(30,"d");

        System.out.println(hashMap);

        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(10,"a");


    }
}
