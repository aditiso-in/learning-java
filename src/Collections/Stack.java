package Collections;
import java.util.Iterator;


public class Stack {
    public static void main(String[] args) {
        java.util.Stack<String> stack = new java.util.Stack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        for (String fruit : stack) {
            System.out.println(fruit);
        }

        Iterator<String> iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());  
        }

    }
    
}
