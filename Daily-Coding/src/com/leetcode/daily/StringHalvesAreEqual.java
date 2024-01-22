package com.leetcode.daily;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Leetcode 1704
public class StringHalvesAreEqual {
    public static void main(String[] args) {
        String s = "bOok";
        System.out.println(halvesAreAlike(s));

    }
    private static boolean halvesAreAlike(String str) {
        String s = str.toLowerCase();
        List<Character> vowels = List.of('a', 'e','i','o','u');
        int n = s.length()/2;
        int left =0;
        int right = s.length()-1;
        int count1 =0;
        int count2 = 0;
        while(left<n && right >=n){
            if(vowels.contains(s.charAt(left)))count1++;
            if(vowels.contains(s.charAt(right)))count2++;
            left++;
            right--;
        }
        return count1==count2;
    }
}
