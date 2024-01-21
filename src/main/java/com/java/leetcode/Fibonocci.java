package com.java.leetcode;

public class Fibonocci {
    public static void main(String[] args) {
        // considering fibinnoci series upto 6 numbers only
        int fib = 6;
        int a =0;
        int b = 1;
        int count =2;
        while(count <= fib){
            int temp =b;
            b = b+a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }

}
