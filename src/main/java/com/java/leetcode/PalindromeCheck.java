package com.java.leetcode;

public class PalindromeCheck {
    public static void main(String[] args) {
        String isPalindrome = "daaesad";
        System.out.println(isPalindrome(isPalindrome));
    }

    static boolean isPalindrome(String input) {
        if (input == null || input.length() == 0) {
            return true;
        }
        input = input.toLowerCase();
        for (int i = 0; i < input.length() / 2; i++) {
            char start = input.charAt(i);
            char end = input.charAt(input.length() - 1 - i);
            if (start != end) {
                return false;
            }
        }
        return true;
    }
}
