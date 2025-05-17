package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {4, 6, 2, 8, 2};
        int[] prefix = new Main().getPrefixSumArray(nums);
        System.out.println(Arrays.toString(prefix));
        System.out.println(new Main().getSumOfRange(nums, 1, 4));
    }

    public int[] getPrefixSumArray(int[] nums) {
        int[] prefixSum = new int[nums.length + 1];
        prefixSum[0] = 0;


        for (int i = 0; i < nums.length; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }

        return prefixSum;
    }

    public int getSumOfRange(int[] nums, int left, int right) {
        if (left < 0 || right > nums.length) {
            throw new RuntimeException("left or right pointers are incorrect");
        }

        // get prefix sum array
        int[] prefix = this.getPrefixSumArray(nums);

        return prefix[right + 1] - prefix[left];
    }


}