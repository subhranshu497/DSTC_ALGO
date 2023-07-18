package com.leetcode.practice;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        twoSumMethod(nums, target);
    }
    public static int[] twoSumMethod(int[] nums, int target) {
        int result[] = new int[2];
        int i;
        int j;
        int sum;
        boolean flag = false;
        for (i = 0; i < nums.length; i++) {
            for (j = 0; i!=j && j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if (sum == target) {
                    System.out.println("Indexes are " + i + " ," + j);
                    result[0] = i;
                    result[1] = j;
                    flag = true;
                    break;
                }
            }
            if(flag){
                break;
            }
        }
        return result;
    }
    }
