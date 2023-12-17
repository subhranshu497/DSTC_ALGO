package com.browse.blind;

import java.util.HashMap;
import java.util.Map;

public class MaxNonRepeatChar {
    public static void main(String[] args) {
        String s = "AABAA";
        int k =1;
        System.out.println(CharReplacement(s, k));
    }

    private static int CharReplacement(String s, int k) {
        int left =0;
        int len = s.length();
        int maxLen = 0;
        int maxRepeatCount =0;
        Map<Character, Integer> map1 = new HashMap<>();
        for(int right =0;right <len;right++){
            char curr = s.charAt(right);
            map1.put(curr, map1.getOrDefault(curr,0)+1);
            maxRepeatCount = Math.max(maxRepeatCount, map1.get(curr));
            int nonRepeat = (right-left+1)-maxRepeatCount;
            if(nonRepeat >k){
                map1.put(s.charAt(left),map1.get(s.charAt(left))-1);
                left++;
            }
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
}
