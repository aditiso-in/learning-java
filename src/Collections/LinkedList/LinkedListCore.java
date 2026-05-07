package Collections.LinkedList;

public class LinkedListCore {

    Node head;
    int size;

    LinkedListCore() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        public Node (String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //add first el

    public void addFirst(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    //add last el

    public void addLast(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            size++;
        }
    

        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;

    }

    //print the list

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
            
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println(currentNode.data);
    }

    //delete first el

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            size--;
            return;
        }

        head = head.next;
    }

    //delete last el

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        size--;

        if (head.next == null) { // in case of List has only one element
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    //return size of list
    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        LinkedListCore linkedList = new LinkedListCore();
        linkedList.addFirst("a");
        linkedList.addFirst("is");
        linkedList.printList();
        linkedList.addFirst("this");

        linkedList.addLast("list");
        linkedList.printList();
        linkedList.deleteFirst();
        linkedList.printList();
        linkedList.deleteLast();
        linkedList.printList();
        System.out.println("Size of the list: " + linkedList.getSize());
        linkedList.addFirst("this");
        System.out.println("Size of the list: " + linkedList.getSize());
    }
}
