package com.leetcode.practice;

import com.algo.arraysExample.Array;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1="anagram";
        String str2="nagaram";
        System.out.println(anagramChecker(str1, str2));
    }

    private static boolean anagramChecker(String str1, String str2) {
        if(str1.length() != str2.length()) return false;
        char[] chArr1 = str1.toCharArray();
        char[] chArr2 = str2.toCharArray();
        int NO_OF_CHAR = 256;
        int[] count1 = new int[NO_OF_CHAR];
        int[] count2 = new int[NO_OF_CHAR];
        Arrays.fill(count1,0);
        Arrays.fill(count2,0);

        for(int i=0;i<chArr1.length && i<chArr2.length;i++){
            count1[chArr1[i]]++;
            count2[chArr2[i]]++;
        }
        for(int i=0;i<NO_OF_CHAR;i++){
            if(count1[i] !=count2[i]) return false;
        }
        return true;

    }
}
