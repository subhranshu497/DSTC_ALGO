package com.leetcode.practice;

public class FindLCM {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 =10;
        System.out.println(findLCMOfNum(num1, num2));
    }

    private static int findLCMOfNum(int num1, int num2) {
        if(num1<0 || num2<0) return -1;
        if (num1 == 0 || num2 == 0) return 0;
        int max = Math.max(num1, num2);
        int lcm = max;
        while(true){
            boolean flag = max %num1 ==0 && max %num2 ==0;
            if(flag) return max;
            else{
                max +=lcm;
            }
        }
    }
}
