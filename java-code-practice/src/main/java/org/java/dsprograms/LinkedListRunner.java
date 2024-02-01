package org.java.dsprograms;

public class LinkedListRunner {
    public static void main(String[] args) {
        LinkedListImpl linkedList = new LinkedListImpl();
        linkedList.display();
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.display();
        linkedList.insertFirst(40);
        linkedList.display();
        linkedList.deleteFirst();
        linkedList.display();
        linkedList.deleteLast();
        linkedList.display();
        int count = linkedList.countNodes();
        System.out.println("Total Node Present in Linked List Is :" +count);

    }
}
