package Collections;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new java.util.HashMap<>();
        hashMap.put(1, "Apple");
        hashMap.put(2, "Banana");
        hashMap.put(3, "Cherry");

        for (Map.Entry<Integer,String> entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    
}
