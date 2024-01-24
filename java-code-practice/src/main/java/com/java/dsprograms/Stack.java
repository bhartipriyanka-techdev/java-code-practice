package com.java.dsprograms;

import java.util.Scanner;

public class Stack {
    static int[] stack;
    static int top = -1;
    static void createStack(int size){
        stack = new int[size];
        top = -1;
        System.out.println("Stack had been created with size : "+size);
    }
    private static void push(int data) {
        if (top == stack.length){
            System.out.println("Stack OverFlow....!");
        }
        else{
            top++;
            stack[top] = data;
            System.out.println(data +" "+ "Data is Added Successfully......!!");
        }
    }
    static void display(){
        System.out.println("------Element of Stack--------");
        if(top == -1){
            System.out.println("Stack is Empty.....!!");
        }
        else{
            for(int i = top ; i>=0; i-- ){
                System.out.print(stack[i] +" ");
            }
        }

    }
    static  boolean isEmpty()
    {
      return top == -1;
    }

    static  boolean isFull()
    {
        return top == stack.length-1;
    }
    private  static  void pop(){
        if(top == -1){
            System.out.println("Stack UnderFlow.....!!");
        }
        else{
            System.out.println(stack[top] +" Data is Deleted successfully....!");
            stack[top]  = 0;
            top--;
        }
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of Stack :");
        int size = scanner.nextInt();
        //Stack Created
        createStack(size);

        //Calling Push
        System.out.println("Adding Data In Stack");
        for(int i =0 ;i<= size-1; i++){
            int data= scanner.nextInt();
            push(data);
        }

        //Calling pop
         pop();

        //Calling display
        display();

        isEmpty();

        isFull();
    }
}
