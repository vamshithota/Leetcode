package com.java.leetcode;

import java.util.Arrays;

public class ConcatenateArray {

    // Leetcode 1929. Concatenation of Array
    public static void main(String[] args) {
        int ar[] ={1,2,3};
        System.out.println(Arrays.toString(getConcatenation(ar)));
    }

    public static int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];
        int length = nums.length;
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
            result[length + i] = nums[i];
        }
        return result;
    }
}


