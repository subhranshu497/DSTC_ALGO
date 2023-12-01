package com.browse.blind;

public class ProdOfArrayExceptSelf {
    public static void main(String[] args) {
        int [] nums = {-1,1,0,-3,3};
        int [] answer = prodArr(nums);
        for(int num : answer){
            System.out.print(num+", ");
        }
    }

    private static int[] prodArr(int[] nums) {
        int[] answer = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int prod =1;
            int j =0;
            while (j< nums.length){
                if(i !=j) prod = prod *nums[j];
                j++;
            }
            answer[i] = prod;
        }
        return answer;
    }

    private static int[] prodArrOptimized(int[] nums){
        int n = nums.length;
        int[] answer = new int[nums.length];
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        prefix[0] = 1;
        suffix[n-1] = 1;
        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1] * nums[i-1];
        }
        for(int i=n-2;i>=0;i--){
            suffix[i] = suffix[i+1]*nums[i+1];
        }
        for(int i=0;i<n;i++){
            answer[i] = prefix[i]*suffix[i];
        }
        return answer;
    }
}
