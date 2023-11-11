package com.leetcode.practice;

public class CountNumberofHomogenousSubstrings {
    public static void main(String[] args) {
        String s = "abbcccaa";
        System.out.println(countHomogeneous(s));
    }

    private static int countHomogeneous(String s) {
        //two pointer technique
        int left=0;
        int right = 0;
        long count = 0;

        while(right < s.length()){

            if(s.charAt(left) == s.charAt(right)){
                count = count + (right-left+1);
            }
            else{
                count = count+1;
                left = right;
            }
            right++;
        }
        return (int)(count % 1000000007);
    }
}
