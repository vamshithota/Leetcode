package com.junit.tests;
import com.java.leetcode.TwoSum;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {

    @Test
    public void testTwoSum(){

      // setting up test data
      // Test case 1
      int[] nums1= {2,7,11,15};
      int target =9;
      int[] expectedResult = {1,0};
      assertArrayEquals(expectedResult, TwoSum.twoSum(nums1,target));
      // Test case 1
        int[] nums2 = {3,2,4};
        int target2 = 6;
        int[] expectedResult2 = {2,1};
        assertArrayEquals(expectedResult2, TwoSum.twoSum(nums2,target2));


    }

}
