package com.leetcode.practice;

public class IndexOfOccurrence {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle ="ssd";
        int index = strStr(haystack, needle);
        if(index !=0) System.out.println("haystack doesnot have needle");
        else System.out.println("haystack has needle");
    }

    private static int strStr(String haystack, String needle) {
        if(haystack.contains(needle)) return haystack.indexOf(needle);
        return -1;
    }
}
