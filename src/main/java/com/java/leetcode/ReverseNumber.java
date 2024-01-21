package com.java.leetcode;

public class ReverseNumber {
    public static void main(String[] args) {
        // reverse n
        int num = 654321;
        int ans =0;
        while(num > 0){
            int rem = num %10;
            num /= 10;
            ans = ans *10 +rem;
        }
        System.out.println(ans);
    }
}
