package com.java.dsprograms;

import java.util.Scanner;

public class CheckBalanceBracket {
    static  char[] stack;
    static int top = -1;
    static void push(char data){
        top++;
        stack[top] = data;
    }
    static  void pop(){
        top--;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Brackets :");
        String str =scanner.next();
        stack = new char[str.length()];
        boolean flag = true;
        for(int i = 0; i < str.length() ; i++){
            if(str.charAt(i) == '('){
                push('(');
            }
            else if(str.charAt(i) == ')' && top != -1){
                pop();
            }
            else{
                flag = false;
                break;
            }
        }
        if(top == -1 && flag == true){
            System.out.println("It's Balance");
        }
        else{
            System.out.println("Not Balance");
        }
    }
}
