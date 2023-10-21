package com.leetcode.practice;

import java.util.PriorityQueue;

public class ConstraintedSubSeqSum {
    public static void main(String[] args) {
        int[] nums = {10,-2,-10,-5,20};
        int k = 2;
        System.out.println(constrainedSubsetSum(nums, k));
    }

    public static int constrainedSubsetSum(int[] nums, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        //added the element and the index
        maxHeap.add(new int[]{nums[0], 0});
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            while (i - maxHeap.peek()[1] > k) {
                maxHeap.remove();
            }
            int current = Math.max(0, maxHeap.peek()[0]) + nums[i];
            ans = Math.max(ans, current);
            maxHeap.add(new int[]{current, i});
        }
        return ans;
    }
}
