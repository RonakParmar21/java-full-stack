package ReviseLinkedListDemo;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Ronak");
        list.add("Raj");
        list.add("Aditya");
        list.add("Komal");
        list.add("Sujata");

        // fetch
        String first = list.getFirst();
        String last = list.getLast();

        list.add(3, "Akshar");
        System.out.println(list);

        System.out.println("First Element : " + first);
        System.out.println("Last Element : " + last);

        // traverse linkedlist

    }
}
