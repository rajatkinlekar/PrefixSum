package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {4, 6, 2, 8, 2};
        int[] prefix = new Main().getPrefixSumArray(nums);
        System.out.println(Arrays.toString(prefix));
    }

    public int[] getPrefixSumArray(int[] nums) {
        int[] prefixSum = new int[nums.length + 1];
        prefixSum[0] = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            prefixSum[i + 1] = sum;
        }

        return prefixSum;
    }


}