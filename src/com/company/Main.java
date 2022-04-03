package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Stack<Integer> stack=new Stack<>();
        Scanner scanner=new Scanner(System.in);
//        System.out.println("Nhap so phan tu:  ");
//        int num=scanner.nextInt();
//        for (int i=0;i<num;i++) {
//            stack.push(i);
//        }
//System.out.println(stack);
//
//        Stack<Integer> stack1=new Stack<>();
//        for (int j=0;j<num;j++){
//            int a=stack.pop();
//            stack1.push(a);
//        }
//        System.out.println(stack1);
        Stack stack=new Stack<>();
        System.out.println("Nhap chuoi can dao nguoc: ");
        String chuoi=scanner.next();
        int n=chuoi.length();
        for (int i=0;i< n;i++){
            stack.push(chuoi.charAt(i));
        }
        System.out.println(stack);
        String ch="";
        for (int j=0;j<n;j++){
           ch+=stack.pop();
        }
        System.out.println(ch);
    }
}
