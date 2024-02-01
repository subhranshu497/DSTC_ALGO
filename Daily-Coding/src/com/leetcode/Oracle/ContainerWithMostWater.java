package com.leetcode.Oracle;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    private static int maxArea(int[] height) {
        int maxArea = 0;
        int left =0;
        int right =height.length-1;
        while(left<right){
            int y = Math.min(height[left], height[right]);
            int x = right-left;
            maxArea= Math.max(maxArea, y*x);
            if(height[left] < height[right]) left++;
            else right--;
        }
        return maxArea;
    }
}
