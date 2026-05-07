package Collections.LinkedList;

import java.util.*;

public class LL {
    public static void main(String[] args) {
       LinkedList<String> linkedList = new LinkedList<String>();

       linkedList.addFirst("this");
       linkedList.addLast("list");
       System.out.println(linkedList);
       System.out.println(linkedList.size());
    }
}
