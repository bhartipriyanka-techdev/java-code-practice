package org.java.dsprograms;

public class LinkedListImpl {
    private Node head;

    public void insert(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = newNode;
        }
        System.out.println(value + " is added successfully to the LinkedList.");
    }

    public void display() {
        if (head == null) {
            System.out.println("No linked list created.");
        } else {
            System.out.println("___________Linked List Data--------------");
            Node tmp = head;
            while (tmp != null) {
                System.out.println(tmp.data);
                tmp = tmp.next;
            }
        }
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        System.out.println(data + " is added successfully to the LinkedList.");
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("Linked list is not created.");
        } else {
            head = head.next;
            System.out.println("Node is deleted.");
        }
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("Linked list is empty.");
        } else if (head.next == null) {
            System.out.println("Node has been deleted.");
            head = null;
        } else {
            Node tmp = head;
            while (tmp.next.next != null) {
                tmp = tmp.next;
            }
            System.out.println("Node has been deleted.");
            tmp.next = null;
        }
    }

    public int countNodes() {
        int count = 0;
        Node tmp = head;
        while (tmp != null) {
            count++;
            tmp = tmp.next;
        }
        return count;
    }
}
