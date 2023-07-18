package com.leetcode.practice;

public class PallindromeChecker {
    public static void main(String[] args) {
        int x = -121;
        pallindrome(x);
    }

    private static boolean pallindrome(int num) {
        int originalNum = num;
        boolean flag = false;
        int reminder;
        int reverseNum = 0;
        if (num < 0) {
            System.out.println("Not pallindrome");
        } else {
            while (num != 0) {
                reminder = num % 10;
                reverseNum = reverseNum * 10 + reminder;
                num = num / 10;
            }
            if (originalNum == reverseNum) {
                System.out.println("num is pallindrome");
                return true;
            }
        }
        return false;
    }
}
