package Collections;

import java.util.Iterator;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<String> arrayList = new java.util.ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
}
