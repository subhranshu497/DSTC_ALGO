package com.leetcode.daily.leetcodeSevetyFive;

public class IncreasingTripletSubsequence {
    public static void main(String[] args) {
        int nums[] = {2,1,5,0,4,6};
        System.out.println(increasingTriplet(nums));
    }

    private static boolean increasingTriplet(int[] nums) {
        int firstNum = Integer.MAX_VALUE;
        int secondNum = Integer.MAX_VALUE;
        for(int num:nums){
            if(num<=firstNum) firstNum = num;
            else if(num<=secondNum) secondNum = num;
            else return  true;
        }
        return false;
    }
}
