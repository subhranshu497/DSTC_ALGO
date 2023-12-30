package com.leetcode.practice.jpmc;

public class CountNumberOfUniqueDigits {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(countNumbersWithUniqueDigits(n));
    }

    private static int countNumbersWithUniqueDigits(int n) {
        if(n==0) return 1;
        int res = 10;
        int availNum = 9;
        int uniqueNum = 9;
        while (n-- > 1 && availNum >0){
            uniqueNum = availNum * uniqueNum;
            res += uniqueNum;
            availNum--;
        }
        return res;
    }
}
