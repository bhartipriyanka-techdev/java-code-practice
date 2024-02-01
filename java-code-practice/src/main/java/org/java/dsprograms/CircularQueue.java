package org.java.dsprograms;

import java.util.Scanner;

public class CircularQueue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] queue;

    public CircularQueue(int size) {
        maxSize = size + 1; // One extra space to distinguish between full and empty conditions
        queue = new int[maxSize];
        front = rear = 0;
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }

        queue[rear] = data;
        rear = (rear + 1) % maxSize;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // Return a special value indicating an error or handle it differently based on your requirement
        }

        int data = queue[front];
        front = (front + 1) % maxSize;
        return data;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return -1; // Return a special value indicating an error or handle it differently based on your requirement
        }

        return queue[front];
    }

    public void display() {
        System.out.print("Queue: ");
        int i = front;
        while (i != rear) {
            System.out.print(queue[i] + " ");
            i = (i + 1) % maxSize;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(5);

        circularQueue.enqueue(10);
        circularQueue.enqueue(20);
        circularQueue.enqueue(30);
        circularQueue.display();

        System.out.println("Dequeue: " + circularQueue.dequeue());
        circularQueue.display();

        circularQueue.enqueue(40);
        circularQueue.enqueue(50);
        circularQueue.display();

        System.out.println("Peek: " + circularQueue.peek());
    }
}
