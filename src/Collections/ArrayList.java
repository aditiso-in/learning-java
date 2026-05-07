package Collections;

import java.util.Collections;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<String> arrayList = new java.util.ArrayList<>();

        //add into list
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        //get the data from list
        String getElement = arrayList.get(0);
        System.out.println(getElement);

        //set data in between
        arrayList.set(1,"Kiwi");
        System.out.println(arrayList);

        //add in between
        arrayList.add(1, "Banana");
        System.out.println(arrayList);

        //know the size
        int count = arrayList.size();
        System.out.println(count);

        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
    
}
