package com.leetcode.practice;

public class MinimumTimeToMakeRopeColorful {
    public static void main(String[] args) {
        int[] neededTime = {1,2,3,4,5};
        String colors = "abaac";
        System.out.println(minCost(neededTime, colors));
    }

    private static int minCost(int[] neededTime, String colors) {
        char[] charArr = colors.toCharArray();
        int totalTime =0;
        int currentTime=0;
        for(int i=0;i<colors.length();i++){
            if(i>0 && charArr[i] !=charArr[i-1]){
                currentTime =0;
            }
            totalTime +=Math.min(currentTime,neededTime[i]);
            currentTime = Math.max(currentTime, neededTime[i]);
        }
        return totalTime;
    }
}
