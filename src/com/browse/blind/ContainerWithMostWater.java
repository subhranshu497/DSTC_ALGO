package com.browse.blind;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(calculateArea(height));
    }

    private static int calculateArea(int[] height) {
        int i =0;
        int j =height.length-1;
        int area = 0;
        while(i<j){
            int diff = j-i;
            int min = Math.min(height[i], height[j]);
            area = Math.max(diff*min, area);
            if(height[i]<height[j]) i++;
            else if(height[i]>=height[j]) j--;
        }
        return area;
    }
}
