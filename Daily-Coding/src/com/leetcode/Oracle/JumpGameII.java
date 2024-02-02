package com.leetcode.Oracle;

public class JumpGameII {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(jump(nums));
    }

    private static int jump(int[] nums) {
        int totalCount = 0;
        int destination = nums.length -1;
        int coverage =0;
        int lastJumpIndex = 0;
        if(nums.length == 1) return 0;
        for(int i=0;i< nums.length;i++){
            coverage = Math.max(coverage, i+nums[i]); // 2
            if(i==lastJumpIndex){ // true
                totalCount++;
                lastJumpIndex = coverage;
            }
            if(lastJumpIndex >= destination){
                return totalCount;
            }
        }
        return totalCount;
    }
}
