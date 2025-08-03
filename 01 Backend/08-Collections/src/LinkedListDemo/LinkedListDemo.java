package LinkedListDemo;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Raj");
        linkedList.add("Simran");
        linkedList.add("Aditya");
        linkedList.add("Komal");
        linkedList.add("Rohit");

        // fetch
        String firstElem = linkedList.getFirst();
        String lastElem = linkedList.getLast();

        System.out.println("First element is : " + firstElem);
        System.out.println("Last element is : " + lastElem);

        // traverse linked list
        for (int i = 0; i < 5; i++) {
            System.out.println(linkedList.get(3));
        }
    }
}
