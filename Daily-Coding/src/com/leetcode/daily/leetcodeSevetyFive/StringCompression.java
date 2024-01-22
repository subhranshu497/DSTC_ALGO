package com.leetcode.daily.leetcodeSevetyFive;

import java.util.*;

public class StringCompression {
    public static void main(String[] args) {
        char [] chars = {'a','a','b','b','c','c','c'};
        System.out.println(compress(chars));
    }

    private static int compress(char[] chars) {
        int slow =0 ,result=0;
        while(slow<chars.length){
            int fast =1;
            while(slow+fast < chars.length && chars[slow+fast] ==chars[slow]) {
                fast++;
            }
            chars[result++] = chars[slow];
            if(fast>1){
                    for(char digit:Integer.toString(fast).toCharArray()){
                        chars[slow] = digit;
                        slow++;
                    }
                    slow +=fast;
                }
        }
        return result;
    }
}
