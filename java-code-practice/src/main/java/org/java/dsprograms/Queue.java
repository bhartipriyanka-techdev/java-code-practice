package org.java.dsprograms;

import java.util.Scanner;

public class Queue {
        static int front,rear ;
        static int[] queue;

        static void createQueue(int size){
            queue = new int[size];
            front =0;
            rear = 0;

            System.out.println("Queue had been created with size : "+size);
        }
        static void enqueue(int data){
            if ( rear== queue.length){
                System.out.println("Queue Full....!");
            }
            else{
                queue[rear] = data;
                rear++;
                System.out.println(data +" "+ "Data is Added Successfully......!!");
            }
        }
        static void dequeue(){
            //rear ==  front
            if(rear == 0){
                System.out.println("Queue is Empty");
            }
            else{
                System.out.println("\nData Deletion\n");
                System.out.println(queue[front] +" Data is Deleted successfully....!");
                for(int i =0 ; i<= rear-1; i++){
                    queue[i] = queue[i+1];
                }
                rear --;

            }
        }

            static  void displayQueue(){
                if(rear == 0){
                    System.out.println("Queue is Empty");
                }
                else{
                    System.out.println("\nDisplaying Data of Queue\n");
                    for(int i = 0 ; i <= rear-1 ; i++){
                        System.out.println(queue[i]);
                    }
                }
            }



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter size of Stack :");
            int size = scanner.nextInt();
            //Stack Created
            createQueue(size);

            System.out.print(" Data Adding in queue\n");
            //int data = 10;
            enqueue(10);
            enqueue(20);
            enqueue(30);
            enqueue(40);
            //Calling removing
            dequeue();

            //Calling Display
            displayQueue();



        }
}
