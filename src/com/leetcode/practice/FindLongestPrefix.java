package com.leetcode.practice;

public class FindLongestPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        longestPrefixChecker(strs);
    }

    private static String longestPrefixChecker(String[] strs) {
        //assume first element of the string array is the longest prefix
        String prefix =strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix) !=0){
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        System.out.println("Longest fix is "+ prefix);
        return prefix;
    }
}
