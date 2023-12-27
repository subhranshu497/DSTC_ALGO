package com.leetcode.practice.jpmc;

public class LongestPallindromicSubstring {

    public static void main(String[] args) {
        String s ="babad";
        //System.out.println(checkPalli("hasnnah"));
        System.out.println(longestPalliSub(s));
    }

    private static String longestPalliSub(String s) {
        //in optimistic way first send the entire substring for pallindrome check and if false
        // then send the substring
        int n = s.length();
        for(int length = n;length >0;length--){
            for(int start=0;start<=n-length;start++){
                String sub = s.substring(start,start+length);
                if(checkPalli(sub)) return sub;
            }
        }
        return null;
    }
    private static boolean checkPalli(String s){
        int n = s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i) != s.charAt(n-1-i)) return false;
        }
        return true;
    }
}
